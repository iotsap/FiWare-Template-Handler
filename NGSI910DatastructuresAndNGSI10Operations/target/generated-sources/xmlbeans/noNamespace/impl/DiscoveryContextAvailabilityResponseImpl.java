/*
 * XML Type:  DiscoveryContextAvailabilityResponse
 * Namespace: 
 * Java type: noNamespace.DiscoveryContextAvailabilityResponse
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML DiscoveryContextAvailabilityResponse(@).
 *
 * This is a complex type.
 */
public class DiscoveryContextAvailabilityResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DiscoveryContextAvailabilityResponse
{
    private static final long serialVersionUID = 1L;
    
    public DiscoveryContextAvailabilityResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXTREGISTRATIONRESPONSELIST$0 = 
        new javax.xml.namespace.QName("", "contextRegistrationResponseList");
    private static final javax.xml.namespace.QName ERRORCODE$2 = 
        new javax.xml.namespace.QName("", "errorCode");
    
    
    /**
     * Gets the "contextRegistrationResponseList" element
     */
    public noNamespace.ContextRegistrationResponseList getContextRegistrationResponseList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationResponseList target = null;
            target = (noNamespace.ContextRegistrationResponseList)get_store().find_element_user(CONTEXTREGISTRATIONRESPONSELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "contextRegistrationResponseList" element
     */
    public boolean isSetContextRegistrationResponseList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXTREGISTRATIONRESPONSELIST$0) != 0;
        }
    }
    
    /**
     * Sets the "contextRegistrationResponseList" element
     */
    public void setContextRegistrationResponseList(noNamespace.ContextRegistrationResponseList contextRegistrationResponseList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationResponseList target = null;
            target = (noNamespace.ContextRegistrationResponseList)get_store().find_element_user(CONTEXTREGISTRATIONRESPONSELIST$0, 0);
            if (target == null)
            {
                target = (noNamespace.ContextRegistrationResponseList)get_store().add_element_user(CONTEXTREGISTRATIONRESPONSELIST$0);
            }
            target.set(contextRegistrationResponseList);
        }
    }
    
    /**
     * Appends and returns a new empty "contextRegistrationResponseList" element
     */
    public noNamespace.ContextRegistrationResponseList addNewContextRegistrationResponseList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationResponseList target = null;
            target = (noNamespace.ContextRegistrationResponseList)get_store().add_element_user(CONTEXTREGISTRATIONRESPONSELIST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "contextRegistrationResponseList" element
     */
    public void unsetContextRegistrationResponseList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXTREGISTRATIONRESPONSELIST$0, 0);
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
