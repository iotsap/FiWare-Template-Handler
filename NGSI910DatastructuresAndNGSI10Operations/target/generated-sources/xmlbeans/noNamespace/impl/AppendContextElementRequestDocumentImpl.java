/*
 * An XML document type.
 * Localname: appendContextElementRequest
 * Namespace: 
 * Java type: noNamespace.AppendContextElementRequestDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one appendContextElementRequest(@) element.
 *
 * This is a complex type.
 */
public class AppendContextElementRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.AppendContextElementRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public AppendContextElementRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPENDCONTEXTELEMENTREQUEST$0 = 
        new javax.xml.namespace.QName("", "appendContextElementRequest");
    
    
    /**
     * Gets the "appendContextElementRequest" element
     */
    public noNamespace.AppendContextElementRequest getAppendContextElementRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.AppendContextElementRequest target = null;
            target = (noNamespace.AppendContextElementRequest)get_store().find_element_user(APPENDCONTEXTELEMENTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "appendContextElementRequest" element
     */
    public void setAppendContextElementRequest(noNamespace.AppendContextElementRequest appendContextElementRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.AppendContextElementRequest target = null;
            target = (noNamespace.AppendContextElementRequest)get_store().find_element_user(APPENDCONTEXTELEMENTREQUEST$0, 0);
            if (target == null)
            {
                target = (noNamespace.AppendContextElementRequest)get_store().add_element_user(APPENDCONTEXTELEMENTREQUEST$0);
            }
            target.set(appendContextElementRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "appendContextElementRequest" element
     */
    public noNamespace.AppendContextElementRequest addNewAppendContextElementRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.AppendContextElementRequest target = null;
            target = (noNamespace.AppendContextElementRequest)get_store().add_element_user(APPENDCONTEXTELEMENTREQUEST$0);
            return target;
        }
    }
}
