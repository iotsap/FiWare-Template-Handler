package org.activiti.engine.impl.bpmn.data.iota;

import org.activiti.engine.impl.bpmn.data.AbstractDataAssociation;
import org.activiti.engine.impl.pvm.delegate.ActivityExecution;
import org.activiti.engine.impl.pvm.process.ActivityImpl;

public class DataObjectDataInputAssociation extends AbstractDataAssociation {

	protected ActivityImpl targetObject;
	protected DataObject sourceObject;

	
	public DataObjectDataInputAssociation(DataObject source, ActivityImpl target) {
		super(source.getId(), target.getId());
		this.sourceObject = source;
		this.targetObject = target;
	}
	
	public DataObject getSourceObject() {
		return sourceObject;
	}
	
	public ActivityImpl getTargetObject() {
		return targetObject;
	}

	@Override
	public void evaluate(ActivityExecution execution) {

	}
	
}