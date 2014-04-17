package org.activiti.engine.impl.bpmn.data.iota;

import org.activiti.engine.impl.bpmn.data.AbstractDataAssociation;
import org.activiti.engine.impl.pvm.delegate.ActivityExecution;
import org.activiti.engine.impl.pvm.process.ActivityImpl;

public class DataObjectDataOutputAssociation extends AbstractDataAssociation {
	
	protected DataObject targetObject;
	protected ActivityImpl sourceObject;

	
	public DataObjectDataOutputAssociation(ActivityImpl source, DataObject target) {
		super(source.getId(), target.getId());
		this.sourceObject = source;
		this.targetObject = target;
	}
	
	public ActivityImpl getSourceObject() {
		return sourceObject;
	}
	
	public DataObject getTargetObject() {
		return targetObject;
	}

	@Override
	public void evaluate(ActivityExecution execution) {
		
	}

}
