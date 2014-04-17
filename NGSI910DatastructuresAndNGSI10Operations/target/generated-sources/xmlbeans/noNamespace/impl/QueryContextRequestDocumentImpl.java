/*
 * An XML document type.
 * Localname: queryContextRequest
 * Namespace: 
 * Java type: noNamespace.QueryContextRequestDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one queryContextRequest(@) element.
 *
 * This is a complex type.
 */
public class QueryContextRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.QueryContextRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public QueryContextRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYCONTEXTREQUEST$0 = 
        new javax.xml.namespace.QName("", "queryContextRequest");
    
    
    /**
     * Gets the "queryContextRequest" element
     */
    public noNamespace.QueryContextRequest getQueryContextRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.QueryContextRequest target = null;
            target = (noNamespace.QueryContextRequest)get_store().find_element_user(QUERYCONTEXTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "queryContextRequest" element
     */
    public void setQueryContextRequest(noNamespace.QueryContextRequest queryContextRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.QueryContextRequest target = null;
            target = (noNamespace.QueryContextRequest)get_store().find_element_user(QUERYCONTEXTREQUEST$0, 0);
            if (target == null)
            {
                target = (noNamespace.QueryContextRequest)get_store().add_element_user(QUERYCONTEXTREQUEST$0);
            }
            target.set(queryContextRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "queryContextRequest" element
     */
    public noNamespace.QueryContextRequest addNewQueryContextRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.QueryContextRequest target = null;
            target = (noNamespace.QueryContextRequest)get_store().add_element_user(QUERYCONTEXTREQUEST$0);
            return target;
        }
    }
}
