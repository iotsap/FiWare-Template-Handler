/*
 * XML Type:  NotifyContextAvailabilityRequest
 * Namespace: 
 * Java type: noNamespace.NotifyContextAvailabilityRequest
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * An XML NotifyContextAvailabilityRequest(@).
 *
 * This is a complex type.
 */
public interface NotifyContextAvailabilityRequest extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NotifyContextAvailabilityRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s12286FC6F9B192FE0A2CA4F97C96C4A4").resolveHandle("notifycontextavailabilityrequest2b37type");
    
    /**
     * Gets the "subscriptionId" element
     */
    java.lang.String getSubscriptionId();
    
    /**
     * Gets (as xml) the "subscriptionId" element
     */
    org.apache.xmlbeans.XmlString xgetSubscriptionId();
    
    /**
     * Sets the "subscriptionId" element
     */
    void setSubscriptionId(java.lang.String subscriptionId);
    
    /**
     * Sets (as xml) the "subscriptionId" element
     */
    void xsetSubscriptionId(org.apache.xmlbeans.XmlString subscriptionId);
    
    /**
     * Gets the "contextRegistrationResponseList" element
     */
    noNamespace.ContextRegistrationResponseList getContextRegistrationResponseList();
    
    /**
     * True if has "contextRegistrationResponseList" element
     */
    boolean isSetContextRegistrationResponseList();
    
    /**
     * Sets the "contextRegistrationResponseList" element
     */
    void setContextRegistrationResponseList(noNamespace.ContextRegistrationResponseList contextRegistrationResponseList);
    
    /**
     * Appends and returns a new empty "contextRegistrationResponseList" element
     */
    noNamespace.ContextRegistrationResponseList addNewContextRegistrationResponseList();
    
    /**
     * Unsets the "contextRegistrationResponseList" element
     */
    void unsetContextRegistrationResponseList();
    
    /**
     * Gets the "errorCode" element
     */
    noNamespace.StatusCode getErrorCode();
    
    /**
     * True if has "errorCode" element
     */
    boolean isSetErrorCode();
    
    /**
     * Sets the "errorCode" element
     */
    void setErrorCode(noNamespace.StatusCode errorCode);
    
    /**
     * Appends and returns a new empty "errorCode" element
     */
    noNamespace.StatusCode addNewErrorCode();
    
    /**
     * Unsets the "errorCode" element
     */
    void unsetErrorCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.NotifyContextAvailabilityRequest newInstance() {
          return (noNamespace.NotifyContextAvailabilityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.NotifyContextAvailabilityRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.NotifyContextAvailabilityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.NotifyContextAvailabilityRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.NotifyContextAvailabilityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.NotifyContextAvailabilityRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.NotifyContextAvailabilityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.NotifyContextAvailabilityRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NotifyContextAvailabilityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.NotifyContextAvailabilityRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NotifyContextAvailabilityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.NotifyContextAvailabilityRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NotifyContextAvailabilityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.NotifyContextAvailabilityRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NotifyContextAvailabilityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.NotifyContextAvailabilityRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NotifyContextAvailabilityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.NotifyContextAvailabilityRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NotifyContextAvailabilityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.NotifyContextAvailabilityRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NotifyContextAvailabilityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.NotifyContextAvailabilityRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NotifyContextAvailabilityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.NotifyContextAvailabilityRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.NotifyContextAvailabilityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.NotifyContextAvailabilityRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.NotifyContextAvailabilityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.NotifyContextAvailabilityRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.NotifyContextAvailabilityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.NotifyContextAvailabilityRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.NotifyContextAvailabilityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.NotifyContextAvailabilityRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.NotifyContextAvailabilityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.NotifyContextAvailabilityRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.NotifyContextAvailabilityRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
