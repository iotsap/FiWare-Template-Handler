/*
 * An XML document type.
 * Localname: unsubscribeContextRequest
 * Namespace: 
 * Java type: noNamespace.UnsubscribeContextRequestDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one unsubscribeContextRequest(@) element.
 *
 * This is a complex type.
 */
public class UnsubscribeContextRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.UnsubscribeContextRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnsubscribeContextRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSUBSCRIBECONTEXTREQUEST$0 = 
        new javax.xml.namespace.QName("", "unsubscribeContextRequest");
    
    
    /**
     * Gets the "unsubscribeContextRequest" element
     */
    public noNamespace.UnsubscribeContextRequest getUnsubscribeContextRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UnsubscribeContextRequest target = null;
            target = (noNamespace.UnsubscribeContextRequest)get_store().find_element_user(UNSUBSCRIBECONTEXTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "unsubscribeContextRequest" element
     */
    public void setUnsubscribeContextRequest(noNamespace.UnsubscribeContextRequest unsubscribeContextRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UnsubscribeContextRequest target = null;
            target = (noNamespace.UnsubscribeContextRequest)get_store().find_element_user(UNSUBSCRIBECONTEXTREQUEST$0, 0);
            if (target == null)
            {
                target = (noNamespace.UnsubscribeContextRequest)get_store().add_element_user(UNSUBSCRIBECONTEXTREQUEST$0);
            }
            target.set(unsubscribeContextRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "unsubscribeContextRequest" element
     */
    public noNamespace.UnsubscribeContextRequest addNewUnsubscribeContextRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UnsubscribeContextRequest target = null;
            target = (noNamespace.UnsubscribeContextRequest)get_store().add_element_user(UNSUBSCRIBECONTEXTREQUEST$0);
            return target;
        }
    }
}
