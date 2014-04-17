/*
 * XML Type:  OperationScope
 * Namespace: 
 * Java type: noNamespace.OperationScope
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML OperationScope(@).
 *
 * This is a complex type.
 */
public class OperationScopeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.OperationScope
{
    private static final long serialVersionUID = 1L;
    
    public OperationScopeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCOPETYPE$0 = 
        new javax.xml.namespace.QName("", "scopeType");
    private static final javax.xml.namespace.QName SCOPEVALUE$2 = 
        new javax.xml.namespace.QName("", "scopeValue");
    
    
    /**
     * Gets the "scopeType" element
     */
    public java.lang.String getScopeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPETYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "scopeType" element
     */
    public org.apache.xmlbeans.XmlString xgetScopeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPETYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "scopeType" element
     */
    public void setScopeType(java.lang.String scopeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPETYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCOPETYPE$0);
            }
            target.setStringValue(scopeType);
        }
    }
    
    /**
     * Sets (as xml) the "scopeType" element
     */
    public void xsetScopeType(org.apache.xmlbeans.XmlString scopeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPETYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCOPETYPE$0);
            }
            target.set(scopeType);
        }
    }
    
    /**
     * Gets the "scopeValue" element
     */
    public org.apache.xmlbeans.XmlObject getScopeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(SCOPEVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "scopeValue" element
     */
    public void setScopeValue(org.apache.xmlbeans.XmlObject scopeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(SCOPEVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(SCOPEVALUE$2);
            }
            target.set(scopeValue);
        }
    }
    
    /**
     * Appends and returns a new empty "scopeValue" element
     */
    public org.apache.xmlbeans.XmlObject addNewScopeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(SCOPEVALUE$2);
            return target;
        }
    }
}
