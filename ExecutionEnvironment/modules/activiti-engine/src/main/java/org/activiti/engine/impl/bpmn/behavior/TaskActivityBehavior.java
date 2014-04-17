/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//the original file has been modified by SAP Research, 2014

package org.activiti.engine.impl.bpmn.behavior;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.impl.bpmn.data.AbstractDataAssociation;
import org.activiti.engine.impl.bpmn.data.IOSpecification;
import org.activiti.engine.impl.bpmn.data.iota.DataObject;
import org.activiti.engine.impl.bpmn.data.iota.DataObjectDataInputAssociation;
import org.activiti.engine.impl.bpmn.data.iota.DataObjectDataOutputAssociation;
import org.activiti.engine.impl.pvm.delegate.ActivityExecution;



/**
 * Parent class for all BPMN 2.0 task types such as ServiceTask, ScriptTask, UserTask, etc.
 * 
 * When used on its own, it behaves just as a pass-through activity.
 * 
 * @author Joram Barrez
 */
public class TaskActivityBehavior extends AbstractBpmnActivityBehavior {

	protected IOSpecification ioSpecification;

	protected List<AbstractDataAssociation> dataInputAssociations = new ArrayList<AbstractDataAssociation>();
	protected List<AbstractDataAssociation> dataOutputAssociations = new ArrayList<AbstractDataAssociation>();

	public void addDataInputAssociation(AbstractDataAssociation dataInputAssociation) {
		this.dataInputAssociations.add(dataInputAssociation);
	}

	public void addDataOutputAssociation(AbstractDataAssociation dataOutputAssociation) {
		this.dataOutputAssociations.add(dataOutputAssociation);
	}

	public void setIoSpecification(IOSpecification ioSpecification) {
		this.ioSpecification = ioSpecification;
	}

	public List<AbstractDataAssociation> getDataOutputAssociations() {
		return dataOutputAssociations;
	}

	public List<AbstractDataAssociation> getDataInputAssociations() {
		return dataInputAssociations;
	}

	protected void setDataObjectValues(ActivityExecution execution, String retVal) {
		for (AbstractDataAssociation association : getDataOutputAssociations()) {
			DataObjectDataOutputAssociation outputAssociation = (DataObjectDataOutputAssociation) association;

			DataObject dataObject = outputAssociation.getTargetObject();
			execution.setVariable(dataObject.getName(), retVal);
		}
	}

	protected Map<String, String> getDataObjectValues(ActivityExecution execution) {
		Map<String, String> variableValues = new HashMap<String, String>();
		for (AbstractDataAssociation association : getDataInputAssociations()) {
			DataObjectDataInputAssociation inputAssociation = (DataObjectDataInputAssociation) association;

			DataObject dataObject = inputAssociation.getSourceObject();
			variableValues.put(dataObject.getName(), execution.getVariable(dataObject.getName()).toString());
			//execution.setVariable(dataObject.getName(), retVal);
		}
		return variableValues;
	}

	public void execute(ActivityExecution execution) throws Exception {
		super.execute(execution);
	}

}
