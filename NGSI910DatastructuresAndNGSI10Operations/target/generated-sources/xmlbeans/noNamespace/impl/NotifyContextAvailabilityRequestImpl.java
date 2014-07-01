/*
 * XML Type:  NotifyContextAvailabilityRequest
 * Namespace: 
 * Java type: noNamespace.NotifyContextAvailabilityRequest
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML NotifyContextAvailabilityRequest(@).
 *
 * This is a complex type.
 */
public class NotifyContextAvailabilityRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.NotifyContextAvailabilityRequest
{
    private static final long serialVersionUID = 1L;
    
    public NotifyContextAvailabilityRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIPTIONID$0 = 
        new javax.xml.namespace.QName("", "subscriptionId");
    private static final javax.xml.namespace.QName CONTEXTREGISTRATIONRESPONSELIST$2 = 
        new javax.xml.namespace.QName("", "contextRegistrationResponseList");
    private static final javax.xml.namespace.QName ERRORCODE$4 = 
        new javax.xml.namespace.QName("", "errorCode");
    
    
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
     * Gets the "contextRegistrationResponseList" element
     */
    public noNamespace.ContextRegistrationResponseList getContextRegistrationResponseList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationResponseList target = null;
            target = (noNamespace.ContextRegistrationResponseList)get_store().find_element_user(CONTEXTREGISTRATIONRESPONSELIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "contextRegistrationResponseList" element
     */
    public boolean isSetContextRegistrationResponseList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXTREGISTRATIONRESPONSELIST$2) != 0;
        }
    }
    
    /**
     * Sets the "contextRegistrationResponseList" element
     */
    public void setContextRegistrationResponseList(noNamespace.ContextRegistrationResponseList contextRegistrationResponseList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationResponseList target = null;
            target = (noNamespace.ContextRegistrationResponseList)get_store().find_element_user(CONTEXTREGISTRATIONRESPONSELIST$2, 0);
            if (target == null)
            {
                target = (noNamespace.ContextRegistrationResponseList)get_store().add_element_user(CONTEXTREGISTRATIONRESPONSELIST$2);
            }
            target.set(contextRegistrationResponseList);
        }
    }
    
    /**
     * Appends and returns a new empty "contextRegistrationResponseList" element
     */
    public noNamespace.ContextRegistrationResponseList addNewContextRegistrationResponseList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationResponseList target = null;
            target = (noNamespace.ContextRegistrationResponseList)get_store().add_element_user(CONTEXTREGISTRATIONRESPONSELIST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "contextRegistrationResponseList" element
     */
    public void unsetContextRegistrationResponseList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXTREGISTRATIONRESPONSELIST$2, 0);
        }
    }
    
    /**
     * Gets the "errorCode" element
     */
    public noNamespace.StatusCode getErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.StatusCode target = null;
            target = (noNamespace.StatusCode)get_store().find_element_user(ERRORCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "errorCode" element
     */
    public boolean isSetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "errorCode" element
     */
    public void setErrorCode(noNamespace.StatusCode errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.StatusCode target = null;
            target = (noNamespace.StatusCode)get_store().find_element_user(ERRORCODE$4, 0);
            if (target == null)
            {
                target = (noNamespace.StatusCode)get_store().add_element_user(ERRORCODE$4);
            }
            target.set(errorCode);
        }
    }
    
    /**
     * Appends and returns a new empty "errorCode" element
     */
    public noNamespace.StatusCode addNewErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.StatusCode target = null;
            target = (noNamespace.StatusCode)get_store().add_element_user(ERRORCODE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "errorCode" element
     */
    public void unsetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORCODE$4, 0);
        }
    }
}
