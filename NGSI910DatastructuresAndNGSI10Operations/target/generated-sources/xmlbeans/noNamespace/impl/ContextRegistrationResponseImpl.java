/*
 * XML Type:  ContextRegistrationResponse
 * Namespace: 
 * Java type: noNamespace.ContextRegistrationResponse
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML ContextRegistrationResponse(@).
 *
 * This is a complex type.
 */
public class ContextRegistrationResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ContextRegistrationResponse
{
    private static final long serialVersionUID = 1L;
    
    public ContextRegistrationResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXTREGISTRATION$0 = 
        new javax.xml.namespace.QName("", "contextRegistration");
    private static final javax.xml.namespace.QName ERRORCODE$2 = 
        new javax.xml.namespace.QName("", "errorCode");
    
    
    /**
     * Gets the "contextRegistration" element
     */
    public noNamespace.ContextRegistration getContextRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistration target = null;
            target = (noNamespace.ContextRegistration)get_store().find_element_user(CONTEXTREGISTRATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contextRegistration" element
     */
    public void setContextRegistration(noNamespace.ContextRegistration contextRegistration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistration target = null;
            target = (noNamespace.ContextRegistration)get_store().find_element_user(CONTEXTREGISTRATION$0, 0);
            if (target == null)
            {
                target = (noNamespace.ContextRegistration)get_store().add_element_user(CONTEXTREGISTRATION$0);
            }
            target.set(contextRegistration);
        }
    }
    
    /**
     * Appends and returns a new empty "contextRegistration" element
     */
    public noNamespace.ContextRegistration addNewContextRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistration target = null;
            target = (noNamespace.ContextRegistration)get_store().add_element_user(CONTEXTREGISTRATION$0);
            return target;
        }
    }
    
    /**
     * Gets the "errorCode" element
     */
    public noNamespace.StatusCode getErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.StatusCode target = null;
            target = (noNamespace.StatusCode)get_store().find_element_user(ERRORCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "errorCode" element
     */
    public boolean isSetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "errorCode" element
     */
    public void setErrorCode(noNamespace.StatusCode errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.StatusCode target = null;
            target = (noNamespace.StatusCode)get_store().find_element_user(ERRORCODE$2, 0);
            if (target == null)
            {
                target = (noNamespace.StatusCode)get_store().add_element_user(ERRORCODE$2);
            }
            target.set(errorCode);
        }
    }
    
    /**
     * Appends and returns a new empty "errorCode" element
     */
    public noNamespace.StatusCode addNewErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.StatusCode target = null;
            target = (noNamespace.StatusCode)get_store().add_element_user(ERRORCODE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "errorCode" element
     */
    public void unsetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORCODE$2, 0);
        }
    }
}
