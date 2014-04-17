/*
 * An XML document type.
 * Localname: subscribeContextRequest
 * Namespace: 
 * Java type: noNamespace.SubscribeContextRequestDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one subscribeContextRequest(@) element.
 *
 * This is a complex type.
 */
public class SubscribeContextRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.SubscribeContextRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubscribeContextRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIBECONTEXTREQUEST$0 = 
        new javax.xml.namespace.QName("", "subscribeContextRequest");
    
    
    /**
     * Gets the "subscribeContextRequest" element
     */
    public noNamespace.SubscribeContextRequest getSubscribeContextRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SubscribeContextRequest target = null;
            target = (noNamespace.SubscribeContextRequest)get_store().find_element_user(SUBSCRIBECONTEXTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subscribeContextRequest" element
     */
    public void setSubscribeContextRequest(noNamespace.SubscribeContextRequest subscribeContextRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SubscribeContextRequest target = null;
            target = (noNamespace.SubscribeContextRequest)get_store().find_element_user(SUBSCRIBECONTEXTREQUEST$0, 0);
            if (target == null)
            {
                target = (noNamespace.SubscribeContextRequest)get_store().add_element_user(SUBSCRIBECONTEXTREQUEST$0);
            }
            target.set(subscribeContextRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "subscribeContextRequest" element
     */
    public noNamespace.SubscribeContextRequest addNewSubscribeContextRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SubscribeContextRequest target = null;
            target = (noNamespace.SubscribeContextRequest)get_store().add_element_user(SUBSCRIBECONTEXTREQUEST$0);
            return target;
        }
    }
}
