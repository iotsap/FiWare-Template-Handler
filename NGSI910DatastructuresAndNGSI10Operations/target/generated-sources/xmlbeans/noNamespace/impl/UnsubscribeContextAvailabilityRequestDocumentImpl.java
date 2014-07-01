/*
 * An XML document type.
 * Localname: unsubscribeContextAvailabilityRequest
 * Namespace: 
 * Java type: noNamespace.UnsubscribeContextAvailabilityRequestDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one unsubscribeContextAvailabilityRequest(@) element.
 *
 * This is a complex type.
 */
public class UnsubscribeContextAvailabilityRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.UnsubscribeContextAvailabilityRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnsubscribeContextAvailabilityRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSUBSCRIBECONTEXTAVAILABILITYREQUEST$0 = 
        new javax.xml.namespace.QName("", "unsubscribeContextAvailabilityRequest");
    
    
    /**
     * Gets the "unsubscribeContextAvailabilityRequest" element
     */
    public noNamespace.UnsubscribeContextAvailabilityRequest getUnsubscribeContextAvailabilityRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UnsubscribeContextAvailabilityRequest target = null;
            target = (noNamespace.UnsubscribeContextAvailabilityRequest)get_store().find_element_user(UNSUBSCRIBECONTEXTAVAILABILITYREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "unsubscribeContextAvailabilityRequest" element
     */
    public void setUnsubscribeContextAvailabilityRequest(noNamespace.UnsubscribeContextAvailabilityRequest unsubscribeContextAvailabilityRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UnsubscribeContextAvailabilityRequest target = null;
            target = (noNamespace.UnsubscribeContextAvailabilityRequest)get_store().find_element_user(UNSUBSCRIBECONTEXTAVAILABILITYREQUEST$0, 0);
            if (target == null)
            {
                target = (noNamespace.UnsubscribeContextAvailabilityRequest)get_store().add_element_user(UNSUBSCRIBECONTEXTAVAILABILITYREQUEST$0);
            }
            target.set(unsubscribeContextAvailabilityRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "unsubscribeContextAvailabilityRequest" element
     */
    public noNamespace.UnsubscribeContextAvailabilityRequest addNewUnsubscribeContextAvailabilityRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UnsubscribeContextAvailabilityRequest target = null;
            target = (noNamespace.UnsubscribeContextAvailabilityRequest)get_store().add_element_user(UNSUBSCRIBECONTEXTAVAILABILITYREQUEST$0);
            return target;
        }
    }
}
