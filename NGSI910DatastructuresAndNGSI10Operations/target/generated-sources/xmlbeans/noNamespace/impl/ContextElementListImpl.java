/*
 * XML Type:  ContextElementList
 * Namespace: 
 * Java type: noNamespace.ContextElementList
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML ContextElementList(@).
 *
 * This is a complex type.
 */
public class ContextElementListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ContextElementList
{
    private static final long serialVersionUID = 1L;
    
    public ContextElementListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXTELEMENT$0 = 
        new javax.xml.namespace.QName("", "contextElement");
    
    
    /**
     * Gets array of all "contextElement" elements
     */
    public noNamespace.ContextElement[] getContextElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTEXTELEMENT$0, targetList);
            noNamespace.ContextElement[] result = new noNamespace.ContextElement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "contextElement" element
     */
    public noNamespace.ContextElement getContextElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElement target = null;
            target = (noNamespace.ContextElement)get_store().find_element_user(CONTEXTELEMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "contextElement" element
     */
    public int sizeOfContextElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXTELEMENT$0);
        }
    }
    
    /**
     * Sets array of all "contextElement" element
     */
    public void setContextElementArray(noNamespace.ContextElement[] contextElementArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contextElementArray, CONTEXTELEMENT$0);
        }
    }
    
    /**
     * Sets ith "contextElement" element
     */
    public void setContextElementArray(int i, noNamespace.ContextElement contextElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElement target = null;
            target = (noNamespace.ContextElement)get_store().find_element_user(CONTEXTELEMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contextElement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contextElement" element
     */
    public noNamespace.ContextElement insertNewContextElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElement target = null;
            target = (noNamespace.ContextElement)get_store().insert_element_user(CONTEXTELEMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contextElement" element
     */
    public noNamespace.ContextElement addNewContextElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElement target = null;
            target = (noNamespace.ContextElement)get_store().add_element_user(CONTEXTELEMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "contextElement" element
     */
    public void removeContextElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXTELEMENT$0, i);
        }
    }
}
