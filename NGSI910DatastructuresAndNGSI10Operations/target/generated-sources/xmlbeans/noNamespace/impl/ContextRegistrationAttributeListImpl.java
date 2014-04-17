/*
 * XML Type:  ContextRegistrationAttributeList
 * Namespace: 
 * Java type: noNamespace.ContextRegistrationAttributeList
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML ContextRegistrationAttributeList(@).
 *
 * This is a complex type.
 */
public class ContextRegistrationAttributeListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ContextRegistrationAttributeList
{
    private static final long serialVersionUID = 1L;
    
    public ContextRegistrationAttributeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXTREGISTRATIONATTRIBUTE$0 = 
        new javax.xml.namespace.QName("", "contextRegistrationAttribute");
    
    
    /**
     * Gets array of all "contextRegistrationAttribute" elements
     */
    public noNamespace.ContextRegistrationAttribute[] getContextRegistrationAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTEXTREGISTRATIONATTRIBUTE$0, targetList);
            noNamespace.ContextRegistrationAttribute[] result = new noNamespace.ContextRegistrationAttribute[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "contextRegistrationAttribute" element
     */
    public noNamespace.ContextRegistrationAttribute getContextRegistrationAttributeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationAttribute target = null;
            target = (noNamespace.ContextRegistrationAttribute)get_store().find_element_user(CONTEXTREGISTRATIONATTRIBUTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "contextRegistrationAttribute" element
     */
    public int sizeOfContextRegistrationAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXTREGISTRATIONATTRIBUTE$0);
        }
    }
    
    /**
     * Sets array of all "contextRegistrationAttribute" element
     */
    public void setContextRegistrationAttributeArray(noNamespace.ContextRegistrationAttribute[] contextRegistrationAttributeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contextRegistrationAttributeArray, CONTEXTREGISTRATIONATTRIBUTE$0);
        }
    }
    
    /**
     * Sets ith "contextRegistrationAttribute" element
     */
    public void setContextRegistrationAttributeArray(int i, noNamespace.ContextRegistrationAttribute contextRegistrationAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationAttribute target = null;
            target = (noNamespace.ContextRegistrationAttribute)get_store().find_element_user(CONTEXTREGISTRATIONATTRIBUTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contextRegistrationAttribute);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contextRegistrationAttribute" element
     */
    public noNamespace.ContextRegistrationAttribute insertNewContextRegistrationAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationAttribute target = null;
            target = (noNamespace.ContextRegistrationAttribute)get_store().insert_element_user(CONTEXTREGISTRATIONATTRIBUTE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contextRegistrationAttribute" element
     */
    public noNamespace.ContextRegistrationAttribute addNewContextRegistrationAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationAttribute target = null;
            target = (noNamespace.ContextRegistrationAttribute)get_store().add_element_user(CONTEXTREGISTRATIONATTRIBUTE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "contextRegistrationAttribute" element
     */
    public void removeContextRegistrationAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXTREGISTRATIONATTRIBUTE$0, i);
        }
    }
}
