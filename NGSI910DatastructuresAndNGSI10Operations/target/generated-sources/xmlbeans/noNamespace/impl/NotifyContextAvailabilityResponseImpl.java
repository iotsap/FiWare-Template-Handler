/*
 * XML Type:  NotifyContextAvailabilityResponse
 * Namespace: 
 * Java type: noNamespace.NotifyContextAvailabilityResponse
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML NotifyContextAvailabilityResponse(@).
 *
 * This is a complex type.
 */
public class NotifyContextAvailabilityResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.NotifyContextAvailabilityResponse
{
    private static final long serialVersionUID = 1L;
    
    public NotifyContextAvailabilityResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
