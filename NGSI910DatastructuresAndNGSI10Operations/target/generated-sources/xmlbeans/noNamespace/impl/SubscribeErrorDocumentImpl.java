/*
 * An XML document type.
 * Localname: subscribeError
 * Namespace: 
 * Java type: noNamespace.SubscribeErrorDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one subscribeError(@) element.
 *
 * This is a complex type.
 */
public class SubscribeErrorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.SubscribeErrorDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubscribeErrorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIBEERROR$0 = 
        new javax.xml.namespace.QName("", "subscribeError");
    
    
    /**
     * Gets the "subscribeError" element
     */
    public noNamespace.SubscribeError getSubscribeError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SubscribeError target = null;
            target = (noNamespace.SubscribeError)get_store().find_element_user(SUBSCRIBEERROR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subscribeError" element
     */
    public void setSubscribeError(noNamespace.SubscribeError subscribeError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SubscribeError target = null;
            target = (noNamespace.SubscribeError)get_store().find_element_user(SUBSCRIBEERROR$0, 0);
            if (target == null)
            {
                target = (noNamespace.SubscribeError)get_store().add_element_user(SUBSCRIBEERROR$0);
            }
            target.set(subscribeError);
        }
    }
    
    /**
     * Appends and returns a new empty "subscribeError" element
     */
    public noNamespace.SubscribeError addNewSubscribeError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SubscribeError target = null;
            target = (noNamespace.SubscribeError)get_store().add_element_user(SUBSCRIBEERROR$0);
            return target;
        }
    }
}
