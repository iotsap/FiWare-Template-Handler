package com.sap.research.fiware.ngsi10.simple;

import noNamespace.StatusCode;
import noNamespace.SubscribeContextRequest;
import noNamespace.SubscribeContextResponse;
import noNamespace.SubscribeContextResponseDocument;
import noNamespace.SubscribeResponse;

import com.sap.research.fiware.ngsi10.simple.exceptions.BadRequestException;
import com.sap.research.fiware.ngsi10.simple.exceptions.NotFoundException;
import com.sap.research.fiware.ngsi10.simple.subscriptionmanagement.Subscription;
import com.sap.research.fiware.ngsi10.simple.subscriptionmanagement.SubscriptionBuilder;
import com.sap.research.fiware.ngsi10.simple.subscriptionmanagement.SubscriptionManager;

/**
 * handler for the NGSI 'subscribeContext' operation
 * 
 *
 */
public class SubscribeContextHandler {

	private SubscribeContextRequest subscribeContextRequest;
	private SubscribeContextResponseDocument responseDocument;
	private SubscribeContextResponse response;
	private StatusCode error;
	private SubscribeResponse subscribeResponse;
	private String subscriptionID;

	/**
	 * @param subscribeContextRequest the incoming request
	 */
	public SubscribeContextHandler(SubscribeContextRequest subscribeContextRequest) {
		this.subscribeContextRequest = subscribeContextRequest;
		
	}

	/**
	 * processes the incoming request and returns a response.
	 * 
	 * In case of an problem, this is indicated within the response
	 * 
	 * @return	a valid reponse ready to be sent
	 */
	public SubscribeContextResponseDocument handle() {
		prepareResponse();
		subscribe();
		finalizeResponse();
		return responseDocument;
	}

	private void subscribe() {
		try {
			Subscription subscription = SubscriptionBuilder.build(subscribeContextRequest);
			subscriptionID = SubscriptionManager.get().add(subscription);
			setOKStatus();
		} catch (NotFoundException e) {
			setNotFoundStatus(e);
		} catch (BadRequestException e) {
			setBadRequestStatus(e);
		}
	}

	private void setBadRequestStatus(BadRequestException e) {
		error.setCode(400);
		error.setReasonPhrase(e.getMessage());
	}

	private void setNotFoundStatus(NotFoundException e) {
		error.setCode(404);
		error.setReasonPhrase(e.getMessage());
	}

	private void setOKStatus() {
		error.setCode(200);
		error.setReasonPhrase("OK");
	}

	private void finalizeResponse() {
		subscribeResponse.setSubscriptionId(subscriptionID);
	}

	private void prepareResponse() {
		responseDocument = SubscribeContextResponseDocument.Factory.newInstance();
		response = responseDocument.addNewSubscribeContextResponse();
		error = response.addNewSubscribeError().addNewErrorCode();
		subscribeResponse = response.addNewSubscribeResponse();
	}

}
