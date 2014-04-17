package com.sap.research.fiware.ngsi10.simple.subscriptionmanagement;

import java.util.Arrays;

import com.sap.research.fiware.ngsi10.simple.wrappers.EntityIdWrapper;

import noNamespace.ContextAttribute;

public class NoEventSubscription extends Subscription {

	@Override
	public void activateTrigger() {
		//nothing happens
	}

	@Override
	public void valueUpdateReceivedFromTo(EntityIdWrapper entity, ContextAttribute oldAttribute, ContextAttribute newAttribute) {
		if(entityAndAttributeMatch(entity, newAttribute))
			trigger();
	}
	
	protected boolean entityAndAttributeMatch(EntityIdWrapper entity, ContextAttribute contextAttribute) {
		String contextAttributeName = contextAttribute.getName();
		boolean entityIDMatches = Arrays.asList(entityIDs).contains(entity);
		boolean contextAttributeMatches = Arrays.asList(attributes).contains(contextAttributeName);
		return entityIDMatches && contextAttributeMatches;
	}

}
