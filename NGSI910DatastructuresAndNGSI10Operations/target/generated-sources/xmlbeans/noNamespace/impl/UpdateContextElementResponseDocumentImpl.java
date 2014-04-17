/*
 * An XML document type.
 * Localname: updateContextElementResponse
 * Namespace: 
 * Java type: noNamespace.UpdateContextElementResponseDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one updateContextElementResponse(@) element.
 *
 * This is a complex type.
 */
public class UpdateContextElementResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.UpdateContextElementResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateContextElementResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATECONTEXTELEMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("", "updateContextElementResponse");
    
    
    /**
     * Gets the "updateContextElementResponse" element
     */
    public noNamespace.UpdateContextElementResponse getUpdateContextElementResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextElementResponse target = null;
            target = (noNamespace.UpdateContextElementResponse)get_store().find_element_user(UPDATECONTEXTELEMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "updateContextElementResponse" element
     */
    public void setUpdateContextElementResponse(noNamespace.UpdateContextElementResponse updateContextElementResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextElementResponse target = null;
            target = (noNamespace.UpdateContextElementResponse)get_store().find_element_user(UPDATECONTEXTELEMENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (noNamespace.UpdateContextElementResponse)get_store().add_element_user(UPDATECONTEXTELEMENTRESPONSE$0);
            }
            target.set(updateContextElementResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "updateContextElementResponse" element
     */
    public noNamespace.UpdateContextElementResponse addNewUpdateContextElementResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateContextElementResponse target = null;
            target = (noNamespace.UpdateContextElementResponse)get_store().add_element_user(UPDATECONTEXTELEMENTRESPONSE$0);
            return target;
        }
    }
}
