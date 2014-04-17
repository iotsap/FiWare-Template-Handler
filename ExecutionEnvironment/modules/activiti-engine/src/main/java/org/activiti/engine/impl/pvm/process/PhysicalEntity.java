//the original file has been modified by SAP Research, 2014

package org.activiti.engine.impl.pvm.process;

import noNamespace.EntityId;

public class PhysicalEntity extends ParticipantProcess {

  protected EntityId entityID;

  public EntityId getEntityID() {
    return entityID;
  }

  public void setEntityID(EntityId entityID) {
    this.entityID = entityID;
  }

}
