package com.sap.research.fiware.ngsi10.simple.subscriptionmanagement;

/**
 * Central instance managing deferred thread execution. Intended to be used for timer-driven subscriptions
 * 
 * for simple purposes this just generates one thread per job. Using more sophisticated tools could be appropriate here
 * 
 * 
 *
 */
public class Scheduler {
	
	static Scheduler instance;
	
	private Scheduler() {}
	
	public static Scheduler get() {
		if(instance == null)
			return (instance = new Scheduler());
		return instance;
	}
	
	/**
	 * Schedules execution for one time
	 * @param thread		Thread to be executed
	 * @param waitingTime	desired time until execution in ms
	 */
	public void scheduleOnce(final Thread thread, final long waitingTime) {
		Thread waiting = new Thread() {
			@Override
			public void run() {
				try {
					Thread.sleep(waitingTime);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				thread.run();
			}
		};
		waiting.start();
	}
	
	/**
	 * Schedules a regular execution. Stops the repetition after a certain time.
	 * @param thread	Thread to be executed
	 * @param interval	Time to wait between two executions in ms
	 * @param duration	How long it should be repeated
	 */
	public void schedulePeriodically(final Thread thread, final long interval, long duration) {
		final int times = (int) (duration / interval);
		Thread loop = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i<times; i++) {
					try {
						Thread.sleep(interval);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					thread.run();
				}
			}
		};
		loop.start();
	}
	
	/**
	 * Schedules a regular execution.
	 * @param thread	Thread to be executed
	 * @param interval	Time to wait between two executions in ms
	 */
	public void schedulePeriodically(final Thread thread, final long interval) {
		Thread loop = new Thread() {
			@Override
			public void run() {
				while(true) { //just according to NGSI spec.
					try {
						Thread.sleep(interval);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					thread.run();
				}
			}
		};
		loop.start();
	}

}
