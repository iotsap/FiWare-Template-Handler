/*
 * XML Type:  ContextRegistrationResponseList
 * Namespace: 
 * Java type: noNamespace.ContextRegistrationResponseList
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML ContextRegistrationResponseList(@).
 *
 * This is a complex type.
 */
public class ContextRegistrationResponseListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ContextRegistrationResponseList
{
    private static final long serialVersionUID = 1L;
    
    public ContextRegistrationResponseListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXTREGISTRATIONRESPONSE$0 = 
        new javax.xml.namespace.QName("", "contextRegistrationResponse");
    
    
    /**
     * Gets array of all "contextRegistrationResponse" elements
     */
    public noNamespace.ContextRegistrationResponse[] getContextRegistrationResponseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTEXTREGISTRATIONRESPONSE$0, targetList);
            noNamespace.ContextRegistrationResponse[] result = new noNamespace.ContextRegistrationResponse[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "contextRegistrationResponse" element
     */
    public noNamespace.ContextRegistrationResponse getContextRegistrationResponseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationResponse target = null;
            target = (noNamespace.ContextRegistrationResponse)get_store().find_element_user(CONTEXTREGISTRATIONRESPONSE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "contextRegistrationResponse" element
     */
    public int sizeOfContextRegistrationResponseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXTREGISTRATIONRESPONSE$0);
        }
    }
    
    /**
     * Sets array of all "contextRegistrationResponse" element
     */
    public void setContextRegistrationResponseArray(noNamespace.ContextRegistrationResponse[] contextRegistrationResponseArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contextRegistrationResponseArray, CONTEXTREGISTRATIONRESPONSE$0);
        }
    }
    
    /**
     * Sets ith "contextRegistrationResponse" element
     */
    public void setContextRegistrationResponseArray(int i, noNamespace.ContextRegistrationResponse contextRegistrationResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationResponse target = null;
            target = (noNamespace.ContextRegistrationResponse)get_store().find_element_user(CONTEXTREGISTRATIONRESPONSE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contextRegistrationResponse);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contextRegistrationResponse" element
     */
    public noNamespace.ContextRegistrationResponse insertNewContextRegistrationResponse(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationResponse target = null;
            target = (noNamespace.ContextRegistrationResponse)get_store().insert_element_user(CONTEXTREGISTRATIONRESPONSE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contextRegistrationResponse" element
     */
    public noNamespace.ContextRegistrationResponse addNewContextRegistrationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationResponse target = null;
            target = (noNamespace.ContextRegistrationResponse)get_store().add_element_user(CONTEXTREGISTRATIONRESPONSE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "contextRegistrationResponse" element
     */
    public void removeContextRegistrationResponse(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXTREGISTRATIONRESPONSE$0, i);
        }
    }
}
