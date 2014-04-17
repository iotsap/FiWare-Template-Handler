/*
 * XML Type:  OperationScopeList
 * Namespace: 
 * Java type: noNamespace.OperationScopeList
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML OperationScopeList(@).
 *
 * This is a complex type.
 */
public class OperationScopeListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.OperationScopeList
{
    private static final long serialVersionUID = 1L;
    
    public OperationScopeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONSCOPE$0 = 
        new javax.xml.namespace.QName("", "operationScope");
    
    
    /**
     * Gets array of all "operationScope" elements
     */
    public noNamespace.OperationScope[] getOperationScopeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OPERATIONSCOPE$0, targetList);
            noNamespace.OperationScope[] result = new noNamespace.OperationScope[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "operationScope" element
     */
    public noNamespace.OperationScope getOperationScopeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.OperationScope target = null;
            target = (noNamespace.OperationScope)get_store().find_element_user(OPERATIONSCOPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "operationScope" element
     */
    public int sizeOfOperationScopeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATIONSCOPE$0);
        }
    }
    
    /**
     * Sets array of all "operationScope" element
     */
    public void setOperationScopeArray(noNamespace.OperationScope[] operationScopeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(operationScopeArray, OPERATIONSCOPE$0);
        }
    }
    
    /**
     * Sets ith "operationScope" element
     */
    public void setOperationScopeArray(int i, noNamespace.OperationScope operationScope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.OperationScope target = null;
            target = (noNamespace.OperationScope)get_store().find_element_user(OPERATIONSCOPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(operationScope);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "operationScope" element
     */
    public noNamespace.OperationScope insertNewOperationScope(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.OperationScope target = null;
            target = (noNamespace.OperationScope)get_store().insert_element_user(OPERATIONSCOPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "operationScope" element
     */
    public noNamespace.OperationScope addNewOperationScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.OperationScope target = null;
            target = (noNamespace.OperationScope)get_store().add_element_user(OPERATIONSCOPE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "operationScope" element
     */
    public void removeOperationScope(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATIONSCOPE$0, i);
        }
    }
}
