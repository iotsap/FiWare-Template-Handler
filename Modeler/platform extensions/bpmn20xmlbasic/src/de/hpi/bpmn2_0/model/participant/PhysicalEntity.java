/**
 * NGSI Physical Entity
 * 
 */

package de.hpi.bpmn2_0.model.participant;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import de.hpi.bpmn2_0.model.conversation.ConversationElement;
import de.hpi.bpmn2_0.transformation.Visitor;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name ="tPhysicalEntity")

public class PhysicalEntity
	extends Participant implements ConversationElement
{
  @XmlElement(required = true)
  EntityId entityId;
  
	public PhysicalEntity() {
		/*super();*/
	}
	
	public PhysicalEntity(PhysicalEntity phy){
		super(phy);
		this.setEntityId(phy.getEntityId());
	}
	
	public void acceptVisitor(Visitor v){
		v.visitPhysicalEntity(this);
	}

  
  public EntityId getEntityId() {
    return entityId;
  }

  public void setEntityId(EntityId entityId) {
    this.entityId = entityId;
  }
	
	


}
