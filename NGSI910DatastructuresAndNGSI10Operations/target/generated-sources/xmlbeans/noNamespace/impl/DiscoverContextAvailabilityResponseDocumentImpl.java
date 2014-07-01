/*
 * An XML document type.
 * Localname: discoverContextAvailabilityResponse
 * Namespace: 
 * Java type: noNamespace.DiscoverContextAvailabilityResponseDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one discoverContextAvailabilityResponse(@) element.
 *
 * This is a complex type.
 */
public class DiscoverContextAvailabilityResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DiscoverContextAvailabilityResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiscoverContextAvailabilityResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCOVERCONTEXTAVAILABILITYRESPONSE$0 = 
        new javax.xml.namespace.QName("", "discoverContextAvailabilityResponse");
    
    
    /**
     * Gets the "discoverContextAvailabilityResponse" element
     */
    public noNamespace.DiscoveryContextAvailabilityResponse getDiscoverContextAvailabilityResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.DiscoveryContextAvailabilityResponse target = null;
            target = (noNamespace.DiscoveryContextAvailabilityResponse)get_store().find_element_user(DISCOVERCONTEXTAVAILABILITYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "discoverContextAvailabilityResponse" element
     */
    public void setDiscoverContextAvailabilityResponse(noNamespace.DiscoveryContextAvailabilityResponse discoverContextAvailabilityResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.DiscoveryContextAvailabilityResponse target = null;
            target = (noNamespace.DiscoveryContextAvailabilityResponse)get_store().find_element_user(DISCOVERCONTEXTAVAILABILITYRESPONSE$0, 0);
            if (target == null)
            {
                target = (noNamespace.DiscoveryContextAvailabilityResponse)get_store().add_element_user(DISCOVERCONTEXTAVAILABILITYRESPONSE$0);
            }
            target.set(discoverContextAvailabilityResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "discoverContextAvailabilityResponse" element
     */
    public noNamespace.DiscoveryContextAvailabilityResponse addNewDiscoverContextAvailabilityResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.DiscoveryContextAvailabilityResponse target = null;
            target = (noNamespace.DiscoveryContextAvailabilityResponse)get_store().add_element_user(DISCOVERCONTEXTAVAILABILITYRESPONSE$0);
            return target;
        }
    }
}
