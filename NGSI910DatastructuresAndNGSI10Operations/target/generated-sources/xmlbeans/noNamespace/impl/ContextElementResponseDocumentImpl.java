/*
 * An XML document type.
 * Localname: contextElementResponse
 * Namespace: 
 * Java type: noNamespace.ContextElementResponseDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one contextElementResponse(@) element.
 *
 * This is a complex type.
 */
public class ContextElementResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ContextElementResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContextElementResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXTELEMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("", "contextElementResponse");
    
    
    /**
     * Gets the "contextElementResponse" element
     */
    public noNamespace.ContextElementResponse getContextElementResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElementResponse target = null;
            target = (noNamespace.ContextElementResponse)get_store().find_element_user(CONTEXTELEMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contextElementResponse" element
     */
    public void setContextElementResponse(noNamespace.ContextElementResponse contextElementResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElementResponse target = null;
            target = (noNamespace.ContextElementResponse)get_store().find_element_user(CONTEXTELEMENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (noNamespace.ContextElementResponse)get_store().add_element_user(CONTEXTELEMENTRESPONSE$0);
            }
            target.set(contextElementResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "contextElementResponse" element
     */
    public noNamespace.ContextElementResponse addNewContextElementResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElementResponse target = null;
            target = (noNamespace.ContextElementResponse)get_store().add_element_user(CONTEXTELEMENTRESPONSE$0);
            return target;
        }
    }
}
