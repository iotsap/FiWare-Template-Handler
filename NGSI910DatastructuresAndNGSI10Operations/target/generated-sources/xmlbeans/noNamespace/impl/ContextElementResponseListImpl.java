/*
 * XML Type:  ContextElementResponseList
 * Namespace: 
 * Java type: noNamespace.ContextElementResponseList
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML ContextElementResponseList(@).
 *
 * This is a complex type.
 */
public class ContextElementResponseListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ContextElementResponseList
{
    private static final long serialVersionUID = 1L;
    
    public ContextElementResponseListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXTELEMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("", "contextElementResponse");
    
    
    /**
     * Gets array of all "contextElementResponse" elements
     */
    public noNamespace.ContextElementResponse[] getContextElementResponseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTEXTELEMENTRESPONSE$0, targetList);
            noNamespace.ContextElementResponse[] result = new noNamespace.ContextElementResponse[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "contextElementResponse" element
     */
    public noNamespace.ContextElementResponse getContextElementResponseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElementResponse target = null;
            target = (noNamespace.ContextElementResponse)get_store().find_element_user(CONTEXTELEMENTRESPONSE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "contextElementResponse" element
     */
    public int sizeOfContextElementResponseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXTELEMENTRESPONSE$0);
        }
    }
    
    /**
     * Sets array of all "contextElementResponse" element
     */
    public void setContextElementResponseArray(noNamespace.ContextElementResponse[] contextElementResponseArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contextElementResponseArray, CONTEXTELEMENTRESPONSE$0);
        }
    }
    
    /**
     * Sets ith "contextElementResponse" element
     */
    public void setContextElementResponseArray(int i, noNamespace.ContextElementResponse contextElementResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElementResponse target = null;
            target = (noNamespace.ContextElementResponse)get_store().find_element_user(CONTEXTELEMENTRESPONSE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contextElementResponse);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contextElementResponse" element
     */
    public noNamespace.ContextElementResponse insertNewContextElementResponse(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElementResponse target = null;
            target = (noNamespace.ContextElementResponse)get_store().insert_element_user(CONTEXTELEMENTRESPONSE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contextElementResponse" element
     */
    public noNamespace.ContextElementResponse addNewContextElementResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElementResponse target = null;
            target = (noNamespace.ContextElementResponse)get_store().add_element_user(CONTEXTELEMENTRESPONSE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "contextElementResponse" element
     */
    public void removeContextElementResponse(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXTELEMENTRESPONSE$0, i);
        }
    }
}
