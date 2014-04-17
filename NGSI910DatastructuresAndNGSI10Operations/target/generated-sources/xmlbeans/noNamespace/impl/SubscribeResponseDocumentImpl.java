/*
 * An XML document type.
 * Localname: subscribeResponse
 * Namespace: 
 * Java type: noNamespace.SubscribeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one subscribeResponse(@) element.
 *
 * This is a complex type.
 */
public class SubscribeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.SubscribeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubscribeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIBERESPONSE$0 = 
        new javax.xml.namespace.QName("", "subscribeResponse");
    
    
    /**
     * Gets the "subscribeResponse" element
     */
    public noNamespace.SubscribeResponse getSubscribeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SubscribeResponse target = null;
            target = (noNamespace.SubscribeResponse)get_store().find_element_user(SUBSCRIBERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subscribeResponse" element
     */
    public void setSubscribeResponse(noNamespace.SubscribeResponse subscribeResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SubscribeResponse target = null;
            target = (noNamespace.SubscribeResponse)get_store().find_element_user(SUBSCRIBERESPONSE$0, 0);
            if (target == null)
            {
                target = (noNamespace.SubscribeResponse)get_store().add_element_user(SUBSCRIBERESPONSE$0);
            }
            target.set(subscribeResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "subscribeResponse" element
     */
    public noNamespace.SubscribeResponse addNewSubscribeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SubscribeResponse target = null;
            target = (noNamespace.SubscribeResponse)get_store().add_element_user(SUBSCRIBERESPONSE$0);
            return target;
        }
    }
}
