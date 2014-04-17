package com.sap.research.fiware.ngsi10.simple.subscriptionmanagement;

import java.util.Arrays;

import com.sap.research.fiware.ngsi10.simple.wrappers.EntityIdWrapper;

import noNamespace.ContextAttribute;

/**
 * A subscription triggered by context attribute value changes
 * 
 */
public class ValueChangeSubscription extends Subscription {

	private String[] attributesFromNotifyCondition;

	public ValueChangeSubscription() {
		super();		
	}

	@Override
	public void activateTrigger() {
		//nothing happens
	}

	@Override
	public void valueUpdateReceivedFromTo(EntityIdWrapper entity, ContextAttribute oldAttribute, ContextAttribute newAttribute) {
		String oldValue = extractContextValue(oldAttribute);
		String newValue = extractContextValue(newAttribute);
		boolean valueChanged = !oldValue.equals(newValue);
		boolean entityAndAttributeMatch = entityAndAttributeMatch(entity, newAttribute);
		if(entityAndAttributeMatch && valueChanged)
			trigger();
	}

	private String extractContextValue(ContextAttribute contextAttribute) {
		String value = contextAttribute.getContextValue().toString();
		value = value.replaceAll("\\s", "");
		return value;
	}
	
	protected boolean entityAndAttributeMatch(EntityIdWrapper entity, ContextAttribute contextAttribute) {
		String contextAttributeName = contextAttribute.getName();
		boolean entityIDMatches = Arrays.asList(entityIDs).contains(entity);
		boolean contextAttributeMatches = Arrays.asList(attributesFromNotifyCondition).contains(contextAttributeName);
		return entityIDMatches && contextAttributeMatches;
	}

	public void setAttributesFromNotifyCondition(
			String[] attributesFromNotifyCondition) {
		this.attributesFromNotifyCondition = attributesFromNotifyCondition;
	}
	

}
