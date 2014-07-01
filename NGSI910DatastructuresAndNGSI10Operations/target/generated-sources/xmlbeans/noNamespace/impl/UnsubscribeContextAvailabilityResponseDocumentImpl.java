/*
 * An XML document type.
 * Localname: unsubscribeContextAvailabilityResponse
 * Namespace: 
 * Java type: noNamespace.UnsubscribeContextAvailabilityResponseDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one unsubscribeContextAvailabilityResponse(@) element.
 *
 * This is a complex type.
 */
public class UnsubscribeContextAvailabilityResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.UnsubscribeContextAvailabilityResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnsubscribeContextAvailabilityResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSUBSCRIBECONTEXTAVAILABILITYRESPONSE$0 = 
        new javax.xml.namespace.QName("", "unsubscribeContextAvailabilityResponse");
    
    
    /**
     * Gets the "unsubscribeContextAvailabilityResponse" element
     */
    public noNamespace.UnsubscribeContextAvailabilityResponse getUnsubscribeContextAvailabilityResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UnsubscribeContextAvailabilityResponse target = null;
            target = (noNamespace.UnsubscribeContextAvailabilityResponse)get_store().find_element_user(UNSUBSCRIBECONTEXTAVAILABILITYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "unsubscribeContextAvailabilityResponse" element
     */
    public void setUnsubscribeContextAvailabilityResponse(noNamespace.UnsubscribeContextAvailabilityResponse unsubscribeContextAvailabilityResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UnsubscribeContextAvailabilityResponse target = null;
            target = (noNamespace.UnsubscribeContextAvailabilityResponse)get_store().find_element_user(UNSUBSCRIBECONTEXTAVAILABILITYRESPONSE$0, 0);
            if (target == null)
            {
                target = (noNamespace.UnsubscribeContextAvailabilityResponse)get_store().add_element_user(UNSUBSCRIBECONTEXTAVAILABILITYRESPONSE$0);
            }
            target.set(unsubscribeContextAvailabilityResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "unsubscribeContextAvailabilityResponse" element
     */
    public noNamespace.UnsubscribeContextAvailabilityResponse addNewUnsubscribeContextAvailabilityResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UnsubscribeContextAvailabilityResponse target = null;
            target = (noNamespace.UnsubscribeContextAvailabilityResponse)get_store().add_element_user(UNSUBSCRIBECONTEXTAVAILABILITYRESPONSE$0);
            return target;
        }
    }
}
