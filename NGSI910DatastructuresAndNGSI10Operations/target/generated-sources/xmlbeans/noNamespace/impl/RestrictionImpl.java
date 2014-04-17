/*
 * XML Type:  Restriction
 * Namespace: 
 * Java type: noNamespace.Restriction
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML Restriction(@).
 *
 * This is a complex type.
 */
public class RestrictionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.Restriction
{
    private static final long serialVersionUID = 1L;
    
    public RestrictionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEEXPRESSION$0 = 
        new javax.xml.namespace.QName("", "attributeExpression");
    private static final javax.xml.namespace.QName SCOPE$2 = 
        new javax.xml.namespace.QName("", "scope");
    
    
    /**
     * Gets the "attributeExpression" element
     */
    public java.lang.String getAttributeExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "attributeExpression" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributeExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEEXPRESSION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "attributeExpression" element
     */
    public void setAttributeExpression(java.lang.String attributeExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEEXPRESSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTEEXPRESSION$0);
            }
            target.setStringValue(attributeExpression);
        }
    }
    
    /**
     * Sets (as xml) the "attributeExpression" element
     */
    public void xsetAttributeExpression(org.apache.xmlbeans.XmlString attributeExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEEXPRESSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTEEXPRESSION$0);
            }
            target.set(attributeExpression);
        }
    }
    
    /**
     * Gets the "scope" element
     */
    public noNamespace.OperationScopeList getScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.OperationScopeList target = null;
            target = (noNamespace.OperationScopeList)get_store().find_element_user(SCOPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "scope" element
     */
    public boolean isSetScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCOPE$2) != 0;
        }
    }
    
    /**
     * Sets the "scope" element
     */
    public void setScope(noNamespace.OperationScopeList scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.OperationScopeList target = null;
            target = (noNamespace.OperationScopeList)get_store().find_element_user(SCOPE$2, 0);
            if (target == null)
            {
                target = (noNamespace.OperationScopeList)get_store().add_element_user(SCOPE$2);
            }
            target.set(scope);
        }
    }
    
    /**
     * Appends and returns a new empty "scope" element
     */
    public noNamespace.OperationScopeList addNewScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.OperationScopeList target = null;
            target = (noNamespace.OperationScopeList)get_store().add_element_user(SCOPE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "scope" element
     */
    public void unsetScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCOPE$2, 0);
        }
    }
}
