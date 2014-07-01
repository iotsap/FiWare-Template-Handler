/*
 * An XML document type.
 * Localname: updateContextAvailabilitySubscriptionResponse
 * Namespace: 
 * Java type: noNamespace.UpdateContextAvailabilitySubscriptionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one updateContextAvailabilitySubscriptionResponse(@) element.
 *
 * This is a complex type.
 */
public class UpdateContextAvailabilitySubscriptionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.UpdateContextAvailabilitySubscriptionResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateContextAvailabilitySubscriptionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATECONTEXTAVAILABILITYSUBSCRIPTIONRESPONSE$0 = 
        new javax.xml.namespace.QName("", "updateContextAvailabilitySubscriptionResponse");
    
    
    /**
     * Gets the "updateContextAvailabilitySubscriptionResponse" element
     */
    public noNamespace.UpdateContextAvailabilitySubscriptionResponse getUpdateContextAvailabilitySubscriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextAvailabilitySubscriptionResponse target = null;
            target = (noNamespace.UpdateContextAvailabilitySubscriptionResponse)get_store().find_element_user(UPDATECONTEXTAVAILABILITYSUBSCRIPTIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "updateContextAvailabilitySubscriptionResponse" element
     */
    public void setUpdateContextAvailabilitySubscriptionResponse(noNamespace.UpdateContextAvailabilitySubscriptionResponse updateContextAvailabilitySubscriptionResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextAvailabilitySubscriptionResponse target = null;
            target = (noNamespace.UpdateContextAvailabilitySubscriptionResponse)get_store().find_element_user(UPDATECONTEXTAVAILABILITYSUBSCRIPTIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (noNamespace.UpdateContextAvailabilitySubscriptionResponse)get_store().add_element_user(UPDATECONTEXTAVAILABILITYSUBSCRIPTIONRESPONSE$0);
            }
            target.set(updateContextAvailabilitySubscriptionResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "updateContextAvailabilitySubscriptionResponse" element
     */
    public noNamespace.UpdateContextAvailabilitySubscriptionResponse addNewUpdateContextAvailabilitySubscriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextAvailabilitySubscriptionResponse target = null;
            target = (noNamespace.UpdateContextAvailabilitySubscriptionResponse)get_store().add_element_user(UPDATECONTEXTAVAILABILITYSUBSCRIPTIONRESPONSE$0);
            return target;
        }
    }
}
