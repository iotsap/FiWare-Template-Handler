/*
 * XML Type:  UpdateContextElementRequest
 * Namespace: 
 * Java type: noNamespace.UpdateContextElementRequest
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * An XML UpdateContextElementRequest(@).
 *
 * This is a complex type.
 */
public interface UpdateContextElementRequest extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateContextElementRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF733C3476363FC28D1181AAD31C7BCE8").resolveHandle("updatecontextelementrequestfe10type");
    
    /**
     * Gets the "attributeDomainName" element
     */
    java.lang.String getAttributeDomainName();
    
    /**
     * Gets (as xml) the "attributeDomainName" element
     */
    org.apache.xmlbeans.XmlString xgetAttributeDomainName();
    
    /**
     * True if has "attributeDomainName" element
     */
    boolean isSetAttributeDomainName();
    
    /**
     * Sets the "attributeDomainName" element
     */
    void setAttributeDomainName(java.lang.String attributeDomainName);
    
    /**
     * Sets (as xml) the "attributeDomainName" element
     */
    void xsetAttributeDomainName(org.apache.xmlbeans.XmlString attributeDomainName);
    
    /**
     * Unsets the "attributeDomainName" element
     */
    void unsetAttributeDomainName();
    
    /**
     * Gets the "contextAttributeList" element
     */
    noNamespace.ContextAttributeList getContextAttributeList();
    
    /**
     * True if has "contextAttributeList" element
     */
    boolean isSetContextAttributeList();
    
    /**
     * Sets the "contextAttributeList" element
     */
    void setContextAttributeList(noNamespace.ContextAttributeList contextAttributeList);
    
    /**
     * Appends and returns a new empty "contextAttributeList" element
     */
    noNamespace.ContextAttributeList addNewContextAttributeList();
    
    /**
     * Unsets the "contextAttributeList" element
     */
    void unsetContextAttributeList();
    
    /**
     * Gets the "domainMetadata" element
     */
    noNamespace.ContextMetadataList getDomainMetadata();
    
    /**
     * True if has "domainMetadata" element
     */
    boolean isSetDomainMetadata();
    
    /**
     * Sets the "domainMetadata" element
     */
    void setDomainMetadata(noNamespace.ContextMetadataList domainMetadata);
    
    /**
     * Appends and returns a new empty "domainMetadata" element
     */
    noNamespace.ContextMetadataList addNewDomainMetadata();
    
    /**
     * Unsets the "domainMetadata" element
     */
    void unsetDomainMetadata();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.UpdateContextElementRequest newInstance() {
          return (noNamespace.UpdateContextElementRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.UpdateContextElementRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.UpdateContextElementRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.UpdateContextElementRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.UpdateContextElementRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.UpdateContextElementRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.UpdateContextElementRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.UpdateContextElementRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.UpdateContextElementRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.UpdateContextElementRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.UpdateContextElementRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.UpdateContextElementRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.UpdateContextElementRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.UpdateContextElementRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.UpdateContextElementRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.UpdateContextElementRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.UpdateContextElementRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.UpdateContextElementRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.UpdateContextElementRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.UpdateContextElementRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.UpdateContextElementRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.UpdateContextElementRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.UpdateContextElementRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.UpdateContextElementRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.UpdateContextElementRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.UpdateContextElementRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.UpdateContextElementRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.UpdateContextElementRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.UpdateContextElementRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.UpdateContextElementRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.UpdateContextElementRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.UpdateContextElementRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.UpdateContextElementRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.UpdateContextElementRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.UpdateContextElementRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
