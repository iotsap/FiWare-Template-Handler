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

package org.activiti.engine.impl.bpmn.diagram;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.activiti.engine.impl.bpmn.behavior.NGSIStartEventActivityBehaviour;
import org.activiti.engine.impl.bpmn.behavior.WebServiceActivityBehavior;
import org.activiti.engine.impl.bpmn.data.AbstractDataAssociation;
import org.activiti.engine.impl.bpmn.data.iota.DataObject;
import org.activiti.engine.impl.bpmn.data.iota.DataObjectDataOutputAssociation;
import org.activiti.engine.impl.bpmn.parser.BpmnParse;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.impl.pvm.PvmTransition;
import org.activiti.engine.impl.pvm.delegate.ActivityBehavior;
import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.activiti.engine.impl.pvm.process.HasWaypoints;
import org.activiti.engine.impl.pvm.process.Lane;
import org.activiti.engine.impl.pvm.process.LaneSet;
import org.activiti.engine.impl.pvm.process.ParticipantProcess;
import org.activiti.engine.impl.pvm.process.PhysicalAssociation;
import org.activiti.engine.impl.pvm.process.PhysicalEntity;
import org.activiti.engine.impl.pvm.process.TransitionImpl;

/**
 * Class to generate an image based the diagram interchange information in a
 * BPMN 2.0 process.
 * 
 * @author Joram Barrez
 */
public class ProcessDiagramGenerator {
  
  protected static final Logger LOGGER = Logger.getLogger(ProcessDiagramGenerator.class.getName());
  protected static final Map<String, ActivityDrawInstruction> activityDrawInstructions = new HashMap<String, ActivityDrawInstruction>();

  // The instructions on how to draw a certain construct is
  // created statically and stored in a map for performance.
  static {
    // start event
    activityDrawInstructions.put("startEvent", new ActivityDrawInstruction() {

      public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
        processDiagramCreator.drawNoneStartEvent(activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(), activityImpl.getHeight());
      }
    });

