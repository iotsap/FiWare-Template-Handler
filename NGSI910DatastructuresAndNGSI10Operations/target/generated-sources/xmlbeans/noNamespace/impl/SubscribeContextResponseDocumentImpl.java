/*
 * An XML document type.
 * Localname: subscribeContextResponse
 * Namespace: 
 * Java type: noNamespace.SubscribeContextResponseDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one subscribeContextResponse(@) element.
 *
 * This is a complex type.
 */
public class SubscribeContextResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.SubscribeContextResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubscribeContextResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIBECONTEXTRESPONSE$0 = 
        new javax.xml.namespace.QName("", "subscribeContextResponse");
    
    
    /**
     * Gets the "subscribeContextResponse" element
     */
    public noNamespace.SubscribeContextResponse getSubscribeContextResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SubscribeContextResponse target = null;
            target = (noNamespace.SubscribeContextResponse)get_store().find_element_user(SUBSCRIBECONTEXTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subscribeContextResponse" element
     */
    public void setSubscribeContextResponse(noNamespace.SubscribeContextResponse subscribeContextResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SubscribeContextResponse target = null;
            target = (noNamespace.SubscribeContextResponse)get_store().find_element_user(SUBSCRIBECONTEXTRESPONSE$0, 0);
            if (target == null)
            {
                target = (noNamespace.SubscribeContextResponse)get_store().add_element_user(SUBSCRIBECONTEXTRESPONSE$0);
            }
            target.set(subscribeContextResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "subscribeContextResponse" element
     */
    public noNamespace.SubscribeContextResponse addNewSubscribeContextResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SubscribeContextResponse target = null;
            target = (noNamespace.SubscribeContextResponse)get_store().add_element_user(SUBSCRIBECONTEXTRESPONSE$0);
            return target;
        }
    }
}
