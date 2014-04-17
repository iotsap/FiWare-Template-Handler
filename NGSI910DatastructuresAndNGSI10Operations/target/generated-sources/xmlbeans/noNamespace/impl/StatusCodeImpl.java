/*
 * XML Type:  StatusCode
 * Namespace: 
 * Java type: noNamespace.StatusCode
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML StatusCode(@).
 *
 * This is a complex type.
 */
public class StatusCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.StatusCode
{
    private static final long serialVersionUID = 1L;
    
    public StatusCodeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("", "code");
    private static final javax.xml.namespace.QName REASONPHRASE$2 = 
        new javax.xml.namespace.QName("", "reasonPhrase");
    private static final javax.xml.namespace.QName DETAILS$4 = 
        new javax.xml.namespace.QName("", "details");
    
    
    /**
     * Gets the "code" element
     */
    public int getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "code" element
     */
    public org.apache.xmlbeans.XmlInt xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(int code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$0);
            }
            target.setIntValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "code" element
     */
    public void xsetCode(org.apache.xmlbeans.XmlInt code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CODE$0);
            }
            target.set(code);
        }
    }
    
    /**
     * Gets the "reasonPhrase" element
     */
    public java.lang.String getReasonPhrase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASONPHRASE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "reasonPhrase" element
     */
    public org.apache.xmlbeans.XmlString xgetReasonPhrase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASONPHRASE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "reasonPhrase" element
     */
    public void setReasonPhrase(java.lang.String reasonPhrase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASONPHRASE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REASONPHRASE$2);
            }
            target.setStringValue(reasonPhrase);
        }
    }
    
    /**
     * Sets (as xml) the "reasonPhrase" element
     */
    public void xsetReasonPhrase(org.apache.xmlbeans.XmlString reasonPhrase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASONPHRASE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REASONPHRASE$2);
            }
            target.set(reasonPhrase);
        }
    }
    
    /**
     * Gets the "details" element
     */
    public org.apache.xmlbeans.XmlObject getDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DETAILS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "details" element
     */
    public boolean isSetDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETAILS$4) != 0;
        }
    }
    
    /**
     * Sets the "details" element
     */
    public void setDetails(org.apache.xmlbeans.XmlObject details)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DETAILS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DETAILS$4);
            }
            target.set(details);
        }
    }
    
    /**
     * Appends and returns a new empty "details" element
     */
    public org.apache.xmlbeans.XmlObject addNewDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DETAILS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "details" element
     */
    public void unsetDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETAILS$4, 0);
        }
    }
}
