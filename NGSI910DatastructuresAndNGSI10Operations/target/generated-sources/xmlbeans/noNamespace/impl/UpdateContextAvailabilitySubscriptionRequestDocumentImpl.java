/*
 * An XML document type.
 * Localname: updateContextAvailabilitySubscriptionRequest
 * Namespace: 
 * Java type: noNamespace.UpdateContextAvailabilitySubscriptionRequestDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one updateContextAvailabilitySubscriptionRequest(@) element.
 *
 * This is a complex type.
 */
public class UpdateContextAvailabilitySubscriptionRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.UpdateContextAvailabilitySubscriptionRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateContextAvailabilitySubscriptionRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATECONTEXTAVAILABILITYSUBSCRIPTIONREQUEST$0 = 
        new javax.xml.namespace.QName("", "updateContextAvailabilitySubscriptionRequest");
    
    
    /**
     * Gets the "updateContextAvailabilitySubscriptionRequest" element
     */
    public noNamespace.UpdateContextAvailabilitySubscriptionRequest getUpdateContextAvailabilitySubscriptionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextAvailabilitySubscriptionRequest target = null;
            target = (noNamespace.UpdateContextAvailabilitySubscriptionRequest)get_store().find_element_user(UPDATECONTEXTAVAILABILITYSUBSCRIPTIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "updateContextAvailabilitySubscriptionRequest" element
     */
    public void setUpdateContextAvailabilitySubscriptionRequest(noNamespace.UpdateContextAvailabilitySubscriptionRequest updateContextAvailabilitySubscriptionRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextAvailabilitySubscriptionRequest target = null;
            target = (noNamespace.UpdateContextAvailabilitySubscriptionRequest)get_store().find_element_user(UPDATECONTEXTAVAILABILITYSUBSCRIPTIONREQUEST$0, 0);
            if (target == null)
            {
                target = (noNamespace.UpdateContextAvailabilitySubscriptionRequest)get_store().add_element_user(UPDATECONTEXTAVAILABILITYSUBSCRIPTIONREQUEST$0);
            }
            target.set(updateContextAvailabilitySubscriptionRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "updateContextAvailabilitySubscriptionRequest" element
     */
    public noNamespace.UpdateContextAvailabilitySubscriptionRequest addNewUpdateContextAvailabilitySubscriptionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextAvailabilitySubscriptionRequest target = null;
            target = (noNamespace.UpdateContextAvailabilitySubscriptionRequest)get_store().add_element_user(UPDATECONTEXTAVAILABILITYSUBSCRIPTIONREQUEST$0);
            return target;
        }
    }
}
