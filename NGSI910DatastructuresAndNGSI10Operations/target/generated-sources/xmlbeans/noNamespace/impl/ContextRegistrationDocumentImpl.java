/*
 * An XML document type.
 * Localname: contextRegistration
 * Namespace: 
 * Java type: noNamespace.ContextRegistrationDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one contextRegistration(@) element.
 *
 * This is a complex type.
 */
public class ContextRegistrationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ContextRegistrationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContextRegistrationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXTREGISTRATION$0 = 
        new javax.xml.namespace.QName("", "contextRegistration");
    
    
    /**
     * Gets the "contextRegistration" element
     */
    public noNamespace.ContextRegistration getContextRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistration target = null;
            target = (noNamespace.ContextRegistration)get_store().find_element_user(CONTEXTREGISTRATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contextRegistration" element
     */
    public void setContextRegistration(noNamespace.ContextRegistration contextRegistration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistration target = null;
            target = (noNamespace.ContextRegistration)get_store().find_element_user(CONTEXTREGISTRATION$0, 0);
            if (target == null)
            {
                target = (noNamespace.ContextRegistration)get_store().add_element_user(CONTEXTREGISTRATION$0);
            }
            target.set(contextRegistration);
        }
    }
    
    /**
     * Appends and returns a new empty "contextRegistration" element
     */
    public noNamespace.ContextRegistration addNewContextRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistration target = null;
            target = (noNamespace.ContextRegistration)get_store().add_element_user(CONTEXTREGISTRATION$0);
            return target;
        }
    }
}
