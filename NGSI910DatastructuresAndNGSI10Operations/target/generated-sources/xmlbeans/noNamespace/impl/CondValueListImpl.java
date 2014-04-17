/*
 * XML Type:  CondValueList
 * Namespace: 
 * Java type: noNamespace.CondValueList
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML CondValueList(@).
 *
 * This is a complex type.
 */
public class CondValueListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.CondValueList
{
    private static final long serialVersionUID = 1L;
    
    public CondValueListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDVALUE$0 = 
        new javax.xml.namespace.QName("", "condValue");
    
    
    /**
     * Gets array of all "condValue" elements
     */
    public java.lang.String[] getCondValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONDVALUE$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "condValue" element
     */
    public java.lang.String getCondValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONDVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "condValue" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetCondValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONDVALUE$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "condValue" element
     */
    public org.apache.xmlbeans.XmlString xgetCondValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONDVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "condValue" element
     */
    public int sizeOfCondValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONDVALUE$0);
        }
    }
    
    /**
     * Sets array of all "condValue" element
     */
    public void setCondValueArray(java.lang.String[] condValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(condValueArray, CONDVALUE$0);
        }
    }
    
    /**
     * Sets ith "condValue" element
     */
    public void setCondValueArray(int i, java.lang.String condValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONDVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(condValue);
        }
    }
    
    /**
     * Sets (as xml) array of all "condValue" element
     */
    public void xsetCondValueArray(org.apache.xmlbeans.XmlString[]condValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(condValueArray, CONDVALUE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "condValue" element
     */
    public void xsetCondValueArray(int i, org.apache.xmlbeans.XmlString condValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONDVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(condValue);
        }
    }
    
    /**
     * Inserts the value as the ith "condValue" element
     */
    public void insertCondValue(int i, java.lang.String condValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CONDVALUE$0, i);
            target.setStringValue(condValue);
        }
    }
    
    /**
     * Appends the value as the last "condValue" element
     */
    public void addCondValue(java.lang.String condValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONDVALUE$0);
            target.setStringValue(condValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "condValue" element
     */
    public org.apache.xmlbeans.XmlString insertNewCondValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(CONDVALUE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "condValue" element
     */
    public org.apache.xmlbeans.XmlString addNewCondValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONDVALUE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "condValue" element
     */
    public void removeCondValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONDVALUE$0, i);
        }
    }
}
