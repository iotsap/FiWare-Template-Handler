/*
 * XML Type:  NotifyConditionList
 * Namespace: 
 * Java type: noNamespace.NotifyConditionList
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML NotifyConditionList(@).
 *
 * This is a complex type.
 */
public class NotifyConditionListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.NotifyConditionList
{
    private static final long serialVersionUID = 1L;
    
    public NotifyConditionListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTIFYCONDITION$0 = 
        new javax.xml.namespace.QName("", "notifyCondition");
    
    
    /**
     * Gets array of all "notifyCondition" elements
     */
    public noNamespace.NotifyCondition[] getNotifyConditionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NOTIFYCONDITION$0, targetList);
            noNamespace.NotifyCondition[] result = new noNamespace.NotifyCondition[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "notifyCondition" element
     */
    public noNamespace.NotifyCondition getNotifyConditionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NotifyCondition target = null;
            target = (noNamespace.NotifyCondition)get_store().find_element_user(NOTIFYCONDITION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "notifyCondition" element
     */
    public int sizeOfNotifyConditionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTIFYCONDITION$0);
        }
    }
    
    /**
     * Sets array of all "notifyCondition" element
     */
    public void setNotifyConditionArray(noNamespace.NotifyCondition[] notifyConditionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(notifyConditionArray, NOTIFYCONDITION$0);
        }
    }
    
    /**
     * Sets ith "notifyCondition" element
     */
    public void setNotifyConditionArray(int i, noNamespace.NotifyCondition notifyCondition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NotifyCondition target = null;
            target = (noNamespace.NotifyCondition)get_store().find_element_user(NOTIFYCONDITION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(notifyCondition);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "notifyCondition" element
     */
    public noNamespace.NotifyCondition insertNewNotifyCondition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NotifyCondition target = null;
            target = (noNamespace.NotifyCondition)get_store().insert_element_user(NOTIFYCONDITION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "notifyCondition" element
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
    
    /**
     * Removes the ith "notifyCondition" element
     */
    public void removeNotifyCondition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTIFYCONDITION$0, i);
        }
    }
}
