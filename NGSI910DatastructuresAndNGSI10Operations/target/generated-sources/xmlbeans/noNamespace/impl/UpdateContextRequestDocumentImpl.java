/*
 * An XML document type.
 * Localname: updateContextRequest
 * Namespace: 
 * Java type: noNamespace.UpdateContextRequestDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one updateContextRequest(@) element.
 *
 * This is a complex type.
 */
public class UpdateContextRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.UpdateContextRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateContextRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATECONTEXTREQUEST$0 = 
        new javax.xml.namespace.QName("", "updateContextRequest");
    
    
    /**
     * Gets the "updateContextRequest" element
     */
    public noNamespace.UpdateContextRequest getUpdateContextRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextRequest target = null;
            target = (noNamespace.UpdateContextRequest)get_store().find_element_user(UPDATECONTEXTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "updateContextRequest" element
     */
    public void setUpdateContextRequest(noNamespace.UpdateContextRequest updateContextRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextRequest target = null;
            target = (noNamespace.UpdateContextRequest)get_store().find_element_user(UPDATECONTEXTREQUEST$0, 0);
            if (target == null)
            {
                target = (noNamespace.UpdateContextRequest)get_store().add_element_user(UPDATECONTEXTREQUEST$0);
            }
            target.set(updateContextRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "updateContextRequest" element
     */
    public noNamespace.UpdateContextRequest addNewUpdateContextRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextRequest target = null;
            target = (noNamespace.UpdateContextRequest)get_store().add_element_user(UPDATECONTEXTREQUEST$0);
            return target;
        }
    }
}
