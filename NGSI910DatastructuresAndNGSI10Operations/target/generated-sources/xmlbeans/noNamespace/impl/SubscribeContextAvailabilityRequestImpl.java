/*
 * XML Type:  SubscribeContextAvailabilityRequest
 * Namespace: 
 * Java type: noNamespace.SubscribeContextAvailabilityRequest
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML SubscribeContextAvailabilityRequest(@).
 *
 * This is a complex type.
 */
public class SubscribeContextAvailabilityRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.SubscribeContextAvailabilityRequest
{
    private static final long serialVersionUID = 1L;
    
    public SubscribeContextAvailabilityRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYIDLIST$0 = 
        new javax.xml.namespace.QName("", "entityIdList");
    private static final javax.xml.namespace.QName ATTRIBUTELIST$2 = 
        new javax.xml.namespace.QName("", "attributeList");
    private static final javax.xml.namespace.QName REFERENCE$4 = 
        new javax.xml.namespace.QName("", "reference");
    private static final javax.xml.namespace.QName DURATION$6 = 
        new javax.xml.namespace.QName("", "duration");
    private static final javax.xml.namespace.QName SUBSCRIPTIONID$8 = 
        new javax.xml.namespace.QName("", "subscriptionId");
    
    
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
     * Gets the "reference" element
     */
    public java.lang.String getReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "reference" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(REFERENCE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "reference" element
     */
    public void setReference(java.lang.String reference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCE$4);
            }
            target.setStringValue(reference);
        }
    }
    
    /**
     * Sets (as xml) the "reference" element
     */
    public void xsetReference(org.apache.xmlbeans.XmlAnyURI reference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(REFERENCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(REFERENCE$4);
            }
            target.set(reference);
        }
    }
    
    /**
     * Gets the "duration" element
     */
    public org.apache.xmlbeans.GDuration getDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "duration" element
     */
    public org.apache.xmlbeans.XmlDuration xgetDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(DURATION$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "duration" element
     */
    public boolean isSetDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DURATION$6) != 0;
        }
    }
    
    /**
     * Sets the "duration" element
     */
    public void setDuration(org.apache.xmlbeans.GDuration duration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DURATION$6);
            }
            target.setGDurationValue(duration);
        }
    }
    
    /**
     * Sets (as xml) the "duration" element
     */
    public void xsetDuration(org.apache.xmlbeans.XmlDuration duration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(DURATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDuration)get_store().add_element_user(DURATION$6);
            }
            target.set(duration);
        }
    }
    
    /**
     * Unsets the "duration" element
     */
    public void unsetDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DURATION$6, 0);
        }
    }
    
    /**
     * Gets the "subscriptionId" element
     */
    public java.lang.String getSubscriptionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIPTIONID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "subscriptionId" element
     */
    public org.apache.xmlbeans.XmlString xgetSubscriptionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSCRIPTIONID$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "subscriptionId" element
     */
    public boolean isSetSubscriptionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIPTIONID$8) != 0;
        }
    }
    
    /**
     * Sets the "subscriptionId" element
     */
    public void setSubscriptionId(java.lang.String subscriptionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIPTIONID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSCRIPTIONID$8);
            }
            target.setStringValue(subscriptionId);
        }
    }
    
    /**
     * Sets (as xml) the "subscriptionId" element
     */
    public void xsetSubscriptionId(org.apache.xmlbeans.XmlString subscriptionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSCRIPTIONID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBSCRIPTIONID$8);
            }
            target.set(subscriptionId);
        }
    }
    
    /**
     * Unsets the "subscriptionId" element
     */
    public void unsetSubscriptionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIPTIONID$8, 0);
        }
    }
}
