/*
 * An XML document type.
 * Localname: updateContextAttributeRequest
 * Namespace: 
 * Java type: noNamespace.UpdateContextAttributeRequestDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one updateContextAttributeRequest(@) element.
 *
 * This is a complex type.
 */
public class UpdateContextAttributeRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.UpdateContextAttributeRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateContextAttributeRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATECONTEXTATTRIBUTEREQUEST$0 = 
        new javax.xml.namespace.QName("", "updateContextAttributeRequest");
    
    
    /**
     * Gets the "updateContextAttributeRequest" element
     */
    public noNamespace.UpdateContextAttributeRequest getUpdateContextAttributeRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextAttributeRequest target = null;
            target = (noNamespace.UpdateContextAttributeRequest)get_store().find_element_user(UPDATECONTEXTATTRIBUTEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "updateContextAttributeRequest" element
     */
    public void setUpdateContextAttributeRequest(noNamespace.UpdateContextAttributeRequest updateContextAttributeRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextAttributeRequest target = null;
            target = (noNamespace.UpdateContextAttributeRequest)get_store().find_element_user(UPDATECONTEXTATTRIBUTEREQUEST$0, 0);
            if (target == null)
            {
                target = (noNamespace.UpdateContextAttributeRequest)get_store().add_element_user(UPDATECONTEXTATTRIBUTEREQUEST$0);
            }
            target.set(updateContextAttributeRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "updateContextAttributeRequest" element
     */
    public noNamespace.UpdateContextAttributeRequest addNewUpdateContextAttributeRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextAttributeRequest target = null;
            target = (noNamespace.UpdateContextAttributeRequest)get_store().add_element_user(UPDATECONTEXTATTRIBUTEREQUEST$0);
            return target;
        }
    }
}
