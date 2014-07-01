/*
 * An XML document type.
 * Localname: subscribeContextAvailabilityRequest
 * Namespace: 
 * Java type: noNamespace.SubscribeContextAvailabilityRequestDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one subscribeContextAvailabilityRequest(@) element.
 *
 * This is a complex type.
 */
public class SubscribeContextAvailabilityRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.SubscribeContextAvailabilityRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubscribeContextAvailabilityRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIBECONTEXTAVAILABILITYREQUEST$0 = 
        new javax.xml.namespace.QName("", "subscribeContextAvailabilityRequest");
    
    
    /**
     * Gets the "subscribeContextAvailabilityRequest" element
     */
    public noNamespace.SubscribeContextAvailabilityRequest getSubscribeContextAvailabilityRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SubscribeContextAvailabilityRequest target = null;
            target = (noNamespace.SubscribeContextAvailabilityRequest)get_store().find_element_user(SUBSCRIBECONTEXTAVAILABILITYREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subscribeContextAvailabilityRequest" element
     */
    public void setSubscribeContextAvailabilityRequest(noNamespace.SubscribeContextAvailabilityRequest subscribeContextAvailabilityRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SubscribeContextAvailabilityRequest target = null;
            target = (noNamespace.SubscribeContextAvailabilityRequest)get_store().find_element_user(SUBSCRIBECONTEXTAVAILABILITYREQUEST$0, 0);
            if (target == null)
            {
                target = (noNamespace.SubscribeContextAvailabilityRequest)get_store().add_element_user(SUBSCRIBECONTEXTAVAILABILITYREQUEST$0);
            }
            target.set(subscribeContextAvailabilityRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "subscribeContextAvailabilityRequest" element
     */
    public noNamespace.SubscribeContextAvailabilityRequest addNewSubscribeContextAvailabilityRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SubscribeContextAvailabilityRequest target = null;
            target = (noNamespace.SubscribeContextAvailabilityRequest)get_store().add_element_user(SUBSCRIBECONTEXTAVAILABILITYREQUEST$0);
            return target;
        }
    }
}
