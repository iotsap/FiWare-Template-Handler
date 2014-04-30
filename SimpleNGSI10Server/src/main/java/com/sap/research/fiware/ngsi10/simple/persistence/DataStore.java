package com.sap.research.fiware.ngsi10.simple.persistence;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import noNamespace.ContextAttribute;
import noNamespace.ContextMetadata;
import noNamespace.ContextMetadataList;
import noNamespace.EntityId;
import noNamespace.UpdateActionType;
import noNamespace.UpdateActionType.Enum;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlString;

import com.sap.research.fiware.ngsi10.simple.RegisterContextClient;
import com.sap.research.fiware.ngsi10.simple.exceptions.NotFoundException;
import com.sap.research.fiware.ngsi10.simple.exceptions.ServerConnectionException;
import com.sap.research.fiware.ngsi10.simple.subscriptionmanagement.SubscriptionManager;
import com.sap.research.fiware.ngsi10.simple.wrappers.EntityIdWrapper;

public class DataStore {
	
	Map<EntityIdWrapper, Map<String, LinkedList<ContextAttribute>>> magicStore = new HashMap<EntityIdWrapper, Map<String, LinkedList<ContextAttribute>>>();
	
	private static DataStore instance;
	
	public static DataStore get() {
		if(instance == null)
			instance = new DataStore();
		return instance;
	}
	
	private DataStore() {
		try {
			createDummyValues();
		} catch (XmlException e) {
			throw new RuntimeException(e);
		}
	}

	public LinkedList<ContextAttribute> get(EntityId entityId, String attributeName) throws NotFoundException {
		EntityIdWrapper entityWrapper = new EntityIdWrapper(entityId);
		Map<String, LinkedList<ContextAttribute>> attributes = magicStore.get(entityWrapper);
		if(attributes == null) 
			throw new NotFoundException();
		LinkedList<ContextAttribute> attributeInstances = attributes.get(attributeName);
		if(attributeInstances == null) 
			throw new NotFoundException();
		return attributeInstances;
	}

	public void save(EntityId entityId, ContextAttribute attribute, Enum action) throws NotFoundException {
		System.out.println("received update for entity: "+entityId);
		System.out.println("received value: "+attribute);
		EntityIdWrapper entityWrapper = new EntityIdWrapper(entityId);
		String name = attribute.getName();
		Map<String, LinkedList<ContextAttribute>> attributes = getOrCreateAttributes(entityWrapper, action);
		notifySubscribers(entityWrapper, attribute, name, attributes);
		chooseSaveAction(entityId, attribute, action, name, attributes);
	}
	
	private void chooseSaveAction(EntityId entityId, ContextAttribute attribute, Enum action, String name, Map<String, LinkedList<ContextAttribute>> attributes)
			throws NotFoundException {
		switch(action.intValue()) {
			case (UpdateActionType.INT_DELETE) :
				delete(name, attributes);
			case(UpdateActionType.INT_APPEND) :
				append(entityId, attribute, name, attributes);
			case(UpdateActionType.INT_UPDATE) :
				update(attribute, name, attributes);
		}
	}

	private void update(ContextAttribute attribute, String name, Map<String, LinkedList<ContextAttribute>> attributes)
			throws NotFoundException {
		LinkedList<ContextAttribute> attributeEntries = attributes.get(name);
		if(attributes == null || attributeEntries == null) 
			throw new NotFoundException();
		attributeEntries.clear(); 					//according to spec but not making any sense
		attributeEntries.add(attribute);
	}

