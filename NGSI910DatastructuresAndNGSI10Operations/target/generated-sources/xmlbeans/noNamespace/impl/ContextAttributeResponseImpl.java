/*
 * XML Type:  ContextAttributeResponse
 * Namespace: 
 * Java type: noNamespace.ContextAttributeResponse
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML ContextAttributeResponse(@).
 *
 * This is a complex type.
 */
public class ContextAttributeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ContextAttributeResponse
{
    private static final long serialVersionUID = 1L;
    
    public ContextAttributeResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXTATTRIBUTELIST$0 = 
        new javax.xml.namespace.QName("", "contextAttributeList");
    private static final javax.xml.namespace.QName STATUSCODE$2 = 
        new javax.xml.namespace.QName("", "statusCode");
    
    
    /**
     * Gets the "contextAttributeList" element
     */
    public noNamespace.ContextAttributeList getContextAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextAttributeList target = null;
            target = (noNamespace.ContextAttributeList)get_store().find_element_user(CONTEXTATTRIBUTELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contextAttributeList" element
     */
    public void setContextAttributeList(noNamespace.ContextAttributeList contextAttributeList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextAttributeList target = null;
            target = (noNamespace.ContextAttributeList)get_store().find_element_user(CONTEXTATTRIBUTELIST$0, 0);
            if (target == null)
            {
                target = (noNamespace.ContextAttributeList)get_store().add_element_user(CONTEXTATTRIBUTELIST$0);
            }
            target.set(contextAttributeList);
        }
    }
    
    /**
     * Appends and returns a new empty "contextAttributeList" element
     */
    public noNamespace.ContextAttributeList addNewContextAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextAttributeList target = null;
            target = (noNamespace.ContextAttributeList)get_store().add_element_user(CONTEXTATTRIBUTELIST$0);
            return target;
        }
    }
    
    /**
     * Gets the "statusCode" element
     */
    public noNamespace.StatusCode getStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.StatusCode target = null;
            target = (noNamespace.StatusCode)get_store().find_element_user(STATUSCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "statusCode" element
     */
    public void setStatusCode(noNamespace.StatusCode statusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.StatusCode target = null;
            target = (noNamespace.StatusCode)get_store().find_element_user(STATUSCODE$2, 0);
            if (target == null)
            {
                target = (noNamespace.StatusCode)get_store().add_element_user(STATUSCODE$2);
            }
            target.set(statusCode);
        }
    }
    
    /**
     * Appends and returns a new empty "statusCode" element
     */
    public noNamespace.StatusCode addNewStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.StatusCode target = null;
            target = (noNamespace.StatusCode)get_store().add_element_user(STATUSCODE$2);
            return target;
        }
    }
}
