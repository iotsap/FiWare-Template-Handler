/*
 * An XML document type.
 * Localname: discoverContextAvailabilityRequest
 * Namespace: 
 * Java type: noNamespace.DiscoverContextAvailabilityRequestDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one discoverContextAvailabilityRequest(@) element.
 *
 * This is a complex type.
 */
public class DiscoverContextAvailabilityRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DiscoverContextAvailabilityRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiscoverContextAvailabilityRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCOVERCONTEXTAVAILABILITYREQUEST$0 = 
        new javax.xml.namespace.QName("", "discoverContextAvailabilityRequest");
    
    
    /**
     * Gets the "discoverContextAvailabilityRequest" element
     */
    public noNamespace.DiscoveryContextAvailabilityRequest getDiscoverContextAvailabilityRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.DiscoveryContextAvailabilityRequest target = null;
            target = (noNamespace.DiscoveryContextAvailabilityRequest)get_store().find_element_user(DISCOVERCONTEXTAVAILABILITYREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "discoverContextAvailabilityRequest" element
     */
    public void setDiscoverContextAvailabilityRequest(noNamespace.DiscoveryContextAvailabilityRequest discoverContextAvailabilityRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.DiscoveryContextAvailabilityRequest target = null;
            target = (noNamespace.DiscoveryContextAvailabilityRequest)get_store().find_element_user(DISCOVERCONTEXTAVAILABILITYREQUEST$0, 0);
            if (target == null)
            {
                target = (noNamespace.DiscoveryContextAvailabilityRequest)get_store().add_element_user(DISCOVERCONTEXTAVAILABILITYREQUEST$0);
            }
            target.set(discoverContextAvailabilityRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "discoverContextAvailabilityRequest" element
     */
    public noNamespace.DiscoveryContextAvailabilityRequest addNewDiscoverContextAvailabilityRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.DiscoveryContextAvailabilityRequest target = null;
            target = (noNamespace.DiscoveryContextAvailabilityRequest)get_store().add_element_user(DISCOVERCONTEXTAVAILABILITYREQUEST$0);
            return target;
        }
    }
}
