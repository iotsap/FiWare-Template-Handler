/*
 * XML Type:  UpdateContextAttributeRequest
 * Namespace: 
 * Java type: noNamespace.UpdateContextAttributeRequest
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML UpdateContextAttributeRequest(@).
 *
 * This is a complex type.
 */
public class UpdateContextAttributeRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.UpdateContextAttributeRequest
{
    private static final long serialVersionUID = 1L;
    
    public UpdateContextAttributeRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName CONTEXTVALUE$2 = 
        new javax.xml.namespace.QName("", "contextValue");
    private static final javax.xml.namespace.QName METADATA$4 = 
        new javax.xml.namespace.QName("", "metadata");
    
    
    /**
     * Gets the "type" element
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$0);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$0, 0);
        }
    }
    
    /**
     * Gets the "contextValue" element
     */
    public org.apache.xmlbeans.XmlObject getContextValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(CONTEXTVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contextValue" element
     */
    public void setContextValue(org.apache.xmlbeans.XmlObject contextValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(CONTEXTVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(CONTEXTVALUE$2);
            }
            target.set(contextValue);
        }
    }
    
    /**
     * Appends and returns a new empty "contextValue" element
     */
    public org.apache.xmlbeans.XmlObject addNewContextValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(CONTEXTVALUE$2);
            return target;
        }
    }
    
    /**
     * Gets the "metadata" element
     */
    public noNamespace.ContextMetadataList getMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextMetadataList target = null;
            target = (noNamespace.ContextMetadataList)get_store().find_element_user(METADATA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "metadata" element
     */
    public boolean isSetMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATA$4) != 0;
        }
    }
    
    /**
     * Sets the "metadata" element
     */
    public void setMetadata(noNamespace.ContextMetadataList metadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextMetadataList target = null;
            target = (noNamespace.ContextMetadataList)get_store().find_element_user(METADATA$4, 0);
            if (target == null)
            {
                target = (noNamespace.ContextMetadataList)get_store().add_element_user(METADATA$4);
            }
            target.set(metadata);
        }
    }
    
    /**
     * Appends and returns a new empty "metadata" element
     */
    public noNamespace.ContextMetadataList addNewMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextMetadataList target = null;
            target = (noNamespace.ContextMetadataList)get_store().add_element_user(METADATA$4);
            return target;
        }
    }
    
    /**
     * Unsets the "metadata" element
     */
    public void unsetMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATA$4, 0);
        }
    }
}
