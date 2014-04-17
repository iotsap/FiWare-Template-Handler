/*
 * An XML document type.
 * Localname: operationScope
 * Namespace: 
 * Java type: noNamespace.OperationScopeDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one operationScope(@) element.
 *
 * This is a complex type.
 */
public class OperationScopeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.OperationScopeDocument
{
    private static final long serialVersionUID = 1L;
    
    public OperationScopeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONSCOPE$0 = 
        new javax.xml.namespace.QName("", "operationScope");
    
    
    /**
     * Gets the "operationScope" element
     */
    public noNamespace.OperationScope getOperationScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.OperationScope target = null;
            target = (noNamespace.OperationScope)get_store().find_element_user(OPERATIONSCOPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "operationScope" element
     */
    public void setOperationScope(noNamespace.OperationScope operationScope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.OperationScope target = null;
            target = (noNamespace.OperationScope)get_store().find_element_user(OPERATIONSCOPE$0, 0);
            if (target == null)
            {
                target = (noNamespace.OperationScope)get_store().add_element_user(OPERATIONSCOPE$0);
            }
            target.set(operationScope);
        }
    }
    
    /**
     * Appends and returns a new empty "operationScope" element
     */
    public noNamespace.OperationScope addNewOperationScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.OperationScope target = null;
            target = (noNamespace.OperationScope)get_store().add_element_user(OPERATIONSCOPE$0);
            return target;
        }
    }
}
