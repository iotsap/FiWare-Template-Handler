/*
 * An XML document type.
 * Localname: contextElement
 * Namespace: 
 * Java type: noNamespace.ContextElementDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one contextElement(@) element.
 *
 * This is a complex type.
 */
public class ContextElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ContextElementDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContextElementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXTELEMENT$0 = 
        new javax.xml.namespace.QName("", "contextElement");
    
    
    /**
     * Gets the "contextElement" element
     */
    public noNamespace.ContextElement getContextElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElement target = null;
            target = (noNamespace.ContextElement)get_store().find_element_user(CONTEXTELEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contextElement" element
     */
    public void setContextElement(noNamespace.ContextElement contextElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElement target = null;
            target = (noNamespace.ContextElement)get_store().find_element_user(CONTEXTELEMENT$0, 0);
            if (target == null)
            {
                target = (noNamespace.ContextElement)get_store().add_element_user(CONTEXTELEMENT$0);
            }
            target.set(contextElement);
        }
    }
    
    /**
     * Appends and returns a new empty "contextElement" element
     */
    public noNamespace.ContextElement addNewContextElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElement target = null;
            target = (noNamespace.ContextElement)get_store().add_element_user(CONTEXTELEMENT$0);
            return target;
        }
    }
}
