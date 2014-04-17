/*
 * An XML document type.
 * Localname: contextRegistrationAttribute
 * Namespace: 
 * Java type: noNamespace.ContextRegistrationAttributeDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one contextRegistrationAttribute(@) element.
 *
 * This is a complex type.
 */
public class ContextRegistrationAttributeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ContextRegistrationAttributeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContextRegistrationAttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXTREGISTRATIONATTRIBUTE$0 = 
        new javax.xml.namespace.QName("", "contextRegistrationAttribute");
    
    
    /**
     * Gets the "contextRegistrationAttribute" element
     */
    public noNamespace.ContextRegistrationAttribute getContextRegistrationAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationAttribute target = null;
            target = (noNamespace.ContextRegistrationAttribute)get_store().find_element_user(CONTEXTREGISTRATIONATTRIBUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contextRegistrationAttribute" element
     */
    public void setContextRegistrationAttribute(noNamespace.ContextRegistrationAttribute contextRegistrationAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationAttribute target = null;
            target = (noNamespace.ContextRegistrationAttribute)get_store().find_element_user(CONTEXTREGISTRATIONATTRIBUTE$0, 0);
            if (target == null)
            {
                target = (noNamespace.ContextRegistrationAttribute)get_store().add_element_user(CONTEXTREGISTRATIONATTRIBUTE$0);
            }
            target.set(contextRegistrationAttribute);
        }
    }
    
    /**
     * Appends and returns a new empty "contextRegistrationAttribute" element
     */
    public noNamespace.ContextRegistrationAttribute addNewContextRegistrationAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextRegistrationAttribute target = null;
            target = (noNamespace.ContextRegistrationAttribute)get_store().add_element_user(CONTEXTREGISTRATIONATTRIBUTE$0);
            return target;
        }
    }
}
