/*
 * XML Type:  EntityIdList
 * Namespace: 
 * Java type: noNamespace.EntityIdList
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML EntityIdList(@).
 *
 * This is a complex type.
 */
public class EntityIdListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.EntityIdList
{
    private static final long serialVersionUID = 1L;
    
    public EntityIdListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("", "entityId");
    
    
    /**
     * Gets array of all "entityId" elements
     */
    public noNamespace.EntityId[] getEntityIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTITYID$0, targetList);
            noNamespace.EntityId[] result = new noNamespace.EntityId[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "entityId" element
     */
    public noNamespace.EntityId getEntityIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.EntityId target = null;
            target = (noNamespace.EntityId)get_store().find_element_user(ENTITYID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "entityId" element
     */
    public int sizeOfEntityIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYID$0);
        }
    }
    
    /**
     * Sets array of all "entityId" element
     */
    public void setEntityIdArray(noNamespace.EntityId[] entityIdArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(entityIdArray, ENTITYID$0);
        }
    }
    
    /**
     * Sets ith "entityId" element
     */
    public void setEntityIdArray(int i, noNamespace.EntityId entityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.EntityId target = null;
            target = (noNamespace.EntityId)get_store().find_element_user(ENTITYID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entityId);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entityId" element
     */
    public noNamespace.EntityId insertNewEntityId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.EntityId target = null;
            target = (noNamespace.EntityId)get_store().insert_element_user(ENTITYID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entityId" element
     */
    public noNamespace.EntityId addNewEntityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.EntityId target = null;
            target = (noNamespace.EntityId)get_store().add_element_user(ENTITYID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "entityId" element
     */
    public void removeEntityId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYID$0, i);
        }
    }
}
