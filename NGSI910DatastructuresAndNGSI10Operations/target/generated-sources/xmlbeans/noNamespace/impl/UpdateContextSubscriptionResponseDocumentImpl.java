/*
 * An XML document type.
 * Localname: updateContextSubscriptionResponse
 * Namespace: 
 * Java type: noNamespace.UpdateContextSubscriptionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one updateContextSubscriptionResponse(@) element.
 *
 * This is a complex type.
 */
public class UpdateContextSubscriptionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.UpdateContextSubscriptionResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateContextSubscriptionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATECONTEXTSUBSCRIPTIONRESPONSE$0 = 
        new javax.xml.namespace.QName("", "updateContextSubscriptionResponse");
    
    
    /**
     * Gets the "updateContextSubscriptionResponse" element
     */
    public noNamespace.UpdateContextSubscriptionResponse getUpdateContextSubscriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextSubscriptionResponse target = null;
            target = (noNamespace.UpdateContextSubscriptionResponse)get_store().find_element_user(UPDATECONTEXTSUBSCRIPTIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "updateContextSubscriptionResponse" element
     */
    public void setUpdateContextSubscriptionResponse(noNamespace.UpdateContextSubscriptionResponse updateContextSubscriptionResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextSubscriptionResponse target = null;
            target = (noNamespace.UpdateContextSubscriptionResponse)get_store().find_element_user(UPDATECONTEXTSUBSCRIPTIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (noNamespace.UpdateContextSubscriptionResponse)get_store().add_element_user(UPDATECONTEXTSUBSCRIPTIONRESPONSE$0);
            }
            target.set(updateContextSubscriptionResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "updateContextSubscriptionResponse" element
     */
    public noNamespace.UpdateContextSubscriptionResponse addNewUpdateContextSubscriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextSubscriptionResponse target = null;
            target = (noNamespace.UpdateContextSubscriptionResponse)get_store().add_element_user(UPDATECONTEXTSUBSCRIPTIONRESPONSE$0);
            return target;
        }
    }
}
