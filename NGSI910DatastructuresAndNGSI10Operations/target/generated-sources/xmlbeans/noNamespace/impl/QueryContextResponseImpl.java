/*
 * XML Type:  QueryContextResponse
 * Namespace: 
 * Java type: noNamespace.QueryContextResponse
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML QueryContextResponse(@).
 *
 * This is a complex type.
 */
public class QueryContextResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.QueryContextResponse
{
    private static final long serialVersionUID = 1L;
    
    public QueryContextResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXTRESPONSELIST$0 = 
        new javax.xml.namespace.QName("", "contextResponseList");
    private static final javax.xml.namespace.QName ERRORCODE$2 = 
        new javax.xml.namespace.QName("", "errorCode");
    
    
    /**
     * Gets the "contextResponseList" element
     */
    public noNamespace.ContextElementResponseList getContextResponseList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElementResponseList target = null;
            target = (noNamespace.ContextElementResponseList)get_store().find_element_user(CONTEXTRESPONSELIST$0, 0);
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
            return get_store().count_elements(CONTEXTRESPONSELIST$0) != 0;
        }
    }
    
    /**
     * Sets the "contextResponseList" element
     */
    public void setContextResponseList(noNamespace.ContextElementResponseList contextResponseList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElementResponseList target = null;
            target = (noNamespace.ContextElementResponseList)get_store().find_element_user(CONTEXTRESPONSELIST$0, 0);
            if (target == null)
            {
                target = (noNamespace.ContextElementResponseList)get_store().add_element_user(CONTEXTRESPONSELIST$0);
            }
            target.set(contextResponseList);
        }
    }
    
    /**
     * Appends and returns a new empty "contextResponseList" element
     */
    public noNamespace.ContextElementResponseList addNewContextResponseList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElementResponseList target = null;
            target = (noNamespace.ContextElementResponseList)get_store().add_element_user(CONTEXTRESPONSELIST$0);
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
            get_store().remove_element(CONTEXTRESPONSELIST$0, 0);
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
