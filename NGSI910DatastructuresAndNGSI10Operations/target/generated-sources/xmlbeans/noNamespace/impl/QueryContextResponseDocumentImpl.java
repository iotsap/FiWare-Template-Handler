/*
 * An XML document type.
 * Localname: queryContextResponse
 * Namespace: 
 * Java type: noNamespace.QueryContextResponseDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one queryContextResponse(@) element.
 *
 * This is a complex type.
 */
public class QueryContextResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.QueryContextResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public QueryContextResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYCONTEXTRESPONSE$0 = 
        new javax.xml.namespace.QName("", "queryContextResponse");
    
    
    /**
     * Gets the "queryContextResponse" element
     */
    public noNamespace.QueryContextResponse getQueryContextResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.QueryContextResponse target = null;
            target = (noNamespace.QueryContextResponse)get_store().find_element_user(QUERYCONTEXTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "queryContextResponse" element
     */
    public void setQueryContextResponse(noNamespace.QueryContextResponse queryContextResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.QueryContextResponse target = null;
            target = (noNamespace.QueryContextResponse)get_store().find_element_user(QUERYCONTEXTRESPONSE$0, 0);
            if (target == null)
            {
                target = (noNamespace.QueryContextResponse)get_store().add_element_user(QUERYCONTEXTRESPONSE$0);
            }
            target.set(queryContextResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "queryContextResponse" element
     */
    public noNamespace.QueryContextResponse addNewQueryContextResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.QueryContextResponse target = null;
            target = (noNamespace.QueryContextResponse)get_store().add_element_user(QUERYCONTEXTRESPONSE$0);
            return target;
        }
    }
}
