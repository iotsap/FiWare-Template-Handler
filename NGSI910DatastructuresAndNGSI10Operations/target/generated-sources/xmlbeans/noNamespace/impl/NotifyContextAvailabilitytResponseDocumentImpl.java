/*
 * An XML document type.
 * Localname: notifyContextAvailabilitytResponse
 * Namespace: 
 * Java type: noNamespace.NotifyContextAvailabilitytResponseDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one notifyContextAvailabilitytResponse(@) element.
 *
 * This is a complex type.
 */
public class NotifyContextAvailabilitytResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.NotifyContextAvailabilitytResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public NotifyContextAvailabilitytResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTIFYCONTEXTAVAILABILITYTRESPONSE$0 = 
        new javax.xml.namespace.QName("", "notifyContextAvailabilitytResponse");
    
    
    /**
     * Gets the "notifyContextAvailabilitytResponse" element
     */
    public noNamespace.NotifyContextAvailabilityResponse getNotifyContextAvailabilitytResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NotifyContextAvailabilityResponse target = null;
            target = (noNamespace.NotifyContextAvailabilityResponse)get_store().find_element_user(NOTIFYCONTEXTAVAILABILITYTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "notifyContextAvailabilitytResponse" element
     */
    public void setNotifyContextAvailabilitytResponse(noNamespace.NotifyContextAvailabilityResponse notifyContextAvailabilitytResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NotifyContextAvailabilityResponse target = null;
            target = (noNamespace.NotifyContextAvailabilityResponse)get_store().find_element_user(NOTIFYCONTEXTAVAILABILITYTRESPONSE$0, 0);
            if (target == null)
            {
                target = (noNamespace.NotifyContextAvailabilityResponse)get_store().add_element_user(NOTIFYCONTEXTAVAILABILITYTRESPONSE$0);
            }
            target.set(notifyContextAvailabilitytResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "notifyContextAvailabilitytResponse" element
     */
    public noNamespace.NotifyContextAvailabilityResponse addNewNotifyContextAvailabilitytResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NotifyContextAvailabilityResponse target = null;
            target = (noNamespace.NotifyContextAvailabilityResponse)get_store().add_element_user(NOTIFYCONTEXTAVAILABILITYTRESPONSE$0);
            return target;
        }
    }
}
