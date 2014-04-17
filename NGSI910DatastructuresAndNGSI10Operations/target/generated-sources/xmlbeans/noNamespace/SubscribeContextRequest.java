/*
 * XML Type:  SubscribeContextRequest
 * Namespace: 
 * Java type: noNamespace.SubscribeContextRequest
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * An XML SubscribeContextRequest(@).
 *
 * This is a complex type.
 */
public interface SubscribeContextRequest extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubscribeContextRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF733C3476363FC28D1181AAD31C7BCE8").resolveHandle("subscribecontextrequest2921type");
    
    /**
     * Gets the "entityIdList" element
     */
    noNamespace.EntityIdList getEntityIdList();
    
    /**
     * Sets the "entityIdList" element
     */
    void setEntityIdList(noNamespace.EntityIdList entityIdList);
    
    /**
     * Appends and returns a new empty "entityIdList" element
     */
    noNamespace.EntityIdList addNewEntityIdList();
    
    /**
     * Gets the "attributeList" element
     */
    noNamespace.AttributeList getAttributeList();
    
    /**
     * True if has "attributeList" element
     */
    boolean isSetAttributeList();
    
    /**
     * Sets the "attributeList" element
     */
    void setAttributeList(noNamespace.AttributeList attributeList);
    
    /**
     * Appends and returns a new empty "attributeList" element
     */
    noNamespace.AttributeList addNewAttributeList();
    
    /**
     * Unsets the "attributeList" element
     */
    void unsetAttributeList();
    
    /**
     * Gets the "reference" element
     */
    org.apache.xmlbeans.XmlObject getReference();
    
    /**
     * Sets the "reference" element
     */
    void setReference(org.apache.xmlbeans.XmlObject reference);
    
    /**
     * Appends and returns a new empty "reference" element
     */
    org.apache.xmlbeans.XmlObject addNewReference();
    
    /**
     * Gets the "duration" element
     */
    org.apache.xmlbeans.GDuration getDuration();
    
    /**
     * Gets (as xml) the "duration" element
     */
    org.apache.xmlbeans.XmlDuration xgetDuration();
    
    /**
     * True if has "duration" element
     */
    boolean isSetDuration();
    
    /**
     * Sets the "duration" element
     */
    void setDuration(org.apache.xmlbeans.GDuration duration);
    
    /**
     * Sets (as xml) the "duration" element
     */
    void xsetDuration(org.apache.xmlbeans.XmlDuration duration);
    
    /**
     * Unsets the "duration" element
     */
    void unsetDuration();
    
    /**
     * Gets the "restriction" element
     */
    noNamespace.Restriction getRestriction();
    
    /**
     * True if has "restriction" element
     */
    boolean isSetRestriction();
    
    /**
     * Sets the "restriction" element
     */
    void setRestriction(noNamespace.Restriction restriction);
    
    /**
     * Appends and returns a new empty "restriction" element
     */
    noNamespace.Restriction addNewRestriction();
    
    /**
     * Unsets the "restriction" element
     */
    void unsetRestriction();
    
    /**
     * Gets the "notifyConditions" element
     */
    noNamespace.NotifyConditionList getNotifyConditions();
    
    /**
     * True if has "notifyConditions" element
     */
    boolean isSetNotifyConditions();
    
    /**
     * Sets the "notifyConditions" element
     */
    void setNotifyConditions(noNamespace.NotifyConditionList notifyConditions);
    
    /**
     * Appends and returns a new empty "notifyConditions" element
     */
    noNamespace.NotifyConditionList addNewNotifyConditions();
    
    /**
     * Unsets the "notifyConditions" element
     */
    void unsetNotifyConditions();
    
    /**
     * Gets the "throttling" element
     */
    org.apache.xmlbeans.GDuration getThrottling();
    
    /**
     * Gets (as xml) the "throttling" element
     */
    org.apache.xmlbeans.XmlDuration xgetThrottling();
    
    /**
     * True if has "throttling" element
     */
    boolean isSetThrottling();
    
    /**
     * Sets the "throttling" element
     */
    void setThrottling(org.apache.xmlbeans.GDuration throttling);
    
    /**
     * Sets (as xml) the "throttling" element
     */
    void xsetThrottling(org.apache.xmlbeans.XmlDuration throttling);
    
    /**
     * Unsets the "throttling" element
     */
    void unsetThrottling();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.SubscribeContextRequest newInstance() {
          return (noNamespace.SubscribeContextRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.SubscribeContextRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.SubscribeContextRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.SubscribeContextRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.SubscribeContextRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.SubscribeContextRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.SubscribeContextRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.SubscribeContextRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.SubscribeContextRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.SubscribeContextRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.SubscribeContextRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.SubscribeContextRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.SubscribeContextRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.SubscribeContextRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.SubscribeContextRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.SubscribeContextRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.SubscribeContextRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.SubscribeContextRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.SubscribeContextRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.SubscribeContextRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.SubscribeContextRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.SubscribeContextRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.SubscribeContextRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.SubscribeContextRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.SubscribeContextRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.SubscribeContextRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.SubscribeContextRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.SubscribeContextRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.SubscribeContextRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.SubscribeContextRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.SubscribeContextRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.SubscribeContextRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.SubscribeContextRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.SubscribeContextRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.SubscribeContextRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
