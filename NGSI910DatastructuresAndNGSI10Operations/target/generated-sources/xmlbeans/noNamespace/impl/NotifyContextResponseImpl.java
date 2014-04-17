/*
 * XML Type:  NotifyContextResponse
 * Namespace: 
 * Java type: noNamespace.NotifyContextResponse
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML NotifyContextResponse(@).
 *
 * This is a complex type.
 */
public class NotifyContextResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.NotifyContextResponse
{
    private static final long serialVersionUID = 1L;
    
    public NotifyContextResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSECODE$0 = 
        new javax.xml.namespace.QName("", "responseCode");
    
    
    /**
     * Gets the "responseCode" element
     */
    public noNamespace.StatusCode getResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.StatusCode target = null;
            target = (noNamespace.StatusCode)get_store().find_element_user(RESPONSECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "responseCode" element
     */
    public void setResponseCode(noNamespace.StatusCode responseCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.StatusCode target = null;
            target = (noNamespace.StatusCode)get_store().find_element_user(RESPONSECODE$0, 0);
            if (target == null)
            {
                target = (noNamespace.StatusCode)get_store().add_element_user(RESPONSECODE$0);
            }
            target.set(responseCode);
        }
    }
    
    /**
     * Appends and returns a new empty "responseCode" element
     */
    public noNamespace.StatusCode addNewResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.StatusCode target = null;
            target = (noNamespace.StatusCode)get_store().add_element_user(RESPONSECODE$0);
            return target;
        }
    }
}
