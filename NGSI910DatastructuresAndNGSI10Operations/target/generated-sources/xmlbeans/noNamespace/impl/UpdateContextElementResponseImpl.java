/*
 * XML Type:  UpdateContextElementResponse
 * Namespace: 
 * Java type: noNamespace.UpdateContextElementResponse
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML UpdateContextElementResponse(@).
 *
 * This is a complex type.
 */
public class UpdateContextElementResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.UpdateContextElementResponse
{
    private static final long serialVersionUID = 1L;
    
    public UpdateContextElementResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORCODE$0 = 
        new javax.xml.namespace.QName("", "errorCode");
    private static final javax.xml.namespace.QName CONTEXTRESPONSELIST$2 = 
        new javax.xml.namespace.QName("", "contextResponseList");
    
    
    /**
     * Gets the "errorCode" element
     */
    public noNamespace.StatusCode getErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.StatusCode target = null;
            target = (noNamespace.StatusCode)get_store().find_element_user(ERRORCODE$0, 0);
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
            return get_store().count_elements(ERRORCODE$0) != 0;
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
            target = (noNamespace.StatusCode)get_store().find_element_user(ERRORCODE$0, 0);
            if (target == null)
            {
                target = (noNamespace.StatusCode)get_store().add_element_user(ERRORCODE$0);
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
            target = (noNamespace.StatusCode)get_store().add_element_user(ERRORCODE$0);
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
            get_store().remove_element(ERRORCODE$0, 0);
        }
    }
    
    /**
     * Gets the "contextResponseList" element
     */
    public noNamespace.ContextAttributeResponseList getContextResponseList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextAttributeResponseList target = null;
            target = (noNamespace.ContextAttributeResponseList)get_store().find_element_user(CONTEXTRESPONSELIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "contextResponseList" element
     */
    public boolean isSetContextResponseList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXTRESPONSELIST$2) != 0;
        }
    }
    
    /**
     * Sets the "contextResponseList" element
     */
    public void setContextResponseList(noNamespace.ContextAttributeResponseList contextResponseList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextAttributeResponseList target = null;
            target = (noNamespace.ContextAttributeResponseList)get_store().find_element_user(CONTEXTRESPONSELIST$2, 0);
            if (target == null)
            {
                target = (noNamespace.ContextAttributeResponseList)get_store().add_element_user(CONTEXTRESPONSELIST$2);
            }
            target.set(contextResponseList);
        }
    }
    
    /**
     * Appends and returns a new empty "contextResponseList" element
     */
    public noNamespace.ContextAttributeResponseList addNewContextResponseList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextAttributeResponseList target = null;
            target = (noNamespace.ContextAttributeResponseList)get_store().add_element_user(CONTEXTRESPONSELIST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "contextResponseList" element
     */
    public void unsetContextResponseList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXTRESPONSELIST$2, 0);
        }
    }
}
