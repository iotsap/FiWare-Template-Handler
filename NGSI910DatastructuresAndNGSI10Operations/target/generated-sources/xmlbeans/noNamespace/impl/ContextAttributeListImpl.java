/*
 * XML Type:  ContextAttributeList
 * Namespace: 
 * Java type: noNamespace.ContextAttributeList
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML ContextAttributeList(@).
 *
 * This is a complex type.
 */
public class ContextAttributeListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ContextAttributeList
{
    private static final long serialVersionUID = 1L;
    
    public ContextAttributeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXTATTRIBUTE$0 = 
        new javax.xml.namespace.QName("", "contextAttribute");
    
    
    /**
     * Gets array of all "contextAttribute" elements
     */
    public noNamespace.ContextAttribute[] getContextAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTEXTATTRIBUTE$0, targetList);
            noNamespace.ContextAttribute[] result = new noNamespace.ContextAttribute[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "contextAttribute" element
     */
    public noNamespace.ContextAttribute getContextAttributeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextAttribute target = null;
            target = (noNamespace.ContextAttribute)get_store().find_element_user(CONTEXTATTRIBUTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "contextAttribute" element
     */
    public int sizeOfContextAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXTATTRIBUTE$0);
        }
    }
    
    /**
     * Sets array of all "contextAttribute" element
     */
    public void setContextAttributeArray(noNamespace.ContextAttribute[] contextAttributeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contextAttributeArray, CONTEXTATTRIBUTE$0);
        }
    }
    
    /**
     * Sets ith "contextAttribute" element
     */
    public void setContextAttributeArray(int i, noNamespace.ContextAttribute contextAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextAttribute target = null;
            target = (noNamespace.ContextAttribute)get_store().find_element_user(CONTEXTATTRIBUTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contextAttribute);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contextAttribute" element
     */
    public noNamespace.ContextAttribute insertNewContextAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextAttribute target = null;
            target = (noNamespace.ContextAttribute)get_store().insert_element_user(CONTEXTATTRIBUTE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contextAttribute" element
     */
    public noNamespace.ContextAttribute addNewContextAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextAttribute target = null;
            target = (noNamespace.ContextAttribute)get_store().add_element_user(CONTEXTATTRIBUTE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "contextAttribute" element
     */
    public void removeContextAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXTATTRIBUTE$0, i);
        }
    }
}
