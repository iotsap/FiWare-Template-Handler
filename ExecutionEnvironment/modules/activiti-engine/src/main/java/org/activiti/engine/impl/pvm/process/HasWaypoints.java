package org.activiti.engine.impl.pvm.process;

import java.util.List;

/**
 * @see HasDIBounds
 */
public interface HasWaypoints {

  public List<Integer> getWaypoints();
  public void setWaypoints(List<Integer> waypoints);

}
