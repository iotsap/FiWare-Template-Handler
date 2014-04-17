/*
 * An XML document type.
 * Localname: notifyContextResponse
 * Namespace: 
 * Java type: noNamespace.NotifyContextResponseDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one notifyContextResponse(@) element.
 *
 * This is a complex type.
 */
public class NotifyContextResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.NotifyContextResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public NotifyContextResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTIFYCONTEXTRESPONSE$0 = 
        new javax.xml.namespace.QName("", "notifyContextResponse");
    
    
    /**
     * Gets the "notifyContextResponse" element
     */
    public noNamespace.NotifyContextResponse getNotifyContextResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NotifyContextResponse target = null;
            target = (noNamespace.NotifyContextResponse)get_store().find_element_user(NOTIFYCONTEXTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "notifyContextResponse" element
     */
    public void setNotifyContextResponse(noNamespace.NotifyContextResponse notifyContextResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NotifyContextResponse target = null;
            target = (noNamespace.NotifyContextResponse)get_store().find_element_user(NOTIFYCONTEXTRESPONSE$0, 0);
            if (target == null)
            {
                target = (noNamespace.NotifyContextResponse)get_store().add_element_user(NOTIFYCONTEXTRESPONSE$0);
            }
            target.set(notifyContextResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "notifyContextResponse" element
     */
    public noNamespace.NotifyContextResponse addNewNotifyContextResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NotifyContextResponse target = null;
            target = (noNamespace.NotifyContextResponse)get_store().add_element_user(NOTIFYCONTEXTRESPONSE$0);
            return target;
        }
    }
}
