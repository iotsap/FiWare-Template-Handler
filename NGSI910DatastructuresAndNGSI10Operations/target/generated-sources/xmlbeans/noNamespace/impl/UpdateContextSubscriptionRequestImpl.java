/*
 * XML Type:  UpdateContextSubscriptionRequest
 * Namespace: 
 * Java type: noNamespace.UpdateContextSubscriptionRequest
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML UpdateContextSubscriptionRequest(@).
 *
 * This is a complex type.
 */
public class UpdateContextSubscriptionRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.UpdateContextSubscriptionRequest
{
    private static final long serialVersionUID = 1L;
    
    public UpdateContextSubscriptionRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DURATION$0 = 
        new javax.xml.namespace.QName("", "duration");
    private static final javax.xml.namespace.QName RESTRICTION$2 = 
        new javax.xml.namespace.QName("", "restriction");
    private static final javax.xml.namespace.QName SUBSCRIPTIONID$4 = 
        new javax.xml.namespace.QName("", "subscriptionId");
    private static final javax.xml.namespace.QName NOTIFYCONDITIONS$6 = 
        new javax.xml.namespace.QName("", "notifyConditions");
    private static final javax.xml.namespace.QName THROTTLING$8 = 
        new javax.xml.namespace.QName("", "throttling");
    
    
    /**
     * Gets the "duration" element
     */
    public org.apache.xmlbeans.GDuration getDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$0, 0);
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
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(DURATION$0, 0);
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
            return get_store().count_elements(DURATION$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DURATION$0);
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
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(DURATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDuration)get_store().add_element_user(DURATION$0);
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
            get_store().remove_element(DURATION$0, 0);
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
            target = (noNamespace.Restriction)get_store().find_element_user(RESTRICTION$2, 0);
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
            return get_store().count_elements(RESTRICTION$2) != 0;
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
            target = (noNamespace.Restriction)get_store().find_element_user(RESTRICTION$2, 0);
            if (target == null)
            {
                target = (noNamespace.Restriction)get_store().add_element_user(RESTRICTION$2);
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
            target = (noNamespace.Restriction)get_store().add_element_user(RESTRICTION$2);
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
            get_store().remove_element(RESTRICTION$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIPTIONID$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSCRIPTIONID$4, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIPTIONID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSCRIPTIONID$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSCRIPTIONID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBSCRIPTIONID$4);
            }
            target.set(subscriptionId);
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
            target = (noNamespace.NotifyConditionList)get_store().find_element_user(NOTIFYCONDITIONS$6, 0);
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
            return get_store().count_elements(NOTIFYCONDITIONS$6) != 0;
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
            target = (noNamespace.NotifyConditionList)get_store().find_element_user(NOTIFYCONDITIONS$6, 0);
            if (target == null)
            {
                target = (noNamespace.NotifyConditionList)get_store().add_element_user(NOTIFYCONDITIONS$6);
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
            target = (noNamespace.NotifyConditionList)get_store().add_element_user(NOTIFYCONDITIONS$6);
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
            get_store().remove_element(NOTIFYCONDITIONS$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THROTTLING$8, 0);
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
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(THROTTLING$8, 0);
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
            return get_store().count_elements(THROTTLING$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THROTTLING$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(THROTTLING$8);
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
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(THROTTLING$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDuration)get_store().add_element_user(THROTTLING$8);
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
            get_store().remove_element(THROTTLING$8, 0);
        }
    }
}
