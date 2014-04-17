/*
 * XML Type:  ContextRegistrationAttribute
 * Namespace: 
 * Java type: noNamespace.ContextRegistrationAttribute
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML ContextRegistrationAttribute(@).
 *
 * This is a complex type.
 */
public class ContextRegistrationAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ContextRegistrationAttribute
{
    private static final long serialVersionUID = 1L;
    
    public ContextRegistrationAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName ISDOMAIN$4 = 
        new javax.xml.namespace.QName("", "isDomain");
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
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$2, 0);
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
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$2);
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
     * Gets the "isDomain" element
     */
    public boolean getIsDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDOMAIN$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isDomain" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISDOMAIN$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "isDomain" element
     */
    public void setIsDomain(boolean isDomain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDOMAIN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISDOMAIN$4);
            }
            target.setBooleanValue(isDomain);
        }
    }
    
    /**
     * Sets (as xml) the "isDomain" element
     */
    public void xsetIsDomain(org.apache.xmlbeans.XmlBoolean isDomain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISDOMAIN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISDOMAIN$4);
            }
            target.set(isDomain);
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
