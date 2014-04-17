/*
 * XML Type:  ContextMetadataList
 * Namespace: 
 * Java type: noNamespace.ContextMetadataList
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML ContextMetadataList(@).
 *
 * This is a complex type.
 */
public class ContextMetadataListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ContextMetadataList
{
    private static final long serialVersionUID = 1L;
    
    public ContextMetadataListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXTMETADATA$0 = 
        new javax.xml.namespace.QName("", "contextMetadata");
    
    
    /**
     * Gets array of all "contextMetadata" elements
     */
    public noNamespace.ContextMetadata[] getContextMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTEXTMETADATA$0, targetList);
            noNamespace.ContextMetadata[] result = new noNamespace.ContextMetadata[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "contextMetadata" element
     */
    public noNamespace.ContextMetadata getContextMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextMetadata target = null;
            target = (noNamespace.ContextMetadata)get_store().find_element_user(CONTEXTMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "contextMetadata" element
     */
    public int sizeOfContextMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXTMETADATA$0);
        }
    }
    
    /**
     * Sets array of all "contextMetadata" element
     */
    public void setContextMetadataArray(noNamespace.ContextMetadata[] contextMetadataArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contextMetadataArray, CONTEXTMETADATA$0);
        }
    }
    
    /**
     * Sets ith "contextMetadata" element
     */
    public void setContextMetadataArray(int i, noNamespace.ContextMetadata contextMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextMetadata target = null;
            target = (noNamespace.ContextMetadata)get_store().find_element_user(CONTEXTMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contextMetadata);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contextMetadata" element
     */
    public noNamespace.ContextMetadata insertNewContextMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextMetadata target = null;
            target = (noNamespace.ContextMetadata)get_store().insert_element_user(CONTEXTMETADATA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contextMetadata" element
     */
    public noNamespace.ContextMetadata addNewContextMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextMetadata target = null;
            target = (noNamespace.ContextMetadata)get_store().add_element_user(CONTEXTMETADATA$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "contextMetadata" element
     */
    public void removeContextMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXTMETADATA$0, i);
        }
    }
}
