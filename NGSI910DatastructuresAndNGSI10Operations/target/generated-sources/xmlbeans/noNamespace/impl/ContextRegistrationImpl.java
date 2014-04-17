/*
 * XML Type:  ContextRegistration
 * Namespace: 
 * Java type: noNamespace.ContextRegistration
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML ContextRegistration(@).
 *
 * This is a complex type.
 */
public class ContextRegistrationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ContextRegistration
{
    private static final long serialVersionUID = 1L;
    
    public ContextRegistrationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYIDLIST$0 = 
        new javax.xml.namespace.QName("", "entityIdList");
    private static final javax.xml.namespace.QName CONTEXTREGISTRATIONATTRIBUTELIST$2 = 
        new javax.xml.namespace.QName("", "contextRegistrationAttributeList");
    private static final javax.xml.namespace.QName REGISTRATIONMETADATA$4 = 
        new javax.xml.namespace.QName("", "registrationMetaData");
    private static final javax.xml.namespace.QName PROVIDINGAPPLICATION$6 = 
        new javax.xml.namespace.QName("", "providingApplication");
    
    
    /**
     * Gets the "entityIdList" element
     */
    public noNamespace.EntityIdList getEntityIdList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.EntityIdList target = null;
            target = (noNamespace.EntityIdList)get_store().find_element_user(ENTITYIDLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "entityIdList" element
     */
    public boolean isSetEntityIdList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYIDLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "entityIdList" element
     */
    public void setEntityIdList(noNamespace.EntityIdList entityIdList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.EntityIdList target = null;
            target = (noNamespace.EntityIdList)get_store().find_element_user(ENTITYIDLIST$0, 0);
            if (target == null)
            {
                target = (noNamespace.EntityIdList)get_store().add_element_user(ENTITYIDLIST$0);
            }
            target.set(entityIdList);
        }
    }
    
    /**
     * Appends and returns a new empty "entityIdList" element
     */
    public noNamespace.EntityIdList addNewEntityIdList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.EntityIdList target = null;
            target = (noNamespace.EntityIdList)get_store().add_element_user(ENTITYIDLIST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "entityIdList" element
     */
    public void unsetEntityIdList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYIDLIST$0, 0);
        }
    }
    
    /**
     * Gets the "contextRegistrationAttributeList" element
     */
    public noNamespace.ContextRegistrationAttributeList getContextRegistrationAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationAttributeList target = null;
            target = (noNamespace.ContextRegistrationAttributeList)get_store().find_element_user(CONTEXTREGISTRATIONATTRIBUTELIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "contextRegistrationAttributeList" element
     */
    public boolean isSetContextRegistrationAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXTREGISTRATIONATTRIBUTELIST$2) != 0;
        }
    }
    
    /**
     * Sets the "contextRegistrationAttributeList" element
     */
    public void setContextRegistrationAttributeList(noNamespace.ContextRegistrationAttributeList contextRegistrationAttributeList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationAttributeList target = null;
            target = (noNamespace.ContextRegistrationAttributeList)get_store().find_element_user(CONTEXTREGISTRATIONATTRIBUTELIST$2, 0);
            if (target == null)
            {
                target = (noNamespace.ContextRegistrationAttributeList)get_store().add_element_user(CONTEXTREGISTRATIONATTRIBUTELIST$2);
            }
            target.set(contextRegistrationAttributeList);
        }
    }
    
    /**
     * Appends and returns a new empty "contextRegistrationAttributeList" element
     */
    public noNamespace.ContextRegistrationAttributeList addNewContextRegistrationAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationAttributeList target = null;
            target = (noNamespace.ContextRegistrationAttributeList)get_store().add_element_user(CONTEXTREGISTRATIONATTRIBUTELIST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "contextRegistrationAttributeList" element
     */
    public void unsetContextRegistrationAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXTREGISTRATIONATTRIBUTELIST$2, 0);
        }
    }
    
    /**
     * Gets the "registrationMetaData" element
     */
    public noNamespace.RegistrationMetaData getRegistrationMetaData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RegistrationMetaData target = null;
            target = (noNamespace.RegistrationMetaData)get_store().find_element_user(REGISTRATIONMETADATA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "registrationMetaData" element
     */
    public boolean isSetRegistrationMetaData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGISTRATIONMETADATA$4) != 0;
        }
    }
    
    /**
     * Sets the "registrationMetaData" element
     */
    public void setRegistrationMetaData(noNamespace.RegistrationMetaData registrationMetaData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RegistrationMetaData target = null;
            target = (noNamespace.RegistrationMetaData)get_store().find_element_user(REGISTRATIONMETADATA$4, 0);
            if (target == null)
            {
                target = (noNamespace.RegistrationMetaData)get_store().add_element_user(REGISTRATIONMETADATA$4);
            }
            target.set(registrationMetaData);
        }
    }
    
    /**
     * Appends and returns a new empty "registrationMetaData" element
     */
    public noNamespace.RegistrationMetaData addNewRegistrationMetaData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RegistrationMetaData target = null;
            target = (noNamespace.RegistrationMetaData)get_store().add_element_user(REGISTRATIONMETADATA$4);
            return target;
        }
    }
    
    /**
     * Unsets the "registrationMetaData" element
     */
    public void unsetRegistrationMetaData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGISTRATIONMETADATA$4, 0);
        }
    }
    
    /**
     * Gets the "providingApplication" element
     */
    public java.lang.String getProvidingApplication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDINGAPPLICATION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "providingApplication" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetProvidingApplication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROVIDINGAPPLICATION$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "providingApplication" element
     */
    public void setProvidingApplication(java.lang.String providingApplication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDINGAPPLICATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROVIDINGAPPLICATION$6);
            }
            target.setStringValue(providingApplication);
        }
    }
    
    /**
     * Sets (as xml) the "providingApplication" element
     */
    public void xsetProvidingApplication(org.apache.xmlbeans.XmlAnyURI providingApplication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROVIDINGAPPLICATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(PROVIDINGAPPLICATION$6);
            }
            target.set(providingApplication);
        }
    }
}
