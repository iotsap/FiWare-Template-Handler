/*
 * An XML document type.
 * Localname: entityId
 * Namespace: 
 * Java type: noNamespace.EntityIdDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one entityId(@) element.
 *
 * This is a complex type.
 */
public class EntityIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.EntityIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntityIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("", "entityId");
    
    
    /**
     * Gets the "entityId" element
     */
    public noNamespace.EntityId getEntityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.EntityId target = null;
            target = (noNamespace.EntityId)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entityId" element
     */
    public void setEntityId(noNamespace.EntityId entityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.EntityId target = null;
            target = (noNamespace.EntityId)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                target = (noNamespace.EntityId)get_store().add_element_user(ENTITYID$0);
            }
            target.set(entityId);
        }
    }
    
    /**
     * Appends and returns a new empty "entityId" element
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
}