	private void append(EntityId entityId, ContextAttribute attribute, String name, Map<String, LinkedList<ContextAttribute>> attributes)
			throws NotFoundException {
		if(attributes == null) 
			throw new NotFoundException();
		if (attributes.get(name) == null) {
			attributes.put(name, new LinkedList<ContextAttribute>());
			try {
				new RegisterContextClient().registerContext(entityId, attribute);
			} catch (ServerConnectionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		attributes.get(name).add(attribute);
	}

	private void delete(String name, Map<String, LinkedList<ContextAttribute>> attributes) {
		if(attributes != null)
			attributes.remove(name);
	}

	private Map<String, LinkedList<ContextAttribute>> getOrCreateAttributes(EntityIdWrapper wrapper, Enum action) 
			throws NotFoundException {
		Map<String, LinkedList<ContextAttribute>> attributes = magicStore.get(wrapper);
		if(attributes == null) {
			if(action == Enum.forInt(UpdateActionType.INT_APPEND)) {
				attributes = new HashMap<String, LinkedList<ContextAttribute>>();
				magicStore.put(wrapper, attributes);
			}
			else {
				throw new NotFoundException();
			}
		}
		return attributes;
	}
	
	private void notifySubscribers(EntityIdWrapper entityWrapper, ContextAttribute attribute, String name, Map<String, LinkedList<ContextAttribute>> attributes) {
		LinkedList<ContextAttribute> namedAttrs = attributes.get(name);
		if(namedAttrs == null)
			return;
		ContextAttribute recent = namedAttrs.getLast();
		SubscriptionManager.get().valueUpdateReceivedFromTo(entityWrapper, recent, attribute);
	}
	
	private void createDummyValues() throws XmlException {
		
		EntityId entityId1 = EntityId.Factory.newInstance();
		entityId1.setId("foo");
		ContextAttribute attribute1 = ContextAttribute.Factory.newInstance();
		attribute1.setName("temperature");
		attribute1.setContextValue(XmlString.Factory.newValue("10"));

		EntityId entityId2 = EntityId.Factory.newInstance();
		entityId2.setId("42");
		
		ContextAttribute attribute2Sensor1 = ContextAttribute.Factory.newInstance();
		attribute2Sensor1.setName("temperature");
		attribute2Sensor1.setContextValue(XmlString.Factory.newValue("20"));
		ContextMetadata meta1 = ContextMetadata.Factory.newInstance();
		meta1.setName("sensortype");
		meta1.setValue(XmlString.Factory.newValue("wired"));
		ContextAttribute attribute2Sensor2 = ContextAttribute.Factory.newInstance();
		ContextMetadataList attribute2Sensor1Metadata = ContextMetadataList.Factory.newInstance();
		ContextMetadataList attribute2Sensor2Metadata = ContextMetadataList.Factory.newInstance();
		ContextMetadata meta2 = ContextMetadata.Factory.newInstance();
		meta2.setName("sensortype");
		meta2.setValue(XmlString.Factory.newValue("remote sensor"));
		attribute2Sensor1Metadata.setContextMetadataArray(new ContextMetadata[]{meta1});;
		attribute2Sensor2Metadata.setContextMetadataArray(new ContextMetadata[]{meta2});;
		attribute2Sensor1.setMetadata(attribute2Sensor1Metadata);
		attribute2Sensor2.setMetadata(attribute2Sensor2Metadata);
		attribute2Sensor2.setName("temperature");
		attribute2Sensor2.setContextValue(XmlString.Factory.newValue("22"));
		
		
		EntityId entityId3 = EntityId.Factory.newInstance();
		entityId3.setId("1");
		ContextAttribute attribute3_1 = ContextAttribute.Factory.newInstance();
		attribute3_1.setName("temperature");
		attribute3_1.setContextValue(XmlString.Factory.newValue("31"));
		ContextAttribute attribute3_2 = ContextAttribute.Factory.newInstance();
		attribute3_2.setName("humidity");
		attribute3_2.setContextValue(XmlString.Factory.newValue("99"));
		
		EntityIdWrapper ewrapper1 = new EntityIdWrapper(entityId1);
		EntityIdWrapper ewrapper2 = new EntityIdWrapper(entityId2);
		EntityIdWrapper ewrapper3 = new EntityIdWrapper(entityId3);
		
		LinkedList<ContextAttribute> set1 = new LinkedList<ContextAttribute>();
		set1.add(attribute1);
		Map<String, LinkedList<ContextAttribute>> attributeMap1 = new HashMap<String, LinkedList<ContextAttribute>>();
		attributeMap1.put(attribute1.getName(), set1);
		magicStore.put(ewrapper1, attributeMap1);
		
		LinkedList<ContextAttribute> set2 = new LinkedList<ContextAttribute>();
		set2.add(attribute2Sensor1);
		set2.add(attribute2Sensor2);
		Map<String, LinkedList<ContextAttribute>> attributeMap2 = new HashMap<String, LinkedList<ContextAttribute>>();
		attributeMap2.put(attribute2Sensor1.getName(), set2);
		magicStore.put(ewrapper2, attributeMap2);
		
		LinkedList<ContextAttribute> set3_1 = new LinkedList<ContextAttribute>();
		set3_1.add(attribute3_1);
		LinkedList<ContextAttribute> set3_2 = new LinkedList<ContextAttribute>();
		set3_2.add(attribute3_2);
		Map<String, LinkedList<ContextAttribute>> attributeMap3 = new HashMap<String, LinkedList<ContextAttribute>>();
		attributeMap3.put(attribute3_1.getName(), set3_1);
		attributeMap3.put(attribute3_2.getName(), set3_2);
		magicStore.put(ewrapper3, attributeMap3);
	}
}