/*
 * XML Type:  UpdateContextRequest
 * Namespace: 
 * Java type: noNamespace.UpdateContextRequest
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML UpdateContextRequest(@).
 *
 * This is a complex type.
 */
public class UpdateContextRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.UpdateContextRequest
{
    private static final long serialVersionUID = 1L;
    
    public UpdateContextRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXTELEMENTLIST$0 = 
        new javax.xml.namespace.QName("", "contextElementList");
    private static final javax.xml.namespace.QName UPDATEACTION$2 = 
        new javax.xml.namespace.QName("", "updateAction");
    
    
    /**
     * Gets the "contextElementList" element
     */
    public noNamespace.ContextElementList getContextElementList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElementList target = null;
            target = (noNamespace.ContextElementList)get_store().find_element_user(CONTEXTELEMENTLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contextElementList" element
     */
    public void setContextElementList(noNamespace.ContextElementList contextElementList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElementList target = null;
            target = (noNamespace.ContextElementList)get_store().find_element_user(CONTEXTELEMENTLIST$0, 0);
            if (target == null)
            {
                target = (noNamespace.ContextElementList)get_store().add_element_user(CONTEXTELEMENTLIST$0);
            }
            target.set(contextElementList);
        }
    }
    
    /**
     * Appends and returns a new empty "contextElementList" element
     */
    public noNamespace.ContextElementList addNewContextElementList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextElementList target = null;
            target = (noNamespace.ContextElementList)get_store().add_element_user(CONTEXTELEMENTLIST$0);
            return target;
        }
    }
    
    /**
     * Gets the "updateAction" element
     */
    public noNamespace.UpdateActionType.Enum getUpdateAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATEACTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return (noNamespace.UpdateActionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "updateAction" element
     */
    public noNamespace.UpdateActionType xgetUpdateAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateActionType target = null;
            target = (noNamespace.UpdateActionType)get_store().find_element_user(UPDATEACTION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "updateAction" element
     */
    public void setUpdateAction(noNamespace.UpdateActionType.Enum updateAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATEACTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDATEACTION$2);
            }
            target.setEnumValue(updateAction);
        }
    }
    
    /**
     * Sets (as xml) the "updateAction" element
     */
    public void xsetUpdateAction(noNamespace.UpdateActionType updateAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UpdateActionType target = null;
            target = (noNamespace.UpdateActionType)get_store().find_element_user(UPDATEACTION$2, 0);
            if (target == null)
            {
                target = (noNamespace.UpdateActionType)get_store().add_element_user(UPDATEACTION$2);
            }
            target.set(updateAction);
        }
    }
}
