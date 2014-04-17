/*
 * XML Type:  UnsubscribeContextRequest
 * Namespace: 
 * Java type: noNamespace.UnsubscribeContextRequest
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML UnsubscribeContextRequest(@).
 *
 * This is a complex type.
 */
public class UnsubscribeContextRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.UnsubscribeContextRequest
{
    private static final long serialVersionUID = 1L;
    
    public UnsubscribeContextRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIPTIONID$0 = 
        new javax.xml.namespace.QName("", "subscriptionId");
    
    
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
}
