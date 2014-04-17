package com.sap.research.fiware.ngsi10.simple.wrappers;

import noNamespace.EntityId;

public class EntityIdWrapper {

	private EntityId entityId;

	public EntityIdWrapper(EntityId entityId) {
		this.entityId = entityId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((entityId.getId() == null) ? 0 : entityId.getId().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntityIdWrapper other = (EntityIdWrapper) obj;
		if (entityId.getId() == null) {
			if (other.entityId.getId() != null)
				return false;
		} else if (!entityId.getId().equals(other.entityId.getId()))
			return false;
		return true;
	}

	public EntityId getEntityId() {
		return entityId;
	}

	public void setEntityId(EntityId entityId) {
		this.entityId = entityId;
	}
	
}
