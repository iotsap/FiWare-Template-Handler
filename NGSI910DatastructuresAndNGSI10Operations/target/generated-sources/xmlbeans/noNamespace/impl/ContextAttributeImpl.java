/*
 * XML Type:  ContextAttribute
 * Namespace: 
 * Java type: noNamespace.ContextAttribute
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML ContextAttribute(@).
 *
 * This is a complex type.
 */
public class ContextAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ContextAttribute
{
    private static final long serialVersionUID = 1L;
    
    public ContextAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName CONTEXTVALUE$4 = 
        new javax.xml.namespace.QName("", "contextValue");
    private static final javax.xml.namespace.QName METADATA$6 = 
        new javax.xml.namespace.QName("", "metadata");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "type" element
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
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
    public org.apache.xmlbeans.XmlAnyURI xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(TYPE$2, 0);
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
            return get_store().count_elements(TYPE$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$2);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(org.apache.xmlbeans.XmlAnyURI type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(TYPE$2);
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
            get_store().remove_element(TYPE$2, 0);
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
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(CONTEXTVALUE$4, 0);
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
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(CONTEXTVALUE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(CONTEXTVALUE$4);
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
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(CONTEXTVALUE$4);
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
            target = (noNamespace.ContextMetadataList)get_store().find_element_user(METADATA$6, 0);
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
            return get_store().count_elements(METADATA$6) != 0;
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
            target = (noNamespace.ContextMetadataList)get_store().find_element_user(METADATA$6, 0);
            if (target == null)
            {
                target = (noNamespace.ContextMetadataList)get_store().add_element_user(METADATA$6);
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
            target = (noNamespace.ContextMetadataList)get_store().add_element_user(METADATA$6);
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
            get_store().remove_element(METADATA$6, 0);
        }
    }
}
