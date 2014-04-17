/*
 * XML Type:  SubscribeResponse
 * Namespace: 
 * Java type: noNamespace.SubscribeResponse
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML SubscribeResponse(@).
 *
 * This is a complex type.
 */
public class SubscribeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.SubscribeResponse
{
    private static final long serialVersionUID = 1L;
    
    public SubscribeResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIPTIONID$0 = 
        new javax.xml.namespace.QName("", "subscriptionId");
    private static final javax.xml.namespace.QName DURATION$2 = 
        new javax.xml.namespace.QName("", "duration");
    private static final javax.xml.namespace.QName THROTTLING$4 = 
        new javax.xml.namespace.QName("", "throttling");
    
    
    /**
     * Gets the "subscriptionId" element
     */
    public java.lang.String getSubscriptionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIPTIONID$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSCRIPTIONID$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIPTIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSCRIPTIONID$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSCRIPTIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBSCRIPTIONID$0);
            }
            target.set(subscriptionId);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$2, 0);
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
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(DURATION$2, 0);
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
            return get_store().count_elements(DURATION$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DURATION$2);
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
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(DURATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDuration)get_store().add_element_user(DURATION$2);
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
            get_store().remove_element(DURATION$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THROTTLING$4, 0);
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
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(THROTTLING$4, 0);
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
            return get_store().count_elements(THROTTLING$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THROTTLING$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(THROTTLING$4);
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
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(THROTTLING$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDuration)get_store().add_element_user(THROTTLING$4);
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
            get_store().remove_element(THROTTLING$4, 0);
        }
    }
}
