package com.sap.research.fiware.ngsi10.simple;

import noNamespace.ContextAttribute;
import noNamespace.ContextAttributeList;
import noNamespace.ContextElement;
import noNamespace.ContextElementList;
import noNamespace.ContextElementResponse;
import noNamespace.ContextElementResponseList;
import noNamespace.EntityId;
import noNamespace.StatusCode;
import noNamespace.UpdateActionType.Enum;
import noNamespace.UpdateContextRequest;
import noNamespace.UpdateContextResponse;
import noNamespace.UpdateContextResponseDocument;

import org.apache.xmlbeans.XmlString;

import com.sap.research.fiware.ngsi10.simple.exceptions.NotFoundException;
import com.sap.research.fiware.ngsi10.simple.persistence.DataStore;

/**
 * handler for the NGSI 'updateContext' operation
 * 
 *
 */
public class UpdateContextHandler {

	private UpdateContextRequest updateContextRequest;
	private UpdateContextResponseDocument respDoc;
	private UpdateContextResponse resp;
	private ContextElementList requestContextElementList;
	private ContextElementResponseList contextResponseList;
	private Enum updateAction;
	private StatusCode errorCode;

	/**
	 * @param updateContextRequest the incoming request
	 */
	public UpdateContextHandler(UpdateContextRequest updateContextRequest) {
		this.updateContextRequest = updateContextRequest;
	}

	/**
	 * processes the incoming request and returns a response.
	 * 
	 * In case of an problem, this is indicated within the response
	 * 
	 * @return	a valid reponse ready to be sent
	 */
	public UpdateContextResponseDocument handle() {
		parseRequest();
		prepareResponse();
		applyActions();
		return createReponse();
	}
	
	private void parseRequest() {
		requestContextElementList = updateContextRequest.getContextElementList();
		updateAction = updateContextRequest.getUpdateAction();
	}

	private void prepareResponse() {
		respDoc = UpdateContextResponseDocument.Factory.newInstance();
		resp = respDoc.addNewUpdateContextResponse();
		errorCode = resp.addNewErrorCode();
		contextResponseList = resp.addNewContextResponseList();
		writePositiveErrorCode();	//the error code is positive until the first error occurs
	}

	private UpdateContextResponseDocument createReponse() {
		return respDoc;
	}
	
	private void writePositiveErrorCode() {
		errorCode.setCode(200);
		errorCode.setDetails(XmlString.Factory.newValue(""));
	}
	
	private void writeEntityNotFoundErrorCode(EntityId entityId, ContextAttribute contextAttribute) {
		errorCode.setCode(404);
		String reasonPhrase = errorCode.getReasonPhrase();
		reasonPhrase += "Could not find entity with id: '" + entityId.getId()+"' or its context attribute '" + contextAttribute.getName() + "'\n";
		errorCode.setReasonPhrase(reasonPhrase);
	}

	private void applyActions() {
		for(ContextElement contextElement : requestContextElementList.getContextElementArray()) {
			EntityId entityId = contextElement.getEntityId();
			ContextAttribute[] attributes = contextElement.getContextAttributeList().getContextAttributeArray();
			for(ContextAttribute attribute : attributes) {
				applyActionWritingStatus(entityId, attribute);
			}			
		}
	}

	private void applyActionWritingStatus(EntityId entityId, ContextAttribute attribute) {
		try {
			DataStore.get().save(entityId, attribute, updateAction);
			addOKContextReponse(entityId, attribute);
		} catch (NotFoundException e) {
			addNotFoundContextReponse(entityId, attribute);
		}
	}

	private void addOKContextReponse(EntityId entityId,	ContextAttribute attribute) {
		ContextElementResponse contextElementReponse = addContextResponseElement(entityId, attribute);
		contextElementReponse.addNewStatusCode().setCode(200);
	}
	
	private void addNotFoundContextReponse(EntityId entityId, ContextAttribute contextAttribute) {
		ContextElementResponse contextElementReponse = addContextResponseElement(entityId, contextAttribute);
		contextElementReponse.addNewStatusCode().setCode(404);
		writeEntityNotFoundErrorCode(entityId, contextAttribute);
	}

	private ContextElementResponse addContextResponseElement(EntityId entityId, ContextAttribute attribute) {
		ContextElementResponse contextElementReponse = getOrCreateContextElementResponseForEntityId(entityId);
		ContextAttributeList contextAttributeList = contextElementReponse.getContextElement().getContextAttributeList();
		ContextAttribute attributeInList = contextAttributeList.addNewContextAttribute();
		copyAttributeValuesFromTo(attribute, attributeInList);
		return contextElementReponse;
	}
	
	private ContextElementResponse getOrCreateContextElementResponseForEntityId(EntityId entityId) {
		for(ContextElementResponse contextElementResponse : contextResponseList.getContextElementResponseArray()) {
			if(contextElementResponse.getContextElement().getEntityId().equals(entityId))
				return contextElementResponse;
		}
		ContextElementResponse contextElementReponse = createContextElementResponseForEntityId(entityId);
		return contextElementReponse;
	}

	private ContextElementResponse createContextElementResponseForEntityId(EntityId entityId) {
		ContextElementResponse contextElementReponse = contextResponseList.addNewContextElementResponse();
		ContextElement contextElement = contextElementReponse.addNewContextElement();
		contextElement.setEntityId(entityId);
		contextElement.addNewContextAttributeList();
		return contextElementReponse;
	}

	//a great THANK YOU to the xml beans generated classes
	private void copyAttributeValuesFromTo(ContextAttribute sourceAttribute, ContextAttribute destinationAttribute) {
		destinationAttribute.setName(sourceAttribute.getName());
		destinationAttribute.setContextValue(sourceAttribute.getContextValue());
		destinationAttribute.setType(sourceAttribute.getType());
	}
}
