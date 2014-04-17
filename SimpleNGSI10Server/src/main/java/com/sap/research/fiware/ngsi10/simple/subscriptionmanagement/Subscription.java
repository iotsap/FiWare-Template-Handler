package com.sap.research.fiware.ngsi10.simple.subscriptionmanagement;

import java.net.URI;
import java.util.Arrays;
import java.util.logging.Logger;

import noNamespace.ContextAttribute;
import noNamespace.EntityId;
import noNamespace.NotifyCondition;

import com.sap.research.fiware.ngsi10.simple.NotifyContextClient;
import com.sap.research.fiware.ngsi10.simple.exceptions.ServerConnectionException;
import com.sap.research.fiware.ngsi10.simple.wrappers.EntityIdWrapper;

/**
 * a client's subscription to a context
 * 
 * The structure is similar to the request's structure. 
 * Since this represents a already fulfilled request, there is additionally a subscription id
 * 
 * 
 *
 */
public abstract class Subscription {
	protected static final Logger LOG = Logger.getLogger(Subscription.class.getName());
	
	protected String subscriptionID;
	protected EntityIdWrapper[] entityIDs;
	protected URI reference;
	protected String[] attributes;
	protected Long durationInMillis;
	protected NotifyCondition notifyCondition;
	
	/**
	 * Activates the subscription. It handles the potential timer events (triggering and expiration) if necessary. 
	 */
	public void activate() {
		activateEndOfLife();
		this.activateTrigger();
	}
	
	/**
	 * Handles the triggering events
	 */
	protected abstract void activateTrigger();

	/**
	 * When a context attribute value changed the subscription has to inform the client if the notify condition matches.
	 * 
	 * @param entity the entity whose value changed
	 * @param oldAttribute the old attribute value
	 * @param newAttribute the new attribute value
	 */
	public abstract void valueUpdateReceivedFromTo(EntityIdWrapper entity, ContextAttribute oldAttribute, ContextAttribute newAttribute);
	
	protected void trigger() {
		try {
			new NotifyContextClient(this).sendNotification();
			LOG.info("Successfully triggered "+getInfo());
		} catch (ServerConnectionException e) {
			e.printStackTrace();
		}
	}

	public String getSubscriptionID() {
		return subscriptionID;
	}

	public void setSubscriptionID(String subscriptionID) {
		this.subscriptionID = subscriptionID;
	}

	public EntityIdWrapper[] getEntityIDs() {
		return entityIDs;
	}
	
	public void setEntityIDs(EntityIdWrapper[] entityIDs) {
		this.entityIDs = entityIDs;
	}

	public void setEntityIDs(EntityId[] entityIDs) {
		this.entityIDs = new EntityIdWrapper[entityIDs.length];
		for(int i = 0; i<entityIDs.length; i++) {
			this.entityIDs[i] = new EntityIdWrapper(entityIDs[i]);
		}
	}

	public URI getReference() {
		return reference;
	}

	public void setReference(URI reference) {
		this.reference = reference;
	}

	public String[] getAttributes() {
		return attributes;
	}

	public void setAttributes(String[] attributes) {
		this.attributes = attributes;
	}

	public Long getDurationInMillis() {
		return durationInMillis;
	}

	public void setDurationInMillis(Long durationInMillis) {
		this.durationInMillis = durationInMillis;
	}

	public NotifyCondition getNotifyCondition() {
		return notifyCondition;
	}

	public void setNotifyCondition(NotifyCondition notifyCondition) {
		this.notifyCondition = notifyCondition;
	}

	public String getInfo() {
		StringBuilder info = new StringBuilder();
		info.append("Subscription with id ");
		info.append(subscriptionID);
		info.append(" of type ");
		info.append(this.getClass().getSimpleName());
		info.append(" connected with entities:");
		for(EntityIdWrapper entityIDWrapper : entityIDs) {
			info.append(entityIDWrapper.getEntityId().getId());
			info.append(" ");
		}
		return info.toString();
	}

	protected void activateEndOfLife() {
		if(durationLimited()) {
			Thread destructionThread = createDestructionThread();
			startDestructionThread(destructionThread);
		}
	}

	private Thread createDestructionThread() {
		Thread thread = new Thread() {
			@Override 
			public void run() {
				SubscriptionManager.get().remove(Subscription.this);
			}
		};
		return thread;
	}

	private void startDestructionThread(Thread destructionThread) {
		Scheduler.get().scheduleOnce(destructionThread, durationInMillis);
	}

	protected boolean durationLimited() {
		return durationInMillis != null;
	}
}
