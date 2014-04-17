/*
 * XML Type:  ContextElementResponse
 * Namespace: 
 * Java type: noNamespace.ContextElementResponse
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML ContextElementResponse(@).
 *
 * This is a complex type.
 */
public class ContextElementResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ContextElementResponse
{
    private static final long serialVersionUID = 1L;
    
    public ContextElementResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXTELEMENT$0 = 
        new javax.xml.namespace.QName("", "contextElement");
    private static final javax.xml.namespace.QName STATUSCODE$2 = 
        new javax.xml.namespace.QName("", "statusCode");
    
    
    /**
     * Gets the "contextElement" element
     */
    public noNamespace.ContextElement getContextElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElement target = null;
            target = (noNamespace.ContextElement)get_store().find_element_user(CONTEXTELEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contextElement" element
     */
    public void setContextElement(noNamespace.ContextElement contextElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElement target = null;
            target = (noNamespace.ContextElement)get_store().find_element_user(CONTEXTELEMENT$0, 0);
            if (target == null)
            {
                target = (noNamespace.ContextElement)get_store().add_element_user(CONTEXTELEMENT$0);
            }
            target.set(contextElement);
        }
    }
    
    /**
     * Appends and returns a new empty "contextElement" element
     */
    public noNamespace.ContextElement addNewContextElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElement target = null;
            target = (noNamespace.ContextElement)get_store().add_element_user(CONTEXTELEMENT$0);
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
