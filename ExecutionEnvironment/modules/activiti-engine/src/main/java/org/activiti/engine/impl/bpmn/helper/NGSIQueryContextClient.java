/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//the file has been added by SAP Research, 2014

package org.activiti.engine.impl.bpmn.helper;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Logger;

import noNamespace.ContextAttribute;
import noNamespace.ContextElementResponse;
import noNamespace.ContextElementResponseList;
import noNamespace.EntityId;
import noNamespace.QueryContextRequest;
import noNamespace.QueryContextRequestDocument;
import noNamespace.QueryContextResponse;
import noNamespace.QueryContextResponseDocument;

import org.activiti.engine.ActivitiException;
import org.activiti.engine.impl.context.Context;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.impl.values.XmlAnyTypeImpl;

/**
 * A client to connect to a NSGI server allowing to query attribute values of entities
 */

public class NGSIQueryContextClient {
  
  protected static final Logger LOGGER = Logger.getLogger(NGSIQueryContextClient.class.getName());

  public String getValue(EntityId entityID, String contextAttribute) throws IllegalStateException, IOException, URISyntaxException, XmlException {
    QueryContextRequest requestPayload = buildRequestPayload(entityID, contextAttribute);
    HttpPost httpRequest = buildHttpRequest(requestPayload);
    HttpResponse httpresponse = executeHttpRequest(httpRequest);
    QueryContextResponse response = parseReponseDocFromRequest(httpresponse);
    String value = extractAttributeValue(response);
    return value;
  }

  private HttpResponse executeHttpRequest(HttpPost httpRequest) throws IOException, ClientProtocolException {
    HttpClient httpclient = new DefaultHttpClient();
    HttpResponse httpresponse = httpclient.execute(httpRequest);
    return httpresponse;
  }

  private QueryContextRequest buildRequestPayload(EntityId entityID, String contextAttribute) {
    QueryContextRequestDocument doc = QueryContextRequestDocument.Factory.newInstance();
    QueryContextRequest request = doc.addNewQueryContextRequest();
    request.addNewEntityIdList().addNewEntityId().setId(entityID.getId());
    request.addNewAttributeList().addAttribute(contextAttribute);
    return request;
  }

  private QueryContextResponse parseReponseDocFromRequest(HttpResponse httpresponse) throws IOException, XmlException {
    InputStream input = httpresponse.getEntity().getContent();
    QueryContextResponseDocument responseDoc = QueryContextResponseDocument.Factory.parse(input);
    QueryContextResponse response = responseDoc.getQueryContextResponse();
    if(!response.validate()) 
      throw new ActivitiException("Response from NGSI server is not valid");
    return response;
  }

  private HttpPost buildHttpRequest(QueryContextRequest request) throws URISyntaxException, UnsupportedEncodingException {
    HttpPost post = new HttpPost();
    post.addHeader("Content-Type", "application/xml");
    String baseUri = Context.getProcessEngineConfiguration().getNgsiServerURL();
    String uri = baseUri+"queryContext/";
    post.setURI(new URI(uri));
    StringEntity entity = new StringEntity(request.toString());
    post.setEntity(entity);
    return post;
  }

  private String extractAttributeValue(QueryContextResponse response) {
    ContextElementResponseList contextResponseList = response.getContextResponseList();
    if(contextResponseList.getContextElementResponseArray().length == 0)
      throw new ActivitiException("Requested entity was not found on server");
    ContextElementResponse contextElementResponse = contextResponseList.getContextElementResponseArray(0);
    ContextAttribute[] attributeArray = contextElementResponse.getContextElement().getContextAttributeList().getContextAttributeArray();
    if(attributeArray.length == 0)
      throw new ActivitiException("Requested attribute was not found on server");
    ContextAttribute attribute = attributeArray[0];
    XmlObject contextValue = attribute.getContextValue();
    String theRealValue = ((XmlAnyTypeImpl) contextValue).getStringValue();
    return theRealValue;
  }
}
