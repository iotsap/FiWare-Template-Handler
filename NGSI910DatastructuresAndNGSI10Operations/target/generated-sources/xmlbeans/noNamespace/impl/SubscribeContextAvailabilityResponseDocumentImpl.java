/*
 * An XML document type.
 * Localname: subscribeContextAvailabilityResponse
 * Namespace: 
 * Java type: noNamespace.SubscribeContextAvailabilityResponseDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one subscribeContextAvailabilityResponse(@) element.
 *
 * This is a complex type.
 */
public class SubscribeContextAvailabilityResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.SubscribeContextAvailabilityResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubscribeContextAvailabilityResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIBECONTEXTAVAILABILITYRESPONSE$0 = 
        new javax.xml.namespace.QName("", "subscribeContextAvailabilityResponse");
    
    
    /**
     * Gets the "subscribeContextAvailabilityResponse" element
     */
    public noNamespace.SubscribeContextAvailabilityResponse getSubscribeContextAvailabilityResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SubscribeContextAvailabilityResponse target = null;
            target = (noNamespace.SubscribeContextAvailabilityResponse)get_store().find_element_user(SUBSCRIBECONTEXTAVAILABILITYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subscribeContextAvailabilityResponse" element
     */
    public void setSubscribeContextAvailabilityResponse(noNamespace.SubscribeContextAvailabilityResponse subscribeContextAvailabilityResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SubscribeContextAvailabilityResponse target = null;
            target = (noNamespace.SubscribeContextAvailabilityResponse)get_store().find_element_user(SUBSCRIBECONTEXTAVAILABILITYRESPONSE$0, 0);
            if (target == null)
            {
                target = (noNamespace.SubscribeContextAvailabilityResponse)get_store().add_element_user(SUBSCRIBECONTEXTAVAILABILITYRESPONSE$0);
            }
            target.set(subscribeContextAvailabilityResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "subscribeContextAvailabilityResponse" element
     */
    public noNamespace.SubscribeContextAvailabilityResponse addNewSubscribeContextAvailabilityResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SubscribeContextAvailabilityResponse target = null;
            target = (noNamespace.SubscribeContextAvailabilityResponse)get_store().add_element_user(SUBSCRIBECONTEXTAVAILABILITYRESPONSE$0);
            return target;
        }
    }
}
