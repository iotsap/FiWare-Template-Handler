/*
 * An XML document type.
 * Localname: notifyContextAvailabilityRequest
 * Namespace: 
 * Java type: noNamespace.NotifyContextAvailabilityRequestDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one notifyContextAvailabilityRequest(@) element.
 *
 * This is a complex type.
 */
public class NotifyContextAvailabilityRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.NotifyContextAvailabilityRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public NotifyContextAvailabilityRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTIFYCONTEXTAVAILABILITYREQUEST$0 = 
        new javax.xml.namespace.QName("", "notifyContextAvailabilityRequest");
    
    
    /**
     * Gets the "notifyContextAvailabilityRequest" element
     */
    public noNamespace.NotifyContextAvailabilityRequest getNotifyContextAvailabilityRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NotifyContextAvailabilityRequest target = null;
            target = (noNamespace.NotifyContextAvailabilityRequest)get_store().find_element_user(NOTIFYCONTEXTAVAILABILITYREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "notifyContextAvailabilityRequest" element
     */
    public void setNotifyContextAvailabilityRequest(noNamespace.NotifyContextAvailabilityRequest notifyContextAvailabilityRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NotifyContextAvailabilityRequest target = null;
            target = (noNamespace.NotifyContextAvailabilityRequest)get_store().find_element_user(NOTIFYCONTEXTAVAILABILITYREQUEST$0, 0);
            if (target == null)
            {
                target = (noNamespace.NotifyContextAvailabilityRequest)get_store().add_element_user(NOTIFYCONTEXTAVAILABILITYREQUEST$0);
            }
            target.set(notifyContextAvailabilityRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "notifyContextAvailabilityRequest" element
     */
    public noNamespace.NotifyContextAvailabilityRequest addNewNotifyContextAvailabilityRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NotifyContextAvailabilityRequest target = null;
            target = (noNamespace.NotifyContextAvailabilityRequest)get_store().add_element_user(NOTIFYCONTEXTAVAILABILITYREQUEST$0);
            return target;
        }
    }
}
