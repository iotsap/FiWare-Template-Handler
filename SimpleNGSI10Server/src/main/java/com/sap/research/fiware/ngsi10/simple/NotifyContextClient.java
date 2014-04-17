package com.sap.research.fiware.ngsi10.simple;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;

import noNamespace.ContextElementResponseList;
import noNamespace.EntityId;
import noNamespace.NotifyContextRequest;
import noNamespace.NotifyContextRequestDocument;
import noNamespace.NotifyContextResponseDocument;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.xmlbeans.XmlException;

import com.sap.research.fiware.ngsi10.simple.exceptions.BadRequestException;
import com.sap.research.fiware.ngsi10.simple.exceptions.ServerConnectionException;
import com.sap.research.fiware.ngsi10.simple.subscriptionmanagement.Subscription;
import com.sap.research.fiware.ngsi10.simple.wrappers.EntityIdWrapper;

/**
 * Connects to a context notification endpoint and sends a notification there
 * 
 * 
 * 
 */
public class NotifyContextClient {

	private static final Logger LOG = Logger.getLogger(NotifyContextClient.class.getName());

	private Subscription subscription;
	private NotifyContextRequest request;
	private NotifyContextRequestDocument requestDoc;

	/**
	 * @param subscription
	 *            the subscription that triggered the context notification
	 */
	public NotifyContextClient(Subscription subscription) {
		this.subscription = subscription;
	}

	public void sendNotification() throws ServerConnectionException {
		try {
			LOG.info("Trying to client for subscription " + subscription.getInfo());
			sendNotificationWithoutErrorHandling();
			LOG.info("Successfully notified client for subscription " + subscription.getInfo());
		} catch (Exception e) {
			throw new ServerConnectionException(e);
		}
	}

	/**
	 * sends the notification
	 * 
	 * @throws ServerConnectionException
	 *             the endpoint is unreachable or sent an unappropriate response
	 * @throws IOException
	 * @throws ClientProtocolException
	 * @throws BadRequestException
	 * @throws XmlException
	 */
	public void sendNotificationWithoutErrorHandling() 
			throws ClientProtocolException, IOException, BadRequestException, XmlException {
		prepareNGSIResponse();
		writeRequestedContextElements();
		HttpPost post = prepareHTTPResponse();
		createResponseBody(post);
		sendQuery(post);
	}

	private void writeRequestedContextElements() {
		ContextElementResponseList contextElementResponseList = request.addNewContextResponseList();
		EntityId[] entityIDs = unwrapEntityIDs(subscription.getEntityIDs());
		String[] contextAttributes = subscription.getAttributes();
		ContextElementResponseListHelper contextElementResponseListHelper = new ContextElementResponseListHelper(contextElementResponseList, entityIDs, contextAttributes);
		contextElementResponseListHelper.write();
	}

	private EntityId[] unwrapEntityIDs(EntityIdWrapper[] entityIDWrappers) {
		EntityId[] entityIDs = new EntityId[entityIDWrappers.length];
		for(int i = 0; i<entityIDWrappers.length; i++) {
			entityIDs[i] = entityIDWrappers[i].getEntityId();
		}
		return entityIDs;
	}

	private void prepareNGSIResponse() {
		requestDoc = NotifyContextRequestDocument.Factory.newInstance();
		request = requestDoc.addNewNotifyContextRequest();
		String subscriptionID = subscription.getSubscriptionID();
		request.setSubscriptionId(subscriptionID);
		request.setOriginator(subscriptionID);
	}

	private void sendQuery(HttpPost post) throws IOException,
			ClientProtocolException, XmlException, BadRequestException {
		HttpClient httpclient = new DefaultHttpClient();
		HttpResponse httpresponse = httpclient.execute(post);
		InputStream input = httpresponse.getEntity().getContent();
		NotifyContextResponseDocument responseDocument = NotifyContextResponseDocument.Factory.parse(input);
		if (!responseDocument.validate())
			throw new BadRequestException("Response from NGSI server is not valid");
	}

	private void createResponseBody(HttpPost post)
			throws UnsupportedEncodingException {
		StringEntity entity = new StringEntity("<xml-fragment>"	+ requestDoc.xmlText() + "</xml-fragment>");
		post.setEntity(entity);
	}

	private HttpPost prepareHTTPResponse() {
		HttpPost post = new HttpPost();
		post.addHeader("Content-Type", "application/xml");
		post.setURI(subscription.getReference());
		return post;
	}
}
