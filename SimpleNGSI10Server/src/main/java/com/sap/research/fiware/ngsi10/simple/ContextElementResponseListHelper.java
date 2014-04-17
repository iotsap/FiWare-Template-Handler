package com.sap.research.fiware.ngsi10.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.sap.research.fiware.ngsi10.simple.exceptions.NotFoundException;
import com.sap.research.fiware.ngsi10.simple.persistence.DataStore;

import noNamespace.ContextAttribute;
import noNamespace.ContextAttributeList;
import noNamespace.ContextElement;
import noNamespace.ContextElementResponse;
import noNamespace.ContextElementResponseList;
import noNamespace.EntityId;
import noNamespace.StatusCode;

/**
 * Since context element response lists are needeed by query context requests and notification pushs, this is encapsulated here
 * 
 * 
 *
 */
public class ContextElementResponseListHelper {
	
	private ContextElementResponseList contextElementResponseList;
	private EntityId[] entityIDs;
	private String[] contextAttributes;

	public ContextElementResponseListHelper(ContextElementResponseList contextElementResponseList, EntityId[] entityIDs, String[] contextAttributes) {
		this.contextElementResponseList = contextElementResponseList;
		this.entityIDs = entityIDs;
		this.contextAttributes = contextAttributes;
	}
	
	public void write() {
		for(EntityId entityId : entityIDs) {
			ContextElementResponse response = responseForElement(entityId, contextElementResponseList);
			for(String attributeName : contextAttributes) {
				try {
					addAttributeValuesToResponse(entityId, attributeName, response);
				} catch (NotFoundException e) {
					response.getStatusCode().setCode(404);
				}
			}
		}
	}
	
	private void addAttributeValuesToResponse(EntityId entityId, String attributeName, ContextElementResponse response)
			throws NotFoundException {
		LinkedList<ContextAttribute> attributes = DataStore.get().get(entityId, attributeName);
		ContextElement element = response.getContextElement();
		addAttributesToElement(element, attributes);
	}

	private ContextElementResponse responseForElement(EntityId entityId, ContextElementResponseList contextElementResponseList) {
		ContextElementResponse response = contextElementResponseList.addNewContextElementResponse();
		StatusCode statusCode = response.addNewStatusCode();
		statusCode.setCode(200);
		statusCode.setReasonPhrase("OK");
		ContextElement element = response.addNewContextElement();
		element.addNewEntityId().setId(entityId.getId());
		element.addNewContextAttributeList();
		return response;
	}


	private void addAttributesToElement(ContextElement element, LinkedList<ContextAttribute> attributes) {
		List<ContextAttribute> extractedContextAttributes = extractAttributesFromElement(element);
		ArrayList<ContextAttribute> mergedAttributeList = mergeAttributeLists(attributes, extractedContextAttributes);
		writeMergedAttributeListToElement(element, mergedAttributeList);
	}

	private List<ContextAttribute> extractAttributesFromElement(
			ContextElement element) {
		ContextAttribute[] contextAttributeArray = element.getContextAttributeList().getContextAttributeArray();
		List<ContextAttribute> contextAttributes = Arrays.asList(contextAttributeArray);
		return contextAttributes;
	}

	private ArrayList<ContextAttribute> mergeAttributeLists(
			LinkedList<ContextAttribute> attributes, List<ContextAttribute> attributeList) {
		ArrayList<ContextAttribute> mergedList = new ArrayList<ContextAttribute>();
		mergedList.addAll(attributeList);
		mergedList.addAll(attributes);
		return mergedList;
	}

	private void writeMergedAttributeListToElement(ContextElement element,
			ArrayList<ContextAttribute> mergedList) {
		ContextAttributeList newList = ContextAttributeList.Factory.newInstance();
		newList.setContextAttributeArray(mergedList.toArray(new ContextAttribute[]{}));
		element.setContextAttributeList(newList);
	}

}
