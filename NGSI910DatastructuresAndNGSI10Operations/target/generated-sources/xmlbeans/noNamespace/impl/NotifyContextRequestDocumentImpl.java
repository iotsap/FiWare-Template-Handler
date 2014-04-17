/*
 * An XML document type.
 * Localname: notifyContextRequest
 * Namespace: 
 * Java type: noNamespace.NotifyContextRequestDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one notifyContextRequest(@) element.
 *
 * This is a complex type.
 */
public class NotifyContextRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.NotifyContextRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public NotifyContextRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTIFYCONTEXTREQUEST$0 = 
        new javax.xml.namespace.QName("", "notifyContextRequest");
    
    
    /**
     * Gets the "notifyContextRequest" element
     */
    public noNamespace.NotifyContextRequest getNotifyContextRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NotifyContextRequest target = null;
            target = (noNamespace.NotifyContextRequest)get_store().find_element_user(NOTIFYCONTEXTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "notifyContextRequest" element
     */
    public void setNotifyContextRequest(noNamespace.NotifyContextRequest notifyContextRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NotifyContextRequest target = null;
            target = (noNamespace.NotifyContextRequest)get_store().find_element_user(NOTIFYCONTEXTREQUEST$0, 0);
            if (target == null)
            {
                target = (noNamespace.NotifyContextRequest)get_store().add_element_user(NOTIFYCONTEXTREQUEST$0);
            }
            target.set(notifyContextRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "notifyContextRequest" element
     */
    public noNamespace.NotifyContextRequest addNewNotifyContextRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NotifyContextRequest target = null;
            target = (noNamespace.NotifyContextRequest)get_store().add_element_user(NOTIFYCONTEXTREQUEST$0);
            return target;
        }
    }
}
