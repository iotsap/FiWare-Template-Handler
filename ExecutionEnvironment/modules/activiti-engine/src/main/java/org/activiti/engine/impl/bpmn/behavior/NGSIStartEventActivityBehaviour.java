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

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.Duration;

import noNamespace.AttributeList;
import noNamespace.EntityId;
import noNamespace.NotifyCondition;

import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.impl.bpmn.data.iota.DataObjectDataOutputAssociation;
import org.activiti.engine.impl.bpmn.helper.NGSISubscriptionManager;
import org.activiti.engine.impl.pvm.delegate.ActivityExecution;
import org.activiti.engine.impl.pvm.process.PhysicalAssociation;


/**
 * 
 * A start event triggered by a notify context request according to the NGSI
 * standard.
 * 
 * Basically, two steps are necessary in order to do this:
 * 
 * 1. A context subscription is requested from the NGSI server. The client
 * (Activiti) tells the server to notfify it under certain conditions, e.g.
 * value changes. The conditions are read from the the process definition and
 * sent to the server within the subscription request. 
 * 2. The server notifies Activiti that one of the conditions was fulfilled. 
 * This actually triggers the start event and the execution of the following 
 * activities in the sequence.
 * 
 * The core problem here is the point of time when
 * NGSIStartEventActivityBehavior.execute() (derived from
 * FlowNodeActivityBehavior.execute()) is called. Due to the character of this
 * start event, it should only be executed after the server sent a notification.
 * However, it's immediately triggered by the framework when the process in the 
 * GUI is started.
 * 
 * Therefore, I kind of misuse the original intent of execute(): Instead of
 * accomplishing step 2 in execute(), as it suggests itself, *step 1* occurs in
 * execute.
 * 
 * Step 2 is assigned to triggerEvent(String). This is intended to be called after the 
 * context notification has been received.
 */
public class NGSIStartEventActivityBehaviour extends FlowNodeActivityBehavior {
  
  DataObjectDataOutputAssociation dataAssociation;
  private String processDefinitionID;
  
  private List<NotifyCondition> notifyConditions;
  private Duration duration;
  private AttributeList attributeList;
    
  private List<PhysicalAssociation> physicalAssociations;
  
  public void execute(ActivityExecution execution) throws Exception {
    
    physicalAssociations = execution.getActivity().getPhysicalAssociations();
    Object sentItem = execution.getVariable("sentItem");
    if(sentItem == null) {  //this is called for the first time -- the call has to be interpreted as registration
      NGSISubscriptionManager.get().add(this);
      processDefinitionID = execution.getProcessDefinitionId();
    }
    else {                  //now it's really executed
      execution.setVariable(dataAssociation.getTarget(), sentItem);
      super.execute(execution);
    }
    
  }
  
  public void triggerEvent(String sentItem) throws Exception {
    RuntimeService runtimeService = ProcessEngines.getDefaultProcessEngine().getRuntimeService();
    Map<String, Object> variables = new HashMap<String, Object>();
    variables.put("sentItem", sentItem);
    runtimeService.startProcessInstanceById(processDefinitionID, variables);
  }

  public DataObjectDataOutputAssociation getDataAssociation() {
    return dataAssociation;
  }

  public void setDataAssociation(DataObjectDataOutputAssociation dataAssociation) {
    this.dataAssociation = dataAssociation;
  }
  
  public List<NotifyCondition> getNotifyConditions() {
    return notifyConditions;
  }

  public void setNotifyConditions(List<NotifyCondition> notifyConditions) {
    this.notifyConditions = notifyConditions;
  }

  public Duration getDuration() {
    return duration;
  }

  public void setDuration(Duration duration) {
    this.duration = duration;
  }

  
  public AttributeList getAttributeList() {
    return attributeList;
  }

  
  public void setAttributeList(AttributeList attributeList) {
    this.attributeList = attributeList;
  }

  public List<PhysicalAssociation> getPhysicalAssociations() {
    return physicalAssociations;
  }
  
  public List<EntityId> getPhysicalEntityIDs() {
    List<EntityId> entityIDs = new LinkedList<EntityId>();
    for(PhysicalAssociation physicalAssociation : physicalAssociations) {
      EntityId entityId = physicalAssociation.getPhysicalEntity().getEntityID();
      entityIDs.add(entityId);
    }
    return entityIDs;
    
  }  
}
