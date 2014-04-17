/*
 * XML Type:  ContextElement
 * Namespace: 
 * Java type: noNamespace.ContextElement
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML ContextElement(@).
 *
 * This is a complex type.
 */
public class ContextElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ContextElement
{
    private static final long serialVersionUID = 1L;
    
    public ContextElementImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("", "entityId");
    private static final javax.xml.namespace.QName ATTRIBUTEDOMAINNAME$2 = 
        new javax.xml.namespace.QName("", "attributeDomainName");
    private static final javax.xml.namespace.QName CONTEXTATTRIBUTELIST$4 = 
        new javax.xml.namespace.QName("", "contextAttributeList");
    private static final javax.xml.namespace.QName DOMAINMETADATA$6 = 
        new javax.xml.namespace.QName("", "domainMetadata");
    
    
    /**
     * Gets the "entityId" element
     */
    public noNamespace.EntityId getEntityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.EntityId target = null;
            target = (noNamespace.EntityId)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entityId" element
     */
    public void setEntityId(noNamespace.EntityId entityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.EntityId target = null;
            target = (noNamespace.EntityId)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                target = (noNamespace.EntityId)get_store().add_element_user(ENTITYID$0);
            }
            target.set(entityId);
        }
    }
    
    /**
     * Appends and returns a new empty "entityId" element
     */
    public noNamespace.EntityId addNewEntityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.EntityId target = null;
            target = (noNamespace.EntityId)get_store().add_element_user(ENTITYID$0);
            return target;
        }
    }
    
    /**
     * Gets the "attributeDomainName" element
     */
    public java.lang.String getAttributeDomainName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEDOMAINNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "attributeDomainName" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributeDomainName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEDOMAINNAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "attributeDomainName" element
     */
    public boolean isSetAttributeDomainName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTEDOMAINNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "attributeDomainName" element
     */
    public void setAttributeDomainName(java.lang.String attributeDomainName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEDOMAINNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTEDOMAINNAME$2);
            }
            target.setStringValue(attributeDomainName);
        }
    }
    
    /**
     * Sets (as xml) the "attributeDomainName" element
     */
    public void xsetAttributeDomainName(org.apache.xmlbeans.XmlString attributeDomainName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEDOMAINNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTEDOMAINNAME$2);
            }
            target.set(attributeDomainName);
        }
    }
    
    /**
     * Unsets the "attributeDomainName" element
     */
    public void unsetAttributeDomainName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTEDOMAINNAME$2, 0);
        }
    }
    
    /**
     * Gets the "contextAttributeList" element
     */
    public noNamespace.ContextAttributeList getContextAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextAttributeList target = null;
            target = (noNamespace.ContextAttributeList)get_store().find_element_user(CONTEXTATTRIBUTELIST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "contextAttributeList" element
     */
    public boolean isSetContextAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXTATTRIBUTELIST$4) != 0;
        }
    }
    
    /**
     * Sets the "contextAttributeList" element
     */
    public void setContextAttributeList(noNamespace.ContextAttributeList contextAttributeList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextAttributeList target = null;
            target = (noNamespace.ContextAttributeList)get_store().find_element_user(CONTEXTATTRIBUTELIST$4, 0);
            if (target == null)
            {
                target = (noNamespace.ContextAttributeList)get_store().add_element_user(CONTEXTATTRIBUTELIST$4);
            }
            target.set(contextAttributeList);
        }
    }
    
    /**
     * Appends and returns a new empty "contextAttributeList" element
     */
    public noNamespace.ContextAttributeList addNewContextAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextAttributeList target = null;
            target = (noNamespace.ContextAttributeList)get_store().add_element_user(CONTEXTATTRIBUTELIST$4);
            return target;
        }
    }
    
    /**
     * Unsets the "contextAttributeList" element
     */
    public void unsetContextAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXTATTRIBUTELIST$4, 0);
        }
    }
    
    /**
     * Gets the "domainMetadata" element
     */
    public noNamespace.ContextMetadataList getDomainMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextMetadataList target = null;
            target = (noNamespace.ContextMetadataList)get_store().find_element_user(DOMAINMETADATA$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "domainMetadata" element
     */
    public boolean isSetDomainMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOMAINMETADATA$6) != 0;
        }
    }
    
    /**
     * Sets the "domainMetadata" element
     */
    public void setDomainMetadata(noNamespace.ContextMetadataList domainMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextMetadataList target = null;
            target = (noNamespace.ContextMetadataList)get_store().find_element_user(DOMAINMETADATA$6, 0);
            if (target == null)
            {
                target = (noNamespace.ContextMetadataList)get_store().add_element_user(DOMAINMETADATA$6);
            }
            target.set(domainMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "domainMetadata" element
     */
    public noNamespace.ContextMetadataList addNewDomainMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextMetadataList target = null;
            target = (noNamespace.ContextMetadataList)get_store().add_element_user(DOMAINMETADATA$6);
            return target;
        }
    }
    
    /**
     * Unsets the "domainMetadata" element
     */
    public void unsetDomainMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOMAINMETADATA$6, 0);
        }
    }
}
