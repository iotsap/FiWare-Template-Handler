/*
 * XML Type:  SubscribeContextResponse
 * Namespace: 
 * Java type: noNamespace.SubscribeContextResponse
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML SubscribeContextResponse(@).
 *
 * This is a complex type.
 */
public class SubscribeContextResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.SubscribeContextResponse
{
    private static final long serialVersionUID = 1L;
    
    public SubscribeContextResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIBERESPONSE$0 = 
        new javax.xml.namespace.QName("", "subscribeResponse");
    private static final javax.xml.namespace.QName SUBSCRIBEERROR$2 = 
        new javax.xml.namespace.QName("", "subscribeError");
    
    
    /**
     * Gets the "subscribeResponse" element
     */
    public noNamespace.SubscribeResponse getSubscribeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SubscribeResponse target = null;
            target = (noNamespace.SubscribeResponse)get_store().find_element_user(SUBSCRIBERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "subscribeResponse" element
     */
    public boolean isSetSubscribeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIBERESPONSE$0) != 0;
        }
    }
    
    /**
     * Sets the "subscribeResponse" element
     */
    public void setSubscribeResponse(noNamespace.SubscribeResponse subscribeResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SubscribeResponse target = null;
            target = (noNamespace.SubscribeResponse)get_store().find_element_user(SUBSCRIBERESPONSE$0, 0);
            if (target == null)
            {
                target = (noNamespace.SubscribeResponse)get_store().add_element_user(SUBSCRIBERESPONSE$0);
            }
            target.set(subscribeResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "subscribeResponse" element
     */
    public noNamespace.SubscribeResponse addNewSubscribeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SubscribeResponse target = null;
            target = (noNamespace.SubscribeResponse)get_store().add_element_user(SUBSCRIBERESPONSE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "subscribeResponse" element
     */
    public void unsetSubscribeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIBERESPONSE$0, 0);
        }
    }
    
    /**
     * Gets the "subscribeError" element
     */
    public noNamespace.SubscribeError getSubscribeError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SubscribeError target = null;
            target = (noNamespace.SubscribeError)get_store().find_element_user(SUBSCRIBEERROR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "subscribeError" element
     */
    public boolean isSetSubscribeError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIBEERROR$2) != 0;
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
            target = (noNamespace.SubscribeError)get_store().find_element_user(SUBSCRIBEERROR$2, 0);
            if (target == null)
            {
                target = (noNamespace.SubscribeError)get_store().add_element_user(SUBSCRIBEERROR$2);
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
            target = (noNamespace.SubscribeError)get_store().add_element_user(SUBSCRIBEERROR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "subscribeError" element
     */
    public void unsetSubscribeError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIBEERROR$2, 0);
        }
    }
}
