/*
 * XML Type:  NotifyCondition
 * Namespace: 
 * Java type: noNamespace.NotifyCondition
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML NotifyCondition(@).
 *
 * This is a complex type.
 */
public class NotifyConditionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.NotifyCondition
{
    private static final long serialVersionUID = 1L;
    
    public NotifyConditionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName CONDVALUELIST$2 = 
        new javax.xml.namespace.QName("", "condValueList");
    private static final javax.xml.namespace.QName RESTRICTION$4 = 
        new javax.xml.namespace.QName("", "restriction");
    
    
    /**
     * Gets the "type" element
     */
    public noNamespace.NotifyConditionType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (noNamespace.NotifyConditionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public noNamespace.NotifyConditionType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NotifyConditionType target = null;
            target = (noNamespace.NotifyConditionType)get_store().find_element_user(TYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(noNamespace.NotifyConditionType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$0);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(noNamespace.NotifyConditionType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NotifyConditionType target = null;
            target = (noNamespace.NotifyConditionType)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (noNamespace.NotifyConditionType)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "condValueList" element
     */
    public noNamespace.CondValueList getCondValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CondValueList target = null;
            target = (noNamespace.CondValueList)get_store().find_element_user(CONDVALUELIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "condValueList" element
     */
    public boolean isSetCondValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONDVALUELIST$2) != 0;
        }
    }
    
    /**
     * Sets the "condValueList" element
     */
    public void setCondValueList(noNamespace.CondValueList condValueList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CondValueList target = null;
            target = (noNamespace.CondValueList)get_store().find_element_user(CONDVALUELIST$2, 0);
            if (target == null)
            {
                target = (noNamespace.CondValueList)get_store().add_element_user(CONDVALUELIST$2);
            }
            target.set(condValueList);
        }
    }
    
    /**
     * Appends and returns a new empty "condValueList" element
     */
    public noNamespace.CondValueList addNewCondValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CondValueList target = null;
            target = (noNamespace.CondValueList)get_store().add_element_user(CONDVALUELIST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "condValueList" element
     */
    public void unsetCondValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONDVALUELIST$2, 0);
        }
    }
    
    /**
     * Gets the "restriction" element
     */
    public java.lang.String getRestriction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESTRICTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "restriction" element
     */
    public org.apache.xmlbeans.XmlString xgetRestriction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESTRICTION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "restriction" element
     */
    public boolean isSetRestriction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESTRICTION$4) != 0;
        }
    }
    
    /**
     * Sets the "restriction" element
     */
    public void setRestriction(java.lang.String restriction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESTRICTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESTRICTION$4);
            }
            target.setStringValue(restriction);
        }
    }
    
    /**
     * Sets (as xml) the "restriction" element
     */
    public void xsetRestriction(org.apache.xmlbeans.XmlString restriction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESTRICTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESTRICTION$4);
            }
            target.set(restriction);
        }
    }
    
    /**
     * Unsets the "restriction" element
     */
    public void unsetRestriction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESTRICTION$4, 0);
        }
    }
}
