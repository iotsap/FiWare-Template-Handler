package com.sap.research.fiware.ngsi10.simple;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;
import java.util.logging.Logger;

import noNamespace.ContextAttribute;
import noNamespace.ContextRegistration;
import noNamespace.ContextRegistrationAttribute;
import noNamespace.ContextRegistrationAttributeList;
import noNamespace.ContextRegistrationList;
import noNamespace.EntityId;
import noNamespace.EntityIdList;
import noNamespace.RegisterContextRequest;
import noNamespace.RegisterContextRequestDocument;
import noNamespace.RegisterContextResponseDocument;
import noNamespace.StatusCode;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.xmlbeans.XmlException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import com.sap.research.fiware.ngsi10.simple.exceptions.BadRequestException;
import com.sap.research.fiware.ngsi10.simple.exceptions.ServerConnectionException;

/**
 * Registers the NGSI server as context at the broker
 * 
 * 
 * 
 */
public class RegisterContextClient {
	
	private static final Logger LOG = Logger.getLogger(RegisterContextClient.class.getName());

	private RegisterContextRequestDocument requestDoc;

	private HttpPost post;
	
	EntityId id;
	
	private String ngsiServerPublicURL;
	private URI brokerURL;

	private ContextAttribute attribute;

	/**
	 * @param attribute 
	 * @param subscription
	 *            the subscription that triggered the context notification
	 */

	public void registerContext(EntityId id, ContextAttribute attribute) throws ServerConnectionException {
		this.id = id;
		this.attribute = attribute;
		try {
			LOG.info("Trying to reach broker for context registration");
			registerContextWithoutErrorHandling();
			LOG.info("Successfully registered context at broker");
		} catch (Exception e) {
			throw new ServerConnectionException(e);
		}
	}

	/**
	 * sends the notification
	 * @param id 
	 * 
	 * @throws ServerConnectionException
	 *             the endpoint is unreachable or sent an unappropriate response
	 * @throws IOException
	 * @throws ClientProtocolException
	 * @throws BadRequestException
	 * @throws XmlException
	 * @throws URISyntaxException 
	 */
	public void registerContextWithoutErrorHandling() 
			throws ClientProtocolException, IOException, BadRequestException, XmlException, URISyntaxException {
		readProperties();
		prepareNGSIRequest();
		prepareHTTPResponse();
		createResponseBody();
		sendQuery();
	}

	private void readProperties() throws FileNotFoundException, IOException, URISyntaxException {
		Properties properties = new Properties();
		properties.load(this.getClass().getClassLoader()
                .getResourceAsStream("placeholder.properties"));
		ngsiServerPublicURL = properties.getProperty("ngsiServerPublicURL");
		brokerURL = new URI(properties.getProperty("brokerURL"));
	}

	private void prepareNGSIRequest() {
		requestDoc = RegisterContextRequestDocument.Factory.newInstance();
		RegisterContextRequest request = requestDoc.addNewRegisterContextRequest();
		ContextRegistrationList list = request.addNewContextRegistrationList();
		ContextRegistration registration = list.addNewContextRegistration();
		EntityIdList entityIDList = registration.addNewEntityIdList();
		EntityId entityID = entityIDList.addNewEntityId();
		entityID.setId(id.getId());
		entityID.setType(id.getType());
		ContextRegistrationAttributeList attributeList = registration.addNewContextRegistrationAttributeList();
		ContextRegistrationAttribute attributeElement = attributeList.addNewContextRegistrationAttribute();
		attributeElement.setIsDomain(false);
		attributeElement.setName(attribute.getName());
		registration.setProvidingApplication(ngsiServerPublicURL);
	}

	private void sendQuery() throws IOException,
			ClientProtocolException, XmlException, BadRequestException {
		HttpClient httpclient = new DefaultHttpClient();
		HttpResponse httpresponse = httpclient.execute(post);
		InputStream input = httpresponse.getEntity().getContent();
		RegisterContextResponseDocument responseDocument = RegisterContextResponseDocument.Factory.parse(input);
		if (!responseDocument.validate())
			throw new BadRequestException("Context registration response is not valid");
		StatusCode errorCode = responseDocument.getRegisterContextResponse().getErrorCode();
		if(errorCode!=null && errorCode.getCode()!=200) {
			throw new BadRequestException("Context registration response returned error code: " + errorCode.getCode());
		}
	}

	private void createResponseBody()
			throws UnsupportedEncodingException {
		StringEntity entity = new StringEntity(requestDoc.xmlText());
		post.setEntity(entity);
	}

	private void prepareHTTPResponse() {
		post = new HttpPost();
		post.addHeader("Content-Type", "application/xml");
		post.setURI(brokerURL);
	}
}
