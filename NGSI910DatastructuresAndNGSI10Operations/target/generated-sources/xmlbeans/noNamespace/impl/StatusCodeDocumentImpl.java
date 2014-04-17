/*
 * An XML document type.
 * Localname: statusCode
 * Namespace: 
 * Java type: noNamespace.StatusCodeDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one statusCode(@) element.
 *
 * This is a complex type.
 */
public class StatusCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.StatusCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public StatusCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUSCODE$0 = 
        new javax.xml.namespace.QName("", "statusCode");
    
    
    /**
     * Gets the "statusCode" element
     */
    public noNamespace.StatusCode getStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.StatusCode target = null;
            target = (noNamespace.StatusCode)get_store().find_element_user(STATUSCODE$0, 0);
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
            target = (noNamespace.StatusCode)get_store().find_element_user(STATUSCODE$0, 0);
            if (target == null)
            {
                target = (noNamespace.StatusCode)get_store().add_element_user(STATUSCODE$0);
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
            target = (noNamespace.StatusCode)get_store().add_element_user(STATUSCODE$0);
            return target;
        }
    }
}
