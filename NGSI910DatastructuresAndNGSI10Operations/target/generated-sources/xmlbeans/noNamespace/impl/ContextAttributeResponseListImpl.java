/*
 * XML Type:  ContextAttributeResponseList
 * Namespace: 
 * Java type: noNamespace.ContextAttributeResponseList
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML ContextAttributeResponseList(@).
 *
 * This is a complex type.
 */
public class ContextAttributeResponseListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ContextAttributeResponseList
{
    private static final long serialVersionUID = 1L;
    
    public ContextAttributeResponseListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXTATTRIBUTERESPONSE$0 = 
        new javax.xml.namespace.QName("", "contextAttributeResponse");
    
    
    /**
     * Gets array of all "contextAttributeResponse" elements
     */
    public noNamespace.ContextAttributeResponse[] getContextAttributeResponseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTEXTATTRIBUTERESPONSE$0, targetList);
            noNamespace.ContextAttributeResponse[] result = new noNamespace.ContextAttributeResponse[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "contextAttributeResponse" element
     */
    public noNamespace.ContextAttributeResponse getContextAttributeResponseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextAttributeResponse target = null;
            target = (noNamespace.ContextAttributeResponse)get_store().find_element_user(CONTEXTATTRIBUTERESPONSE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "contextAttributeResponse" element
     */
    public int sizeOfContextAttributeResponseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXTATTRIBUTERESPONSE$0);
        }
    }
    
    /**
     * Sets array of all "contextAttributeResponse" element
     */
    public void setContextAttributeResponseArray(noNamespace.ContextAttributeResponse[] contextAttributeResponseArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contextAttributeResponseArray, CONTEXTATTRIBUTERESPONSE$0);
        }
    }
    
    /**
     * Sets ith "contextAttributeResponse" element
     */
    public void setContextAttributeResponseArray(int i, noNamespace.ContextAttributeResponse contextAttributeResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextAttributeResponse target = null;
            target = (noNamespace.ContextAttributeResponse)get_store().find_element_user(CONTEXTATTRIBUTERESPONSE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contextAttributeResponse);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contextAttributeResponse" element
     */
    public noNamespace.ContextAttributeResponse insertNewContextAttributeResponse(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextAttributeResponse target = null;
            target = (noNamespace.ContextAttributeResponse)get_store().insert_element_user(CONTEXTATTRIBUTERESPONSE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contextAttributeResponse" element
     */
    public noNamespace.ContextAttributeResponse addNewContextAttributeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextAttributeResponse target = null;
            target = (noNamespace.ContextAttributeResponse)get_store().add_element_user(CONTEXTATTRIBUTERESPONSE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "contextAttributeResponse" element
     */
    public void removeContextAttributeResponse(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXTATTRIBUTERESPONSE$0, i);
        }
    }
}
