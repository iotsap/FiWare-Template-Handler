/*
 * An XML document type.
 * Localname: notifyCondition
 * Namespace: 
 * Java type: noNamespace.NotifyConditionDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one notifyCondition(@) element.
 *
 * This is a complex type.
 */
public class NotifyConditionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.NotifyConditionDocument
{
    private static final long serialVersionUID = 1L;
    
    public NotifyConditionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTIFYCONDITION$0 = 
        new javax.xml.namespace.QName("", "notifyCondition");
    
    
    /**
     * Gets the "notifyCondition" element
     */
    public noNamespace.NotifyCondition getNotifyCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NotifyCondition target = null;
            target = (noNamespace.NotifyCondition)get_store().find_element_user(NOTIFYCONDITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "notifyCondition" element
     */
    public void setNotifyCondition(noNamespace.NotifyCondition notifyCondition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NotifyCondition target = null;
            target = (noNamespace.NotifyCondition)get_store().find_element_user(NOTIFYCONDITION$0, 0);
            if (target == null)
            {
                target = (noNamespace.NotifyCondition)get_store().add_element_user(NOTIFYCONDITION$0);
            }
            target.set(notifyCondition);
        }
    }
    
    /**
     * Appends and returns a new empty "notifyCondition" element
     */
    public noNamespace.NotifyCondition addNewNotifyCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NotifyCondition target = null;
            target = (noNamespace.NotifyCondition)get_store().add_element_user(NOTIFYCONDITION$0);
            return target;
        }
    }
}
