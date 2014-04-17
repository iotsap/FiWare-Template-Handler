/*
 * An XML document type.
 * Localname: registrationMetaData
 * Namespace: 
 * Java type: noNamespace.RegistrationMetaDataDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one registrationMetaData(@) element.
 *
 * This is a complex type.
 */
public class RegistrationMetaDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RegistrationMetaDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public RegistrationMetaDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGISTRATIONMETADATA$0 = 
        new javax.xml.namespace.QName("", "registrationMetaData");
    
    
    /**
     * Gets the "registrationMetaData" element
     */
    public noNamespace.RegistrationMetaData getRegistrationMetaData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RegistrationMetaData target = null;
            target = (noNamespace.RegistrationMetaData)get_store().find_element_user(REGISTRATIONMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (noNamespace.RegistrationMetaData)get_store().find_element_user(REGISTRATIONMETADATA$0, 0);
            if (target == null)
            {
                target = (noNamespace.RegistrationMetaData)get_store().add_element_user(REGISTRATIONMETADATA$0);
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
            target = (noNamespace.RegistrationMetaData)get_store().add_element_user(REGISTRATIONMETADATA$0);
            return target;
        }
    }
}
