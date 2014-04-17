/*
 * An XML document type.
 * Localname: restriction
 * Namespace: 
 * Java type: noNamespace.RestrictionDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one restriction(@) element.
 *
 * This is a complex type.
 */
public class RestrictionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RestrictionDocument
{
    private static final long serialVersionUID = 1L;
    
    public RestrictionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESTRICTION$0 = 
        new javax.xml.namespace.QName("", "restriction");
    
    
    /**
     * Gets the "restriction" element
     */
    public noNamespace.Restriction getRestriction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.Restriction target = null;
            target = (noNamespace.Restriction)get_store().find_element_user(RESTRICTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "restriction" element
     */
    public void setRestriction(noNamespace.Restriction restriction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.Restriction target = null;
            target = (noNamespace.Restriction)get_store().find_element_user(RESTRICTION$0, 0);
            if (target == null)
            {
                target = (noNamespace.Restriction)get_store().add_element_user(RESTRICTION$0);
            }
            target.set(restriction);
        }
    }
    
    /**
     * Appends and returns a new empty "restriction" element
     */
    public noNamespace.Restriction addNewRestriction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.Restriction target = null;
            target = (noNamespace.Restriction)get_store().add_element_user(RESTRICTION$0);
            return target;
        }
    }
}
