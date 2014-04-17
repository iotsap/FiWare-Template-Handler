/*
 * An XML document type.
 * Localname: updateContextElementRequest
 * Namespace: 
 * Java type: noNamespace.UpdateContextElementRequestDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one updateContextElementRequest(@) element.
 *
 * This is a complex type.
 */
public class UpdateContextElementRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.UpdateContextElementRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateContextElementRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATECONTEXTELEMENTREQUEST$0 = 
        new javax.xml.namespace.QName("", "updateContextElementRequest");
    
    
    /**
     * Gets the "updateContextElementRequest" element
     */
    public noNamespace.UpdateContextElementRequest getUpdateContextElementRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextElementRequest target = null;
            target = (noNamespace.UpdateContextElementRequest)get_store().find_element_user(UPDATECONTEXTELEMENTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "updateContextElementRequest" element
     */
    public void setUpdateContextElementRequest(noNamespace.UpdateContextElementRequest updateContextElementRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextElementRequest target = null;
            target = (noNamespace.UpdateContextElementRequest)get_store().find_element_user(UPDATECONTEXTELEMENTREQUEST$0, 0);
            if (target == null)
            {
                target = (noNamespace.UpdateContextElementRequest)get_store().add_element_user(UPDATECONTEXTELEMENTREQUEST$0);
            }
            target.set(updateContextElementRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "updateContextElementRequest" element
     */
    public noNamespace.UpdateContextElementRequest addNewUpdateContextElementRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextElementRequest target = null;
            target = (noNamespace.UpdateContextElementRequest)get_store().add_element_user(UPDATECONTEXTELEMENTREQUEST$0);
            return target;
        }
    }
}
