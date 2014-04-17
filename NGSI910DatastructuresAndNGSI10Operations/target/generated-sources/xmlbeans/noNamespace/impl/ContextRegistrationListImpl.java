/*
 * XML Type:  ContextRegistrationList
 * Namespace: 
 * Java type: noNamespace.ContextRegistrationList
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML ContextRegistrationList(@).
 *
 * This is a complex type.
 */
public class ContextRegistrationListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ContextRegistrationList
{
    private static final long serialVersionUID = 1L;
    
    public ContextRegistrationListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXTREGISTRATION$0 = 
        new javax.xml.namespace.QName("", "contextRegistration");
    
    
    /**
     * Gets array of all "contextRegistration" elements
     */
    public noNamespace.ContextRegistration[] getContextRegistrationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTEXTREGISTRATION$0, targetList);
            noNamespace.ContextRegistration[] result = new noNamespace.ContextRegistration[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "contextRegistration" element
     */
    public noNamespace.ContextRegistration getContextRegistrationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistration target = null;
            target = (noNamespace.ContextRegistration)get_store().find_element_user(CONTEXTREGISTRATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "contextRegistration" element
     */
    public int sizeOfContextRegistrationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXTREGISTRATION$0);
        }
    }
    
    /**
     * Sets array of all "contextRegistration" element
     */
    public void setContextRegistrationArray(noNamespace.ContextRegistration[] contextRegistrationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contextRegistrationArray, CONTEXTREGISTRATION$0);
        }
    }
    
    /**
     * Sets ith "contextRegistration" element
     */
    public void setContextRegistrationArray(int i, noNamespace.ContextRegistration contextRegistration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistration target = null;
            target = (noNamespace.ContextRegistration)get_store().find_element_user(CONTEXTREGISTRATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contextRegistration);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contextRegistration" element
     */
    public noNamespace.ContextRegistration insertNewContextRegistration(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistration target = null;
            target = (noNamespace.ContextRegistration)get_store().insert_element_user(CONTEXTREGISTRATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contextRegistration" element
     */
    public noNamespace.ContextRegistration addNewContextRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistration target = null;
            target = (noNamespace.ContextRegistration)get_store().add_element_user(CONTEXTREGISTRATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "contextRegistration" element
     */
    public void removeContextRegistration(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXTREGISTRATION$0, i);
        }
    }
}
