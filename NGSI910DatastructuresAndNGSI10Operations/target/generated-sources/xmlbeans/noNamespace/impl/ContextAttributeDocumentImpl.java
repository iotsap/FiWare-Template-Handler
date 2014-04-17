/*
 * An XML document type.
 * Localname: contextAttribute
 * Namespace: 
 * Java type: noNamespace.ContextAttributeDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one contextAttribute(@) element.
 *
 * This is a complex type.
 */
public class ContextAttributeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ContextAttributeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContextAttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXTATTRIBUTE$0 = 
        new javax.xml.namespace.QName("", "contextAttribute");
    
    
    /**
     * Gets the "contextAttribute" element
     */
    public noNamespace.ContextAttribute getContextAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextAttribute target = null;
            target = (noNamespace.ContextAttribute)get_store().find_element_user(CONTEXTATTRIBUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contextAttribute" element
     */
    public void setContextAttribute(noNamespace.ContextAttribute contextAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextAttribute target = null;
            target = (noNamespace.ContextAttribute)get_store().find_element_user(CONTEXTATTRIBUTE$0, 0);
            if (target == null)
            {
                target = (noNamespace.ContextAttribute)get_store().add_element_user(CONTEXTATTRIBUTE$0);
            }
            target.set(contextAttribute);
        }
    }
    
    /**
     * Appends and returns a new empty "contextAttribute" element
     */
    public noNamespace.ContextAttribute addNewContextAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextAttribute target = null;
            target = (noNamespace.ContextAttribute)get_store().add_element_user(CONTEXTATTRIBUTE$0);
            return target;
        }
    }
}
