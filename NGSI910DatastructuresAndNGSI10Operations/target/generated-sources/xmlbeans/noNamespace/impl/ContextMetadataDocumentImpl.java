/*
 * An XML document type.
 * Localname: contextMetadata
 * Namespace: 
 * Java type: noNamespace.ContextMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one contextMetadata(@) element.
 *
 * This is a complex type.
 */
public class ContextMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ContextMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContextMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXTMETADATA$0 = 
        new javax.xml.namespace.QName("", "contextMetadata");
    
    
    /**
     * Gets the "contextMetadata" element
     */
    public noNamespace.ContextMetadata getContextMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextMetadata target = null;
            target = (noNamespace.ContextMetadata)get_store().find_element_user(CONTEXTMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contextMetadata" element
     */
    public void setContextMetadata(noNamespace.ContextMetadata contextMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextMetadata target = null;
            target = (noNamespace.ContextMetadata)get_store().find_element_user(CONTEXTMETADATA$0, 0);
            if (target == null)
            {
                target = (noNamespace.ContextMetadata)get_store().add_element_user(CONTEXTMETADATA$0);
            }
            target.set(contextMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "contextMetadata" element
     */
    public noNamespace.ContextMetadata addNewContextMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ContextMetadata target = null;
            target = (noNamespace.ContextMetadata)get_store().add_element_user(CONTEXTMETADATA$0);
            return target;
        }
    }
}
