/*
 * An XML document type.
 * Localname: registerContextResponse
 * Namespace: 
 * Java type: noNamespace.RegisterContextResponseDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one registerContextResponse(@) element.
 *
 * This is a complex type.
 */
public class RegisterContextResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RegisterContextResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public RegisterContextResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGISTERCONTEXTRESPONSE$0 = 
        new javax.xml.namespace.QName("", "registerContextResponse");
    
    
    /**
     * Gets the "registerContextResponse" element
     */
    public noNamespace.RegisterContextResponse getRegisterContextResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RegisterContextResponse target = null;
            target = (noNamespace.RegisterContextResponse)get_store().find_element_user(REGISTERCONTEXTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "registerContextResponse" element
     */
    public void setRegisterContextResponse(noNamespace.RegisterContextResponse registerContextResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RegisterContextResponse target = null;
            target = (noNamespace.RegisterContextResponse)get_store().find_element_user(REGISTERCONTEXTRESPONSE$0, 0);
            if (target == null)
            {
                target = (noNamespace.RegisterContextResponse)get_store().add_element_user(REGISTERCONTEXTRESPONSE$0);
            }
            target.set(registerContextResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "registerContextResponse" element
     */
    public noNamespace.RegisterContextResponse addNewRegisterContextResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RegisterContextResponse target = null;
            target = (noNamespace.RegisterContextResponse)get_store().add_element_user(REGISTERCONTEXTRESPONSE$0);
            return target;
        }
    }
}
