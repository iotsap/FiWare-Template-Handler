/*
 * An XML document type.
 * Localname: registerContextRequest
 * Namespace: 
 * Java type: noNamespace.RegisterContextRequestDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one registerContextRequest(@) element.
 *
 * This is a complex type.
 */
public class RegisterContextRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RegisterContextRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public RegisterContextRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGISTERCONTEXTREQUEST$0 = 
        new javax.xml.namespace.QName("", "registerContextRequest");
    
    
    /**
     * Gets the "registerContextRequest" element
     */
    public noNamespace.RegisterContextRequest getRegisterContextRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RegisterContextRequest target = null;
            target = (noNamespace.RegisterContextRequest)get_store().find_element_user(REGISTERCONTEXTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "registerContextRequest" element
     */
    public void setRegisterContextRequest(noNamespace.RegisterContextRequest registerContextRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RegisterContextRequest target = null;
            target = (noNamespace.RegisterContextRequest)get_store().find_element_user(REGISTERCONTEXTREQUEST$0, 0);
            if (target == null)
            {
                target = (noNamespace.RegisterContextRequest)get_store().add_element_user(REGISTERCONTEXTREQUEST$0);
            }
            target.set(registerContextRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "registerContextRequest" element
     */
    public noNamespace.RegisterContextRequest addNewRegisterContextRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RegisterContextRequest target = null;
            target = (noNamespace.RegisterContextRequest)get_store().add_element_user(REGISTERCONTEXTREQUEST$0);
            return target;
        }
    }
}
