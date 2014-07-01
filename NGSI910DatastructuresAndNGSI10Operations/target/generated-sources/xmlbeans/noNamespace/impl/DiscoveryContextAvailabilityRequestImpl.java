/*
 * XML Type:  DiscoveryContextAvailabilityRequest
 * Namespace: 
 * Java type: noNamespace.DiscoveryContextAvailabilityRequest
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML DiscoveryContextAvailabilityRequest(@).
 *
 * This is a complex type.
 */
public class DiscoveryContextAvailabilityRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DiscoveryContextAvailabilityRequest
{
    private static final long serialVersionUID = 1L;
    
    public DiscoveryContextAvailabilityRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYIDLIST$0 = 
        new javax.xml.namespace.QName("", "entityIdList");
    private static final javax.xml.namespace.QName ATTRIBUTELIST$2 = 
        new javax.xml.namespace.QName("", "attributeList");
    private static final javax.xml.namespace.QName RESTRICTION$4 = 
        new javax.xml.namespace.QName("", "restriction");
    
    
    /**
     * Gets the "entityIdList" element
     */
    public noNamespace.EntityIdList getEntityIdList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.EntityIdList target = null;
            target = (noNamespace.EntityIdList)get_store().find_element_user(ENTITYIDLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entityIdList" element
     */
    public void setEntityIdList(noNamespace.EntityIdList entityIdList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.EntityIdList target = null;
            target = (noNamespace.EntityIdList)get_store().find_element_user(ENTITYIDLIST$0, 0);
            if (target == null)
            {
                target = (noNamespace.EntityIdList)get_store().add_element_user(ENTITYIDLIST$0);
            }
            target.set(entityIdList);
        }
    }
    
    /**
     * Appends and returns a new empty "entityIdList" element
     */
    public noNamespace.EntityIdList addNewEntityIdList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.EntityIdList target = null;
            target = (noNamespace.EntityIdList)get_store().add_element_user(ENTITYIDLIST$0);
            return target;
        }
    }
    
    /**
     * Gets the "attributeList" element
     */
    public noNamespace.AttributeList getAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.AttributeList target = null;
            target = (noNamespace.AttributeList)get_store().find_element_user(ATTRIBUTELIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "attributeList" element
     */
    public boolean isSetAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTELIST$2) != 0;
        }
    }
    
    /**
     * Sets the "attributeList" element
     */
    public void setAttributeList(noNamespace.AttributeList attributeList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.AttributeList target = null;
            target = (noNamespace.AttributeList)get_store().find_element_user(ATTRIBUTELIST$2, 0);
            if (target == null)
            {
                target = (noNamespace.AttributeList)get_store().add_element_user(ATTRIBUTELIST$2);
            }
            target.set(attributeList);
        }
    }
    
    /**
     * Appends and returns a new empty "attributeList" element
     */
    public noNamespace.AttributeList addNewAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.AttributeList target = null;
            target = (noNamespace.AttributeList)get_store().add_element_user(ATTRIBUTELIST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "attributeList" element
     */
    public void unsetAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTELIST$2, 0);
        }
    }
    
    /**
     * Gets the "restriction" element
     */
    public noNamespace.Restriction getRestriction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.Restriction target = null;
            target = (noNamespace.Restriction)get_store().find_element_user(RESTRICTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "restriction" element
     */
    public boolean isSetRestriction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESTRICTION$4) != 0;
        }
    }
    
    /**
     * Sets the "restriction" element
     */
    public void setRestriction(noNamespace.Restriction restriction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.Restriction target = null;
            target = (noNamespace.Restriction)get_store().find_element_user(RESTRICTION$4, 0);
            if (target == null)
            {
                target = (noNamespace.Restriction)get_store().add_element_user(RESTRICTION$4);
            }
            target.set(restriction);
        }
    }
    
    /**
     * Appends and returns a new empty "restriction" element
     */
    public noNamespace.Restriction addNewRestriction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.Restriction target = null;
            target = (noNamespace.Restriction)get_store().add_element_user(RESTRICTION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "restriction" element
     */
    public void unsetRestriction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESTRICTION$4, 0);
        }
    }
}
