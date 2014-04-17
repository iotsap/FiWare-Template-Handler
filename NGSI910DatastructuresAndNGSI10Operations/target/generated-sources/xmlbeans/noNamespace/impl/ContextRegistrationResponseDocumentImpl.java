/*
 * An XML document type.
 * Localname: contextRegistrationResponse
 * Namespace: 
 * Java type: noNamespace.ContextRegistrationResponseDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one contextRegistrationResponse(@) element.
 *
 * This is a complex type.
 */
public class ContextRegistrationResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ContextRegistrationResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContextRegistrationResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXTREGISTRATIONRESPONSE$0 = 
        new javax.xml.namespace.QName("", "contextRegistrationResponse");
    
    
    /**
     * Gets the "contextRegistrationResponse" element
     */
    public noNamespace.ContextRegistrationResponse getContextRegistrationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationResponse target = null;
            target = (noNamespace.ContextRegistrationResponse)get_store().find_element_user(CONTEXTREGISTRATIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contextRegistrationResponse" element
     */
    public void setContextRegistrationResponse(noNamespace.ContextRegistrationResponse contextRegistrationResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationResponse target = null;
            target = (noNamespace.ContextRegistrationResponse)get_store().find_element_user(CONTEXTREGISTRATIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (noNamespace.ContextRegistrationResponse)get_store().add_element_user(CONTEXTREGISTRATIONRESPONSE$0);
            }
            target.set(contextRegistrationResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "contextRegistrationResponse" element
     */
    public noNamespace.ContextRegistrationResponse addNewContextRegistrationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationResponse target = null;
            target = (noNamespace.ContextRegistrationResponse)get_store().add_element_user(CONTEXTREGISTRATIONRESPONSE$0);
            return target;
        }
    }
}
