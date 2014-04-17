package com.sap.research.fiware.ngsi10.simple.subscriptionmanagement;

import com.sap.research.fiware.ngsi10.simple.wrappers.EntityIdWrapper;

import noNamespace.ContextAttribute;

/**
 * A subscription triggered by a timer
 * 
 */
public class TimerSubscription extends Subscription {
	
	private Long intervalInMillis;

	@Override
	public void activateTrigger() {
		Thread triggerThread = createTriggerThread();
		startTriggerThread(triggerThread);
		
	}

	private void startTriggerThread(Thread thread) {
		if(durationLimited())
			Scheduler.get().schedulePeriodically(thread, intervalInMillis);
		else
			Scheduler.get().schedulePeriodically(thread, intervalInMillis, durationInMillis);
	}

	private Thread createTriggerThread() {
		Thread thread = new Thread() {
			@Override 
			public void run() {
				TimerSubscription.this.trigger();
			}
		};
		return thread;
	}

	@Override
	public void valueUpdateReceivedFromTo(EntityIdWrapper entity, ContextAttribute oldAttribute, ContextAttribute newAttribute) {
		//nothing happens
	}



	public long getIntervalInMillis() {
		return intervalInMillis;
	}



	public void setIntervalInMillis(long intervalInMillis) {
		this.intervalInMillis = intervalInMillis;
	}

}