    // start timer event
    activityDrawInstructions.put("startTimerEvent", new ActivityDrawInstruction() {

      public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
        processDiagramCreator.drawTimerStartEvent(activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(), activityImpl.getHeight());
      }
    });
    
    // start ngsi event (for whatever reason the obvious has to be commmented here)
    activityDrawInstructions.put("ngsiStartEvent", new ActivityDrawInstruction() {
      public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) { 
        processDiagramCreator.drawNgsiStartEvent(activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(), activityImpl.getHeight());
      }
    });
    
    // end event
    activityDrawInstructions.put("endEvent", new ActivityDrawInstruction() {

      public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
        processDiagramCreator.drawNoneEndEvent(activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(), activityImpl.getHeight());
      }
    });

    // error end event
    activityDrawInstructions.put("errorEndEvent", new ActivityDrawInstruction() {

      public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
        processDiagramCreator.drawErrorEndEvent(activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(), activityImpl.getHeight());
      }
    });

    // task
    activityDrawInstructions.put("task", new ActivityDrawInstruction() {

      public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
        processDiagramCreator.drawTask((String) activityImpl.getProperty("name"), activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(),
                activityImpl.getHeight());
      }
    });

    // user task
    activityDrawInstructions.put("userTask", new ActivityDrawInstruction() {

      public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
        processDiagramCreator.drawUserTask((String) activityImpl.getProperty("name"), activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(),
                activityImpl.getHeight());
      }
    });

    // script task
    activityDrawInstructions.put("scriptTask", new ActivityDrawInstruction() {

      public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
        processDiagramCreator.drawScriptTask((String) activityImpl.getProperty("name"), activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(),
                activityImpl.getHeight());
      }
    });

    // service task
    activityDrawInstructions.put("serviceTask", new ActivityDrawInstruction() {

      public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
        processDiagramCreator.drawServiceTask((String) activityImpl.getProperty("name"), activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(),
                activityImpl.getHeight());
      }
    });

    // receive task
    activityDrawInstructions.put("receiveTask", new ActivityDrawInstruction() {

      public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
        processDiagramCreator.drawReceiveTask((String) activityImpl.getProperty("name"), activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(),
                activityImpl.getHeight());
      }
    });

    // send task
    activityDrawInstructions.put("sendTask", new ActivityDrawInstruction() {

      public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
        processDiagramCreator.drawSendTask((String) activityImpl.getProperty("name"), activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(),
                activityImpl.getHeight());
      }
    });

    // manual task
    activityDrawInstructions.put("manualTask", new ActivityDrawInstruction() {

      public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
        processDiagramCreator.drawManualTask((String) activityImpl.getProperty("name"), activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(),
                activityImpl.getHeight());
      }
    });

    // actuation task
    activityDrawInstructions.put("actuationTask", new ActivityDrawInstruction() {

      public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
        processDiagramCreator.drawActuationTask((String) activityImpl.getProperty("name"), activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(),
                activityImpl.getHeight());
      }
    });

    // sensing task
    activityDrawInstructions.put("sensingTask", new ActivityDrawInstruction() {

      public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
        processDiagramCreator.drawSensingTask((String) activityImpl.getProperty("name"), activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(),
                activityImpl.getHeight());
      }
    });

    // exclusive gateway
    activityDrawInstructions.put("exclusiveGateway", new ActivityDrawInstruction() {

      public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
        processDiagramCreator.drawExclusiveGateway(activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(), activityImpl.getHeight());
      }
    });

    // inclusive gateway
    activityDrawInstructions.put("inclusiveGateway", new ActivityDrawInstruction() {

      public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
        processDiagramCreator.drawInclusiveGateway(activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(), activityImpl.getHeight());
      }
    });

    // parallel gateway
    activityDrawInstructions.put("parallelGateway", new ActivityDrawInstruction() {

      public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
        processDiagramCreator.drawParallelGateway(activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(), activityImpl.getHeight());
      }
    });

    // Boundary timer
    activityDrawInstructions.put("boundaryTimer", new ActivityDrawInstruction() {

      public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
        processDiagramCreator.drawCatchingTimerEvent(activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(), activityImpl.getHeight());
      }
    });

    // Boundary catch error
    activityDrawInstructions.put("boundaryError", new ActivityDrawInstruction() {

      public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
        processDiagramCreator.drawCatchingErroEvent(activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(), activityImpl.getHeight());
      }
    });

    // timer catch event
    activityDrawInstructions.put("intermediateTimer", new ActivityDrawInstruction() {

      public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
        processDiagramCreator.drawCatchingTimerEvent(activityImpl.getX(), activityImpl.getY(), activityImpl.getWidth(), activityImpl.getHeight());
      }
    });

    // subprocess
    activityDrawInstructions.put("subProcess", new ActivityDrawInstruction() {

      public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
        Boolean isExpanded = (Boolean) activityImpl.getProperty(BpmnParse.PROPERTYNAME_ISEXPANDED);
        if (isExpanded != null && isExpanded == false) {
          processDiagramCreator.drawCollapsedSubProcess((String) activityImpl.getProperty("name"), activityImpl.getX(), activityImpl.getY(),
                  activityImpl.getWidth(), activityImpl.getHeight());
        } else {
          processDiagramCreator.drawExpandedSubProcess((String) activityImpl.getProperty("name"), activityImpl.getX(), activityImpl.getY(),
                  activityImpl.getWidth(), activityImpl.getHeight());
        }
      }
    });

    // call activity
    activityDrawInstructions.put("callActivity", new ActivityDrawInstruction() {

      public void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl) {
        processDiagramCreator.drawCollapsedCallActivity((String) activityImpl.getProperty("name"), activityImpl.getX(), activityImpl.getY(),
                activityImpl.getWidth(), activityImpl.getHeight());
      }
    });

  }

  /**
   * Generates a PNG diagram image of the given process definition, using the
   * diagram interchange information of the process.
   */
  public static InputStream generatePngDiagram(ProcessDefinitionEntity processDefinition) {
    return generateDiagram(processDefinition, "png", Collections.<String> emptyList());
  }

  /**
   * Generates a JPG diagram image of the given process definition, using the
   * diagram interchange information of the process.
   */
  public static InputStream generateJpgDiagram(ProcessDefinitionEntity processDefinition) {
    return generateDiagram(processDefinition, "jpg", Collections.<String> emptyList());
  }

  protected static ProcessDiagramCanvas generateDiagram(ProcessDefinitionEntity processDefinition, List<String> highLightedActivities) {
    ProcessDiagramCanvas processDiagramCanvas = initProcessDiagramCanvas(processDefinition);
    
    // Draw pool shape, if process is participant in collaboration
    if(processDefinition.getParticipantProcess() != null) {
      ParticipantProcess pProc = processDefinition.getParticipantProcess();
      processDiagramCanvas.drawPoolOrLane(pProc.getName(), pProc.getX(), pProc.getY(), pProc.getWidth(), pProc.getHeight());
    }
    
    // Draw lanes
    if(processDefinition.getLaneSets() != null && processDefinition.getLaneSets().size() > 0) {
      for(LaneSet laneSet : processDefinition.getLaneSets()) {
        if(laneSet.getLanes() != null && laneSet.getLanes().size() > 0) {
          for(Lane lane : laneSet.getLanes()) {
            processDiagramCanvas.drawPoolOrLane(lane.getName(), lane.getX(), lane.getY(), lane.getWidth(), lane.getHeight());
          }
        }
      }
    }
    
    // Draw data objects
    for (DataObject dataObject : processDefinition.getDataObjects()) {
      processDiagramCanvas.drawDataObject(dataObject);
    }
    
    // Draw data associations for data objects
    for (DataObject dataObject : processDefinition.getDataObjects()) {
      for (AbstractDataAssociation dataAssociation : dataObject.getDataAssociations()) {
        processDiagramCanvas.drawDataAssociation(dataAssociation);
      }
    }
    
    // Draw activities and their sequence-flows
    for (ActivityImpl activity : processDefinition.getActivities()) {
      drawActivity(processDiagramCanvas, activity, highLightedActivities);
    }
    return processDiagramCanvas;
  }

  public static InputStream generateDiagram(ProcessDefinitionEntity processDefinition, String imageType, List<String> highLightedActivities) {
    return generateDiagram(processDefinition, highLightedActivities).generateImage(imageType);
  }

  protected static void drawActivity(ProcessDiagramCanvas processDiagramCanvas, ActivityImpl activity, List<String> highLightedActivities) {
    String type = (String) activity.getProperty("type");
    ActivityDrawInstruction drawInstruction = activityDrawInstructions.get(type);
    if (drawInstruction != null) {

      // Draw data associations for service tasks
      ActivityBehavior activityBehavior = activity.getActivityBehavior();
      if (activityBehavior instanceof WebServiceActivityBehavior) {
        WebServiceActivityBehavior webServiceActivityBehavior = (WebServiceActivityBehavior) activityBehavior;
        for (AbstractDataAssociation dataAssociation : webServiceActivityBehavior.getDataInputAssociations()) {
          processDiagramCanvas.drawDataAssociation(dataAssociation);
        }
        for (AbstractDataAssociation dataAssociation : webServiceActivityBehavior.getDataOutputAssociations()) {
          processDiagramCanvas.drawDataAssociation(dataAssociation);
        }
      }
      
      //Draw data associations for NGSI start events
      if(activityBehavior instanceof NGSIStartEventActivityBehaviour) {
        NGSIStartEventActivityBehaviour ngsiStartEventActivityBehavior = (NGSIStartEventActivityBehaviour) activityBehavior;
        DataObjectDataOutputAssociation dataAssociation = ngsiStartEventActivityBehavior.getDataAssociation();
        processDiagramCanvas.drawDataAssociation(dataAssociation);
      }

      drawInstruction.draw(processDiagramCanvas, activity);

      // Gather info on the multi instance marker
      boolean multiInstanceSequential = false, multiInstanceParallel = false, collapsed = false;
      String multiInstance = (String) activity.getProperty("multiInstance");
      if (multiInstance != null) {
        if ("sequential".equals(multiInstance)) {
          multiInstanceSequential = true;
        } else {
          multiInstanceParallel = true;
        }
      }

      // Gather info on the collapsed marker
      Boolean expanded = (Boolean) activity.getProperty(BpmnParse.PROPERTYNAME_ISEXPANDED);
      if (expanded != null) {
        collapsed = !expanded;
      }

      // Actually draw the markers
      processDiagramCanvas.drawActivityMarkers(activity.getX(), activity.getY(), activity.getWidth(), activity.getHeight(), multiInstanceSequential,
              multiInstanceParallel, collapsed);

      // Draw highlighted activities
      if (highLightedActivities.contains(activity.getId())) {
        drawHighLight(processDiagramCanvas, activity);
      }

    }
    else {
      LOGGER.warning("Could find drawing instructions for activity '"+activity.getId()+"' of type '"+type+"'");
    }

    // draw associated Physical Entities
    for (PhysicalAssociation physicalAssociation : activity.getPhysicalAssociations()) {
      PhysicalEntity physicalEntity = physicalAssociation.getPhysicalEntity();
      processDiagramCanvas.drawPhysicalEntity(physicalEntity);
    }

    // draw Physical Associations
    for (PhysicalAssociation physicalAssociation : activity.getPhysicalAssociations()) {
      List<Integer> waypoints = physicalAssociation.getWaypoints();
      for (int i = 2; i < waypoints.size(); i += 2) {
        if (i < waypoints.size() - 2) {
          processDiagramCanvas.drawMessageFlowWithoutArrow(waypoints.get(i - 2), waypoints.get(i - 1), waypoints.get(i), waypoints.get(i + 1));
        } else {
          processDiagramCanvas.drawMessageFlow(waypoints.get(i - 2), waypoints.get(i - 1), waypoints.get(i), waypoints.get(i + 1));
        }
      }
      processDiagramCanvas.drawMessageFlowStart(waypoints.get(0), waypoints.get(1));
    }

    // Outgoing transitions of activity
    for (PvmTransition sequenceFlow : activity.getOutgoingTransitions()) {
      List<Integer> waypoints = ((TransitionImpl) sequenceFlow).getWaypoints();
      for (int i = 2; i < waypoints.size(); i += 2) { // waypoints.size()
                                                      // minimally 4: x1, y1,
                                                      // x2, y2
        boolean drawConditionalIndicator = (i == 2) && sequenceFlow.getProperty(BpmnParse.PROPERTYNAME_CONDITION) != null
                && !((String) activity.getProperty("type")).toLowerCase().contains("gateway");
        if (i < waypoints.size() - 2) {
          processDiagramCanvas.drawSequenceflowWithoutArrow(waypoints.get(i - 2), waypoints.get(i - 1), waypoints.get(i), waypoints.get(i + 1),
                  drawConditionalIndicator);
        } else {
          processDiagramCanvas.drawSequenceflow(waypoints.get(i - 2), waypoints.get(i - 1), waypoints.get(i), waypoints.get(i + 1), drawConditionalIndicator);
        }
      }
    }

    // Nested activities (boundary events)
    for (ActivityImpl nestedActivity : activity.getActivities()) {
      drawActivity(processDiagramCanvas, nestedActivity, highLightedActivities);
    }
  }

  private static void drawHighLight(ProcessDiagramCanvas processDiagramCanvas, ActivityImpl activity) {
    processDiagramCanvas.drawHighLight(activity.getX(), activity.getY(), activity.getWidth(), activity.getHeight());

  }

  protected static ProcessDiagramCanvas initProcessDiagramCanvas(ProcessDefinitionEntity processDefinition) {
    int minX = Integer.MAX_VALUE;
    int maxX = 0;
    int minY = Integer.MAX_VALUE;
    int maxY = 0;
    
    if(processDefinition.getParticipantProcess() != null) {
      ParticipantProcess pProc = processDefinition.getParticipantProcess();
      
      minX = pProc.getX();
      maxX = pProc.getX() + pProc.getWidth();
      minY = pProc.getY();
      maxY = pProc.getY() + pProc.getHeight();
    }
    
    for (ActivityImpl activity : processDefinition.getActivities()) {

      // width
      if (activity.getX() + activity.getWidth() > maxX) {
        maxX = activity.getX() + activity.getWidth();
      }
      if (activity.getX() < minX) {
        minX = activity.getX();
      }
      // height
      if (activity.getY() + activity.getHeight() > maxY) {
        maxY = activity.getY() + activity.getHeight();
      }
      if (activity.getY() < minY) {
        minY = activity.getY();
      }
      
      for (PhysicalAssociation physicalAssociation : activity.getPhysicalAssociations()) {
        PhysicalEntity physicalEntity = physicalAssociation.getPhysicalEntity();
        // width
        if (physicalEntity.getX() + physicalEntity.getWidth() > maxX) {
          maxX = physicalEntity.getX() + physicalEntity.getWidth();
        }
        if (physicalEntity.getX() < minX) {
          minX = physicalEntity.getX();
        }
        // height
        if (physicalEntity.getY() + physicalEntity.getHeight() > maxY) {
          maxY = physicalEntity.getY() + physicalEntity.getHeight();
        }
        if (physicalEntity.getY() < minY) {
          minY = physicalEntity.getY();
        }
      }
      
      List<HasWaypoints> hasWaypointsList = new ArrayList<HasWaypoints>();
      for (PvmTransition sequenceFlow : activity.getOutgoingTransitions()) {
        TransitionImpl transitionImpl = (TransitionImpl) sequenceFlow;
        hasWaypointsList.add(transitionImpl);
      }
      for (PhysicalAssociation physicalAssociation : activity.getPhysicalAssociations()) {
        hasWaypointsList.add(physicalAssociation);
      }
      for (HasWaypoints hasWaypoints : hasWaypointsList) {
        List<Integer> waypoints = hasWaypoints.getWaypoints();
        for (int i = 0; i < waypoints.size(); i += 2) {
          // width
          if (waypoints.get(i) > maxX) {
            maxX = waypoints.get(i);
          }
          if (waypoints.get(i) < minX) {
            minX = waypoints.get(i);
          }
          // height
          if (waypoints.get(i + 1) > maxY) {
            maxY = waypoints.get(i + 1);
          }
          if (waypoints.get(i + 1) < minY) {
            minY = waypoints.get(i + 1);
          }
        }
      }
    }
    
    if(processDefinition.getLaneSets() != null && processDefinition.getLaneSets().size() > 0) {
      for(LaneSet laneSet : processDefinition.getLaneSets()) {
        if(laneSet.getLanes() != null && laneSet.getLanes().size() > 0) {
          for(Lane lane : laneSet.getLanes()) {
            // width
            if (lane.getX() + lane.getWidth() > maxX) {
              maxX = lane.getX() + lane.getWidth();
            }
            if (lane.getX() < minX) {
              minX = lane.getX();
            }
            // height
            if (lane.getY() + lane.getHeight() > maxY) {
              maxY = lane.getY() + lane.getHeight();
            }
            if (lane.getY() < minY) {
              minY = lane.getY();
            }
          }
        }
      }
    }
    
    return new ProcessDiagramCanvas(maxX + 10, maxY + 10, minX, minY);
  }

  protected interface ActivityDrawInstruction {

    void draw(ProcessDiagramCanvas processDiagramCreator, ActivityImpl activityImpl);

  }

}
