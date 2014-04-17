//the original file has been modified by SAP Research, 2014

package org.activiti.engine.impl.pvm.process;

import java.util.ArrayList;
import java.util.List;

/**
 * @see TransitionImpl
 */
public class PhysicalAssociation implements HasWaypoints {

  /** The activity operating on the physical entity. */
  protected ActivityImpl activity;

  /** The physical entity on which the activity operates. */
  protected PhysicalEntity physicalEntity;

  /** Graphical information: a list of waypoints: x1, y1, x2, y2, x3, y3, .. */
  protected List<Integer> waypoints = new ArrayList<Integer>();

  public ActivityImpl getActivity() {
    return activity;
  }

  public void setActivity(ActivityImpl activity) {
    this.activity = activity;
  }

  public PhysicalEntity getPhysicalEntity() {
    return physicalEntity;
  }

  public void setPhysicalEntity(PhysicalEntity physicalEntity) {
    this.physicalEntity = physicalEntity;
  }

  public List<Integer> getWaypoints() {
    return waypoints;
  }
  
  public void setWaypoints(List<Integer> waypoints) {
    this.waypoints = waypoints;
  }

}
