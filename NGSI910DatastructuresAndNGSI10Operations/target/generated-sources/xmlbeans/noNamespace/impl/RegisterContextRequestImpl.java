/*
 * XML Type:  RegisterContextRequest
 * Namespace: 
 * Java type: noNamespace.RegisterContextRequest
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML RegisterContextRequest(@).
 *
 * This is a complex type.
 */
public class RegisterContextRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RegisterContextRequest
{
    private static final long serialVersionUID = 1L;
    
    public RegisterContextRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXTREGISTRATIONLIST$0 = 
        new javax.xml.namespace.QName("", "contextRegistrationList");
    private static final javax.xml.namespace.QName DURATION$2 = 
        new javax.xml.namespace.QName("", "duration");
    private static final javax.xml.namespace.QName REGISTRATIONID$4 = 
        new javax.xml.namespace.QName("", "registrationId");
    
    
    /**
     * Gets the "contextRegistrationList" element
     */
    public noNamespace.ContextRegistrationList getContextRegistrationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationList target = null;
            target = (noNamespace.ContextRegistrationList)get_store().find_element_user(CONTEXTREGISTRATIONLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "contextRegistrationList" element
     */
    public boolean isSetContextRegistrationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXTREGISTRATIONLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "contextRegistrationList" element
     */
    public void setContextRegistrationList(noNamespace.ContextRegistrationList contextRegistrationList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationList target = null;
            target = (noNamespace.ContextRegistrationList)get_store().find_element_user(CONTEXTREGISTRATIONLIST$0, 0);
            if (target == null)
            {
                target = (noNamespace.ContextRegistrationList)get_store().add_element_user(CONTEXTREGISTRATIONLIST$0);
            }
            target.set(contextRegistrationList);
        }
    }
    
    /**
     * Appends and returns a new empty "contextRegistrationList" element
     */
    public noNamespace.ContextRegistrationList addNewContextRegistrationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationList target = null;
            target = (noNamespace.ContextRegistrationList)get_store().add_element_user(CONTEXTREGISTRATIONLIST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "contextRegistrationList" element
     */
    public void unsetContextRegistrationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXTREGISTRATIONLIST$0, 0);
        }
    }
    
    /**
     * Gets the "duration" element
     */
    public org.apache.xmlbeans.GDuration getDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "duration" element
     */
    public org.apache.xmlbeans.XmlDuration xgetDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(DURATION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "duration" element
     */
    public boolean isSetDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DURATION$2) != 0;
        }
    }
    
    /**
     * Sets the "duration" element
     */
    public void setDuration(org.apache.xmlbeans.GDuration duration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DURATION$2);
            }
            target.setGDurationValue(duration);
        }
    }
    
    /**
     * Sets (as xml) the "duration" element
     */
    public void xsetDuration(org.apache.xmlbeans.XmlDuration duration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(DURATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDuration)get_store().add_element_user(DURATION$2);
            }
            target.set(duration);
        }
    }
    
    /**
     * Unsets the "duration" element
     */
    public void unsetDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DURATION$2, 0);
        }
    }
    
    /**
     * Gets the "registrationId" element
     */
    public java.lang.String getRegistrationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTRATIONID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "registrationId" element
     */
    public org.apache.xmlbeans.XmlString xgetRegistrationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGISTRATIONID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "registrationId" element
     */
    public boolean isSetRegistrationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGISTRATIONID$4) != 0;
        }
    }
    
    /**
     * Sets the "registrationId" element
     */
    public void setRegistrationId(java.lang.String registrationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTRATIONID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGISTRATIONID$4);
            }
            target.setStringValue(registrationId);
        }
    }
    
    /**
     * Sets (as xml) the "registrationId" element
     */
    public void xsetRegistrationId(org.apache.xmlbeans.XmlString registrationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGISTRATIONID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REGISTRATIONID$4);
            }
            target.set(registrationId);
        }
    }
    
    /**
     * Unsets the "registrationId" element
     */
    public void unsetRegistrationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGISTRATIONID$4, 0);
        }
    }
}
