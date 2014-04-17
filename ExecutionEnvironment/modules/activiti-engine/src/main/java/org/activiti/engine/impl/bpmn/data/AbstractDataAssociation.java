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
package org.activiti.engine.impl.bpmn.data;

import java.util.ArrayList;
import java.util.List;

import org.activiti.engine.delegate.Expression;
import org.activiti.engine.impl.pvm.delegate.ActivityExecution;
import org.activiti.engine.impl.pvm.process.HasWaypoints;

/**
 * A data association (Input or Output) between a source and a target
 * 
 * @author Esteban Robles Luna
 */
public abstract class AbstractDataAssociation implements HasWaypoints {

  protected String source;

  protected Expression sourceExpression;

  protected String target;
  
  /** Graphical information: a list of waypoints: x1, y1, x2, y2, x3, y3, .. */
  protected List<Integer> waypoints = new ArrayList<Integer>();

  protected AbstractDataAssociation(String source, String target) {
    this.source = source;
    this.target = target;
  }

  protected AbstractDataAssociation(Expression sourceExpression, String target) {
    this.sourceExpression = sourceExpression;
    this.target = target;
  }

  public abstract void evaluate(ActivityExecution execution);
  
  public String getSource() {
    return source;
  }
  
  public String getTarget() {
    return target;
  }

  
  public Expression getSourceExpression() {
    return sourceExpression;
  }

  public List<Integer> getWaypoints() {
    return waypoints;
  }
  
  public void setWaypoints(List<Integer> waypoints) {
    this.waypoints = waypoints;
  }

}
