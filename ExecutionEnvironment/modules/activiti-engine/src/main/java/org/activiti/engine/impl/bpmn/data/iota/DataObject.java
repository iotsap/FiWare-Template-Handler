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

package org.activiti.engine.impl.bpmn.data.iota;

import java.util.ArrayList;
import java.util.List;

import org.activiti.engine.impl.bpmn.data.AbstractDataAssociation;
import org.activiti.engine.impl.pvm.process.HasDIBounds;
import org.activiti.engine.impl.pvm.process.PhysicalAssociation;

/**
 * Implementation of the BPMN 2.0 'data object'
 * 
 * @author Armin Zamani, SAP
 */
public class DataObject implements HasDIBounds {
	private String id;
	private String name;
	private String isCollection;
	private Object value;
  protected int x = -1;
  protected int y = -1;
  protected int width = -1;
  protected int height = -1;
  protected List<AbstractDataAssociation> dataAssociations = new ArrayList<AbstractDataAssociation>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	/**
	 * @return the isCollection
	 */
	public String getIsCollection() {
		return isCollection;
	}

	/**
	 * @param isCollection the isCollection to set
	 */
	public void setIsCollection(String isCollection) {
		this.isCollection = isCollection;
	}
	
	public String toString() {
		return name;
	}

  public int getX() {
    return x;
  }
  
  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public List<AbstractDataAssociation> getDataAssociations() {
    return dataAssociations;
  }

}
