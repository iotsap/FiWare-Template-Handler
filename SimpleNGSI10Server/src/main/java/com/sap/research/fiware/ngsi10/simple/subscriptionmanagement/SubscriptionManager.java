package com.sap.research.fiware.ngsi10.simple.subscriptionmanagement;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import noNamespace.ContextAttribute;

import com.sap.research.fiware.ngsi10.simple.wrappers.EntityIdWrapper;

/**
 * Holds references to all subscriptions requested by NGSI clients. 
 * Manages the subscription IDs
 * Informs all subscriptions when a context attribute changed.
 * 
 * 
 */
public class SubscriptionManager {
	
	private static final Logger LOG = Logger.getLogger(SubscriptionManager.class.getName());

	private static SubscriptionManager instance;
	private SubscriptionManager() {
		subscriptions = new HashMap<String, Subscription>();
	}
	
	private Integer currentID = 0;
	private Map<String, Subscription> subscriptions;
	
	/**
	 * @return the singleton instance of SubscriptionManager
	 */
	public static SubscriptionManager get() {
		if(instance == null)
			return (instance = new SubscriptionManager());
		return instance;
	}
	
	/**
	 * Adds a new subscription. Assigns an unused subscription ID to it.
	 * @param subscription
	 * @return	the subscription ID
	 */
	public String add(Subscription subscription) {
		String id = nextID();
		subscription.setSubscriptionID(id);
		subscriptions.put(id, subscription);
		subscription.activate();
		LOG.info("Added new "+subscription.getInfo());
		return id;
	}
	
	private String nextID() {
		currentID++;
		return currentID.toString();
	}

	/**
	 * Removes a known subscription
	 * @param subscription
	 */
	public void remove(Subscription subscription) {
		subscriptions.remove(subscription.getSubscriptionID());
		LOG.info("Removed subscription "+subscription.getInfo());
	}
	
	/**
	 * Indicates an attribute value has changed in order for the clients to be notified
	 * @param entity			entity 
	 * @param contextAttributes	the entity's changed context attribute
	 */
	public void valueUpdateReceivedFromTo(EntityIdWrapper entity, ContextAttribute oldAttribute, ContextAttribute newAttribute) {
		for(Subscription subscription : subscriptions.values()) {
			subscription.valueUpdateReceivedFromTo(entity, oldAttribute, newAttribute);
		}
	}

}
