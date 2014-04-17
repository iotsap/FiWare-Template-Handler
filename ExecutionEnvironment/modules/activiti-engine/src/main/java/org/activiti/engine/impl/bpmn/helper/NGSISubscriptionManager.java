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

package org.activiti.engine.impl.bpmn.helper;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.activiti.engine.impl.bpmn.behavior.NGSIStartEventActivityBehaviour;


/**
 * Triggers and handles subscriptions for the NGSI start events and holds references to these events in order to actually execut them when a notify context request was received
 */
public class NGSISubscriptionManager {

  private static NGSISubscriptionManager instance;
  protected static final Logger LOGGER = Logger.getLogger(NGSISubscriptionManager.class.getName());
  
  //maps from subscription IDs to executable start events
  private Map<String, NGSIStartEventActivityBehaviour> startEvents;
  
  private NGSISubscriptionManager() {
    startEvents = new HashMap<String, NGSIStartEventActivityBehaviour>();
  }
  
  public static NGSISubscriptionManager get() {
    if(instance == null) {
      return (instance = new NGSISubscriptionManager());
    }
    else {
      return instance;
    }
  }
  
  public void notify(String subscriptionID, String contextResponseList) throws NotFoundException, Exception {
    NGSIStartEventActivityBehaviour ngsiStartEventActivityBehaviour = startEvents.get(subscriptionID);
    if(ngsiStartEventActivityBehaviour == null) 
      throw new NotFoundException();
    try {
      ngsiStartEventActivityBehaviour.triggerEvent(contextResponseList);
    } catch (Exception e) {
      LOGGER.log(Level.SEVERE, "Could not execute NGSI start event triggered by a notify context request", e);
      throw e;
    }
  }
  
  public void add(NGSIStartEventActivityBehaviour behaviour) {
    NGSISubscribeContextClient ngsiSubscribeContextClient = new NGSISubscribeContextClient(behaviour);
    ngsiSubscribeContextClient.subscribe();
    String subscriptionID = ngsiSubscribeContextClient.getSubscriptionID();
    startEvents.put(subscriptionID, behaviour);
  }
  
  @SuppressWarnings("serial")
  public class NotFoundException extends Exception {}

}
