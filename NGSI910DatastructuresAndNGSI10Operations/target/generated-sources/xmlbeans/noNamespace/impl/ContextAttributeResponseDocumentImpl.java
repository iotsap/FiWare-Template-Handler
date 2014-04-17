/*
 * An XML document type.
 * Localname: contextAttributeResponse
 * Namespace: 
 * Java type: noNamespace.ContextAttributeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one contextAttributeResponse(@) element.
 *
 * This is a complex type.
 */
public class ContextAttributeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ContextAttributeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContextAttributeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXTATTRIBUTERESPONSE$0 = 
        new javax.xml.namespace.QName("", "contextAttributeResponse");
    
    
    /**
     * Gets the "contextAttributeResponse" element
     */
    public noNamespace.ContextAttributeResponse getContextAttributeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextAttributeResponse target = null;
            target = (noNamespace.ContextAttributeResponse)get_store().find_element_user(CONTEXTATTRIBUTERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contextAttributeResponse" element
     */
    public void setContextAttributeResponse(noNamespace.ContextAttributeResponse contextAttributeResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextAttributeResponse target = null;
            target = (noNamespace.ContextAttributeResponse)get_store().find_element_user(CONTEXTATTRIBUTERESPONSE$0, 0);
            if (target == null)
            {
                target = (noNamespace.ContextAttributeResponse)get_store().add_element_user(CONTEXTATTRIBUTERESPONSE$0);
            }
            target.set(contextAttributeResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "contextAttributeResponse" element
     */
    public noNamespace.ContextAttributeResponse addNewContextAttributeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextAttributeResponse target = null;
            target = (noNamespace.ContextAttributeResponse)get_store().add_element_user(CONTEXTATTRIBUTERESPONSE$0);
            return target;
        }
    }
}
