/*
 * An XML document type.
 * Localname: unsubscribeContextResponse
 * Namespace: 
 * Java type: noNamespace.UnsubscribeContextResponseDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one unsubscribeContextResponse(@) element.
 *
 * This is a complex type.
 */
public class UnsubscribeContextResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.UnsubscribeContextResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnsubscribeContextResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSUBSCRIBECONTEXTRESPONSE$0 = 
        new javax.xml.namespace.QName("", "unsubscribeContextResponse");
    
    
    /**
     * Gets the "unsubscribeContextResponse" element
     */
    public noNamespace.UnsubscribeContextResponse getUnsubscribeContextResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UnsubscribeContextResponse target = null;
            target = (noNamespace.UnsubscribeContextResponse)get_store().find_element_user(UNSUBSCRIBECONTEXTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "unsubscribeContextResponse" element
     */
    public void setUnsubscribeContextResponse(noNamespace.UnsubscribeContextResponse unsubscribeContextResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UnsubscribeContextResponse target = null;
            target = (noNamespace.UnsubscribeContextResponse)get_store().find_element_user(UNSUBSCRIBECONTEXTRESPONSE$0, 0);
            if (target == null)
            {
                target = (noNamespace.UnsubscribeContextResponse)get_store().add_element_user(UNSUBSCRIBECONTEXTRESPONSE$0);
            }
            target.set(unsubscribeContextResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "unsubscribeContextResponse" element
     */
    public noNamespace.UnsubscribeContextResponse addNewUnsubscribeContextResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UnsubscribeContextResponse target = null;
            target = (noNamespace.UnsubscribeContextResponse)get_store().add_element_user(UNSUBSCRIBECONTEXTRESPONSE$0);
            return target;
        }
    }
}
