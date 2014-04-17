/*
 * An XML document type.
 * Localname: notifyConditionType
 * Namespace: 
 * Java type: noNamespace.NotifyConditionTypeDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one notifyConditionType(@) element.
 *
 * This is a complex type.
 */
public class NotifyConditionTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.NotifyConditionTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public NotifyConditionTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTIFYCONDITIONTYPE$0 = 
        new javax.xml.namespace.QName("", "notifyConditionType");
    
    
    /**
     * Gets the "notifyConditionType" element
     */
    public noNamespace.NotifyConditionType.Enum getNotifyConditionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTIFYCONDITIONTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (noNamespace.NotifyConditionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "notifyConditionType" element
     */
    public noNamespace.NotifyConditionType xgetNotifyConditionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NotifyConditionType target = null;
            target = (noNamespace.NotifyConditionType)get_store().find_element_user(NOTIFYCONDITIONTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "notifyConditionType" element
     */
    public void setNotifyConditionType(noNamespace.NotifyConditionType.Enum notifyConditionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTIFYCONDITIONTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTIFYCONDITIONTYPE$0);
            }
            target.setEnumValue(notifyConditionType);
        }
    }
    
    /**
     * Sets (as xml) the "notifyConditionType" element
     */
    public void xsetNotifyConditionType(noNamespace.NotifyConditionType notifyConditionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NotifyConditionType target = null;
            target = (noNamespace.NotifyConditionType)get_store().find_element_user(NOTIFYCONDITIONTYPE$0, 0);
            if (target == null)
            {
                target = (noNamespace.NotifyConditionType)get_store().add_element_user(NOTIFYCONDITIONTYPE$0);
            }
            target.set(notifyConditionType);
        }
    }
}
