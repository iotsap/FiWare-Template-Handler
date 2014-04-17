/*
 * An XML document type.
 * Localname: updateContextResponse
 * Namespace: 
 * Java type: noNamespace.UpdateContextResponseDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one updateContextResponse(@) element.
 *
 * This is a complex type.
 */
public class UpdateContextResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.UpdateContextResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateContextResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATECONTEXTRESPONSE$0 = 
        new javax.xml.namespace.QName("", "updateContextResponse");
    
    
    /**
     * Gets the "updateContextResponse" element
     */
    public noNamespace.UpdateContextResponse getUpdateContextResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextResponse target = null;
            target = (noNamespace.UpdateContextResponse)get_store().find_element_user(UPDATECONTEXTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "updateContextResponse" element
     */
    public void setUpdateContextResponse(noNamespace.UpdateContextResponse updateContextResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextResponse target = null;
            target = (noNamespace.UpdateContextResponse)get_store().find_element_user(UPDATECONTEXTRESPONSE$0, 0);
            if (target == null)
            {
                target = (noNamespace.UpdateContextResponse)get_store().add_element_user(UPDATECONTEXTRESPONSE$0);
            }
            target.set(updateContextResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "updateContextResponse" element
     */
    public noNamespace.UpdateContextResponse addNewUpdateContextResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextResponse target = null;
            target = (noNamespace.UpdateContextResponse)get_store().add_element_user(UPDATECONTEXTRESPONSE$0);
            return target;
        }
    }
}
