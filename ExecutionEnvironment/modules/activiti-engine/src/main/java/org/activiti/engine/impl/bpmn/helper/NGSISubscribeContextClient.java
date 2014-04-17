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

import javax.xml.datatype.Duration;

import noNamespace.AttributeList;
import noNamespace.EntityId;
import noNamespace.EntityIdList;
import noNamespace.NotifyCondition;
import noNamespace.NotifyConditionList;
import noNamespace.SubscribeContextRequest;
import noNamespace.SubscribeContextRequestDocument;
import noNamespace.SubscribeContextResponse;
import noNamespace.SubscribeContextResponseDocument;
import noNamespace.SubscribeError;
import noNamespace.SubscribeResponse;

import org.activiti.engine.ActivitiException;
import org.activiti.engine.impl.bpmn.behavior.NGSIStartEventActivityBehaviour;
import org.activiti.engine.impl.context.Context;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.xmlbeans.GDuration;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlString;

/**
 * An HTTP client to request a context subscription at the NGSI server
 */
public class NGSISubscribeContextClient {
  
  private static final Logger LOG = Logger.getLogger(ErrorPropagation.class.getName());
  
  private NGSIStartEventActivityBehaviour startEventBehaviour;
  private SubscribeContextRequest subscribeContextRequest;
  private SubscribeContextResponse subscribeContextResponse;
  private String subscriptionID;
  private SubscribeContextRequestDocument subscribeContextRequestDocument;
  private HttpPost post;
  private HttpResponse httpresponse;

  public NGSISubscribeContextClient(NGSIStartEventActivityBehaviour startEventBehaviour) {
    this.startEventBehaviour = startEventBehaviour;
  }

  public void subscribe() {
    LOG.info(getInformationString() + "Trying to subscribe.");
    try {
      subscribeWithoutExceptionHandling();
    } catch (Exception e) {
      throw new ActivitiException(getInformationString() + "Subscription failed.", e);
    } 
    LOG.info(getInformationString() + "Successfully subscribed. Subscription ID is " + subscriptionID);
  }
  
  public String getSubscriptionID() {
    return subscriptionID;
  }

  private void subscribeWithoutExceptionHandling() throws UnsupportedEncodingException, URISyntaxException, ClientProtocolException, IOException, XmlException {
    buildNGSIRequest();
    buildHTTPRequest();
    sendHTTPRequest();
    readHTTPResponse();
    readNGSIResponse();
  }

  private void readNGSIResponse() {
    SubscribeError subscribeError = subscribeContextResponse.getSubscribeError();
    SubscribeResponse subscribeResponse = subscribeContextResponse.getSubscribeResponse();
    if(subscribeError != null && subscribeError.getErrorCode() != null && subscribeError.getErrorCode().getCode() != 200) {
      throw new ActivitiException(getInformationString() + "Error from server: " + subscribeError.getErrorCode());
    }
    else {
      subscriptionID = subscribeResponse.getSubscriptionId();  
    }
  }

  private void buildHTTPRequest() throws UnsupportedEncodingException, URISyntaxException {
    post = new HttpPost();
    post.addHeader("Content-Type", "application/xml");
    String baseUri = Context.getProcessEngineConfiguration().getNgsiServerURL();
    String uri = baseUri+"subscribeContext/";
    post.setURI(new URI(uri));
    StringEntity entity = new StringEntity(subscribeContextRequest.toString());
    post.setEntity(entity);
  }

  private void buildNGSIRequest() {
    createDoc();
    createRequestEntityList();
    createRequestDuration();
    createRequestReference();
    createNotifyConditionList();
    createAttributeList();
  }
  
  private void createDoc() {
    subscribeContextRequestDocument = SubscribeContextRequestDocument.Factory.newInstance();
    subscribeContextRequest = subscribeContextRequestDocument.addNewSubscribeContextRequest();
  }

  private void createAttributeList() {
    AttributeList attributeList = startEventBehaviour.getAttributeList();
    subscribeContextRequest.setAttributeList(attributeList);
  }

  private void createRequestReference() {
    String url = Context.getProcessEngineConfiguration().getContextSubscriptionReferenceURL();
    subscribeContextRequest.setReference(XmlString.Factory.newValue(url));
  }

  private void createRequestEntityList() {
    EntityIdList entityIds = subscribeContextRequest.addNewEntityIdList();
    for(EntityId entityId : startEventBehaviour.getPhysicalEntityIDs()) {
      entityIds.addNewEntityId().set(entityId);
    }
  }
  
  private void createNotifyConditionList() {
    //just translating a standard Java list to its weird xlmbeans equivalent
    NotifyConditionList notifyConditions = subscribeContextRequest.addNewNotifyConditions();
    for(NotifyCondition notifyCondition : startEventBehaviour.getNotifyConditions()) {
      notifyConditions.addNewNotifyCondition().set(notifyCondition);
    }
  }
  
  private void createRequestDuration() {
    Duration javaXMLDuration = startEventBehaviour.getDuration();
    if(javaXMLDuration != null) {
      String plainDuration = javaXMLDuration.toString();
      // I shiver.
      GDuration gDuration = new GDuration(plainDuration);  
      subscribeContextRequest.setDuration(gDuration);
    }
  }

  private void sendHTTPRequest() throws ClientProtocolException, IOException {
    HttpClient httpclient = new DefaultHttpClient();
    LOG.info(getInformationString() + "Sending subscription request.");
    httpresponse = httpclient.execute(post);
  }
  
  private void readHTTPResponse() throws IllegalStateException, IOException, XmlException {
    InputStream input = httpresponse.getEntity().getContent();
    SubscribeContextResponseDocument responseDoc = SubscribeContextResponseDocument.Factory.parse(input);
    subscribeContextResponse = responseDoc.getSubscribeContextResponse();
    if(!subscribeContextResponse.validate()) 
      throw new ActivitiException("Response from NGSI server is not valid");
  }
  
  private String getInformationString() {
    StringBuilder informationBuilder = new StringBuilder();
    informationBuilder.append("Building subscription context for NGSI start event connnected with entities: ");
    for(EntityId entityId : startEventBehaviour.getPhysicalEntityIDs()) {
      informationBuilder.append("'"+entityId.getId()+"'");
    }
    informationBuilder.append(".\n");
    return informationBuilder.toString();
  }

}
