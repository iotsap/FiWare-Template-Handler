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
//the file has been added by SAP Research, 2014


package org.activiti.engine.impl.bpmn.behavior;

import java.util.logging.Logger;

import noNamespace.EntityId;

import org.activiti.engine.impl.bpmn.helper.NGSIQueryContextClient;
import org.activiti.engine.impl.pvm.delegate.ActivityExecution;

/**
 * A sensing task senses a property of a real world entity.
 */
public class SensingTaskActivityBehavior extends TaskActivityBehavior {

  protected static final Logger LOGGER = Logger.getLogger(SensingTaskActivityBehavior.class.getName());

  protected String contextAttribute;

	public void execute(ActivityExecution execution) throws Exception {
	  EntityId entityID = execution.getActivity().getPhysicalAssociations().get(0).getPhysicalEntity().getEntityID();
	  NGSIQueryContextClient client = new NGSIQueryContextClient();
	  String retVal = client.getValue(entityID, contextAttribute);
	  LOGGER.info("Return value for execution with id'"+execution.getId() + "' was '"+retVal+"'. "
	          + "Context attribute was '"+contextAttribute+"' and entity id was '"+entityID.getId()+"'.");
    setDataObjectValues(execution, retVal);
		leave(execution);
	}
	
  public String getContextAttribute() {
    return contextAttribute;
  }

  public void setContextAttribute(String contextAttribute) {
    this.contextAttribute = contextAttribute;
  }

  public void signal(ActivityExecution execution, String signalName, Object data) throws Exception {
    leave(execution);
  }

}
