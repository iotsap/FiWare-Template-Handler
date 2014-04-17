/*
 * XML Type:  SubscribeContextRequest
 * Namespace: 
 * Java type: noNamespace.SubscribeContextRequest
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML SubscribeContextRequest(@).
 *
 * This is a complex type.
 */
public class SubscribeContextRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.SubscribeContextRequest
{
    private static final long serialVersionUID = 1L;
    
    public SubscribeContextRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName RESTRICTION$8 = 
        new javax.xml.namespace.QName("", "restriction");
    private static final javax.xml.namespace.QName NOTIFYCONDITIONS$10 = 
        new javax.xml.namespace.QName("", "notifyConditions");
    private static final javax.xml.namespace.QName THROTTLING$12 = 
        new javax.xml.namespace.QName("", "throttling");
    
    
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
    public org.apache.xmlbeans.XmlObject getReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(REFERENCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "reference" element
     */
    public void setReference(org.apache.xmlbeans.XmlObject reference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(REFERENCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(REFERENCE$4);
            }
            target.set(reference);
        }
    }
    
    /**
     * Appends and returns a new empty "reference" element
     */
    public org.apache.xmlbeans.XmlObject addNewReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(REFERENCE$4);
            return target;
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
     * Gets the "restriction" element
     */
    public noNamespace.Restriction getRestriction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.Restriction target = null;
            target = (noNamespace.Restriction)get_store().find_element_user(RESTRICTION$8, 0);
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
            return get_store().count_elements(RESTRICTION$8) != 0;
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
            target = (noNamespace.Restriction)get_store().find_element_user(RESTRICTION$8, 0);
            if (target == null)
            {
                target = (noNamespace.Restriction)get_store().add_element_user(RESTRICTION$8);
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
            target = (noNamespace.Restriction)get_store().add_element_user(RESTRICTION$8);
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
            get_store().remove_element(RESTRICTION$8, 0);
        }
    }
    
    /**
     * Gets the "notifyConditions" element
     */
    public noNamespace.NotifyConditionList getNotifyConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NotifyConditionList target = null;
            target = (noNamespace.NotifyConditionList)get_store().find_element_user(NOTIFYCONDITIONS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "notifyConditions" element
     */
    public boolean isSetNotifyConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTIFYCONDITIONS$10) != 0;
        }
    }
    
    /**
     * Sets the "notifyConditions" element
     */
    public void setNotifyConditions(noNamespace.NotifyConditionList notifyConditions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NotifyConditionList target = null;
            target = (noNamespace.NotifyConditionList)get_store().find_element_user(NOTIFYCONDITIONS$10, 0);
            if (target == null)
            {
                target = (noNamespace.NotifyConditionList)get_store().add_element_user(NOTIFYCONDITIONS$10);
            }
            target.set(notifyConditions);
        }
    }
    
    /**
     * Appends and returns a new empty "notifyConditions" element
     */
    public noNamespace.NotifyConditionList addNewNotifyConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NotifyConditionList target = null;
            target = (noNamespace.NotifyConditionList)get_store().add_element_user(NOTIFYCONDITIONS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "notifyConditions" element
     */
    public void unsetNotifyConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTIFYCONDITIONS$10, 0);
        }
    }
    
    /**
     * Gets the "throttling" element
     */
    public org.apache.xmlbeans.GDuration getThrottling()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THROTTLING$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "throttling" element
     */
    public org.apache.xmlbeans.XmlDuration xgetThrottling()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(THROTTLING$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "throttling" element
     */
    public boolean isSetThrottling()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(THROTTLING$12) != 0;
        }
    }
    
    /**
     * Sets the "throttling" element
     */
    public void setThrottling(org.apache.xmlbeans.GDuration throttling)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THROTTLING$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(THROTTLING$12);
            }
            target.setGDurationValue(throttling);
        }
    }
    
    /**
     * Sets (as xml) the "throttling" element
     */
    public void xsetThrottling(org.apache.xmlbeans.XmlDuration throttling)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(THROTTLING$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDuration)get_store().add_element_user(THROTTLING$12);
            }
            target.set(throttling);
        }
    }
    
    /**
     * Unsets the "throttling" element
     */
    public void unsetThrottling()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(THROTTLING$12, 0);
        }
    }
}
