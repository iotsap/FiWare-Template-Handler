/*
 * XML Type:  NotifyContextRequest
 * Namespace: 
 * Java type: noNamespace.NotifyContextRequest
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML NotifyContextRequest(@).
 *
 * This is a complex type.
 */
public class NotifyContextRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.NotifyContextRequest
{
    private static final long serialVersionUID = 1L;
    
    public NotifyContextRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIPTIONID$0 = 
        new javax.xml.namespace.QName("", "subscriptionId");
    private static final javax.xml.namespace.QName ORIGINATOR$2 = 
        new javax.xml.namespace.QName("", "originator");
    private static final javax.xml.namespace.QName CONTEXTRESPONSELIST$4 = 
        new javax.xml.namespace.QName("", "contextResponseList");
    
    
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
     * Gets the "originator" element
     */
    public java.lang.String getOriginator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINATOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "originator" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetOriginator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ORIGINATOR$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "originator" element
     */
    public void setOriginator(java.lang.String originator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINATOR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGINATOR$2);
            }
            target.setStringValue(originator);
        }
    }
    
    /**
     * Sets (as xml) the "originator" element
     */
    public void xsetOriginator(org.apache.xmlbeans.XmlAnyURI originator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ORIGINATOR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ORIGINATOR$2);
            }
            target.set(originator);
        }
    }
    
    /**
     * Gets the "contextResponseList" element
     */
    public noNamespace.ContextElementResponseList getContextResponseList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElementResponseList target = null;
            target = (noNamespace.ContextElementResponseList)get_store().find_element_user(CONTEXTRESPONSELIST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "contextResponseList" element
     */
    public boolean isSetContextResponseList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXTRESPONSELIST$4) != 0;
        }
    }
    
    /**
     * Sets the "contextResponseList" element
     */
    public void setContextResponseList(noNamespace.ContextElementResponseList contextResponseList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElementResponseList target = null;
            target = (noNamespace.ContextElementResponseList)get_store().find_element_user(CONTEXTRESPONSELIST$4, 0);
            if (target == null)
            {
                target = (noNamespace.ContextElementResponseList)get_store().add_element_user(CONTEXTRESPONSELIST$4);
            }
            target.set(contextResponseList);
        }
    }
    
    /**
     * Appends and returns a new empty "contextResponseList" element
     */
    public noNamespace.ContextElementResponseList addNewContextResponseList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElementResponseList target = null;
            target = (noNamespace.ContextElementResponseList)get_store().add_element_user(CONTEXTRESPONSELIST$4);
            return target;
        }
    }
    
    /**
     * Unsets the "contextResponseList" element
     */
    public void unsetContextResponseList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXTRESPONSELIST$4, 0);
        }
    }
}
