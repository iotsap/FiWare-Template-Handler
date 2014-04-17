/*
 * An XML document type.
 * Localname: updateContextSubscriptionRequest
 * Namespace: 
 * Java type: noNamespace.UpdateContextSubscriptionRequestDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one updateContextSubscriptionRequest(@) element.
 *
 * This is a complex type.
 */
public class UpdateContextSubscriptionRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.UpdateContextSubscriptionRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateContextSubscriptionRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATECONTEXTSUBSCRIPTIONREQUEST$0 = 
        new javax.xml.namespace.QName("", "updateContextSubscriptionRequest");
    
    
    /**
     * Gets the "updateContextSubscriptionRequest" element
     */
    public noNamespace.UpdateContextSubscriptionRequest getUpdateContextSubscriptionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextSubscriptionRequest target = null;
            target = (noNamespace.UpdateContextSubscriptionRequest)get_store().find_element_user(UPDATECONTEXTSUBSCRIPTIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "updateContextSubscriptionRequest" element
     */
    public void setUpdateContextSubscriptionRequest(noNamespace.UpdateContextSubscriptionRequest updateContextSubscriptionRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextSubscriptionRequest target = null;
            target = (noNamespace.UpdateContextSubscriptionRequest)get_store().find_element_user(UPDATECONTEXTSUBSCRIPTIONREQUEST$0, 0);
            if (target == null)
            {
                target = (noNamespace.UpdateContextSubscriptionRequest)get_store().add_element_user(UPDATECONTEXTSUBSCRIPTIONREQUEST$0);
            }
            target.set(updateContextSubscriptionRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "updateContextSubscriptionRequest" element
     */
    public noNamespace.UpdateContextSubscriptionRequest addNewUpdateContextSubscriptionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextSubscriptionRequest target = null;
            target = (noNamespace.UpdateContextSubscriptionRequest)get_store().add_element_user(UPDATECONTEXTSUBSCRIPTIONREQUEST$0);
            return target;
        }
    }
}
