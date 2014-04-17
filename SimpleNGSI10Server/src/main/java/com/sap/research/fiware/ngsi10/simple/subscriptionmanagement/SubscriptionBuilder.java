package com.sap.research.fiware.ngsi10.simple.subscriptionmanagement;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Calendar;
import java.util.Date;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

import noNamespace.NotifyCondition;
import noNamespace.NotifyConditionList;
import noNamespace.NotifyConditionType;
import noNamespace.SubscribeContextRequest;

import org.apache.xmlbeans.GDuration;
import org.apache.xmlbeans.XmlOptions;

import com.sap.research.fiware.ngsi10.simple.exceptions.BadRequestException;
import com.sap.research.fiware.ngsi10.simple.exceptions.NotFoundException;

/**
 * Creates a subscription from a request. Only the first notify condition is considered.
 * 
 *
 */
public class SubscriptionBuilder {

	/**
	 * builds the subscription
	 * @return	the subscription
	 * @throws NotFoundException	thrown if the desired entity or context attributes are not present
	 */
	public static Subscription build(SubscribeContextRequest subscribeContextRequest) throws NotFoundException, BadRequestException {
		NotifyCondition notifyCondition = readNotifyCondition(subscribeContextRequest);
		Subscription subscription = getSubscriptionForNotifyCondition(notifyCondition);
		setAttributes(subscription, subscribeContextRequest);
		return subscription;
	}

	private static void setAttributes(Subscription subscription, SubscribeContextRequest subscribeContextRequest) throws BadRequestException {
		subscription.setAttributes(subscribeContextRequest.getAttributeList().getAttributeArray());
		subscription.setEntityIDs(subscribeContextRequest.getEntityIdList().getEntityIdArray());
		subscription.setReference(buildReference(subscribeContextRequest));
		subscription.setDurationInMillis(readDuration(subscribeContextRequest));
	}

	private static URI buildReference(SubscribeContextRequest subscribeContextRequest) throws BadRequestException {
		try {
			String reference = subscribeContextRequest.getReference().xmlText();
			reference = trimFragmentStuff(reference);
			return new URI(reference);
		} catch (URISyntaxException e) {
			throw new BadRequestException(e.getMessage());
		}
	}
	
	private static String trimFragmentStuff(String xmlBeansFragment) {
		return xmlBeansFragment.replace("<xml-fragment>", "").replace("</xml-fragment>","").trim();
	}

	private static Subscription getSubscriptionForNotifyCondition(NotifyCondition notifyCondition) {
		if(notifyCondition == null) {
			return new NoEventSubscription();
		}
		int notifyConditionInt = notifyCondition.getType().intValue();
		switch(notifyConditionInt) {
			case(NotifyConditionType.INT_ONCHANGE):
				ValueChangeSubscription valueChangeSubscription = new ValueChangeSubscription();
				String[] attributesFromNotifyCondition = notifyCondition.getCondValueList().getCondValueArray();;
				valueChangeSubscription.setAttributesFromNotifyCondition(attributesFromNotifyCondition);
				return valueChangeSubscription;
			case(NotifyConditionType.INT_ONTIMEINTERVAL):
				TimerSubscription timerSubscription = new TimerSubscription();
				timerSubscription.setIntervalInMillis(readInterval(notifyCondition));
				return timerSubscription;
		}
		return null; //should not happen if the given input is valid
	}
	
	private static Long readDuration(SubscribeContextRequest subscribeContextRequest) {
		//uuuah.
		GDuration duration = subscribeContextRequest.getDuration();
		if(duration == null)
			return null;
		String durationString = duration.toString();
		return getMillisFromDurationString(durationString);
	}

	private static long readInterval(NotifyCondition notifyCondition) {
		String intervalString = notifyCondition.getCondValueList().getCondValueArray(0);
		return getMillisFromDurationString(intervalString);
	}

	private static long getMillisFromDurationString(String durationString) {
		try {
			Duration d = DatatypeFactory.newInstance().newDuration(durationString);
			return d.getTimeInMillis(Calendar.getInstance());
		} catch (DatatypeConfigurationException e) {
			throw new RuntimeException(e);
		}
	}

	private static NotifyCondition readNotifyCondition(SubscribeContextRequest subscribeContextRequest) {
		NotifyCondition notifyCondition = null;
		NotifyConditionList notifyConditions = subscribeContextRequest.getNotifyConditions();
		if(notifyConditions != null) {
			notifyCondition = notifyConditions.getNotifyConditionArray(0);
		}
		return notifyCondition;
	}
}
