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


import noNamespace.NotifyContextRequest;
import noNamespace.NotifyContextRequestDocument;
import noNamespace.NotifyContextResponse;
import noNamespace.NotifyContextResponseDocument;
import noNamespace.StatusCode;

import org.activiti.engine.impl.bpmn.helper.NGSISubscriptionManager.NotFoundException;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlString;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;
 
/**
 * Provides an HTTP endpoint to receive context notification requests and trigger NGSI start events
 */
public class NGSINotifyContextEndpoint extends ServerResource {
  
  protected static final Logger LOGGER = Logger.getLogger(NGSINotifyContextEndpoint.class.getName());
  private String requestBody;
  private NotifyContextRequest notifyContextRequest;
  private StatusCode statusCode;
  private String response;
  
  @Post
  public String notifyContext(String requestBody) {
    this.requestBody = requestBody;
    handleRequest();
    return response;
  }

  private void handleRequest() {
    try {
      parseRequest();
      startProcess();
      createOKStatusCode();
    }
    catch(XmlException e){
      createBadRequestStatusCode(e);
    }
    catch(NotFoundException e) {
      createSubscriptionNotFoundStatusCode();
    }
    catch(Exception e) {
      createInternalErrorStatusCode(e);
    }
    createResponse();
  }
  
  private void parseRequest() throws XmlException {
    NotifyContextRequestDocument notifyContextRequestDocument = NotifyContextRequestDocument.Factory.parse(requestBody);
    if(!notifyContextRequestDocument.validate()) {
      throw new XmlException("Request from NGSI server is not valid");
    }
    notifyContextRequest = notifyContextRequestDocument.getNotifyContextRequest();
  }

  private void startProcess() throws NotFoundException, Exception {
    String subscriptionID = notifyContextRequest.getSubscriptionId();
    String dataObject = notifyContextRequest.getContextResponseList().toString();
    NGSISubscriptionManager.get().notify(subscriptionID, dataObject);
  }

  private void createResponse() {
    NotifyContextResponseDocument notifyContextResponseDocument = NotifyContextResponseDocument.Factory.newInstance();
    NotifyContextResponse notifyContextResponse = notifyContextResponseDocument.addNewNotifyContextResponse();
    notifyContextResponse.setResponseCode(statusCode);
    response = notifyContextResponseDocument.toString();
  }
  
  private void createInternalErrorStatusCode(Exception e) {
    statusCode = StatusCode.Factory.newInstance();
    e.printStackTrace();
    //this is a server problem and no communication problem. It's already logged within the execution
    statusCode.setCode(500);
    statusCode.xsetReasonPhrase(XmlString.Factory.newValue(e.getStackTrace().toString()));
  }

  private void createSubscriptionNotFoundStatusCode() {
    statusCode = StatusCode.Factory.newInstance();
    LOGGER.info("Received a NGSI notification request for a non-existing subscription");
    statusCode.setCode(470);
    statusCode.xsetReasonPhrase(XmlString.Factory.newValue("The subscription ID is unknown"));
  }

  private void createBadRequestStatusCode(XmlException e) {
    statusCode = StatusCode.Factory.newInstance();
    LOGGER.info("Received an invalid NGSI notification request: " + e.getMessage());
    statusCode.setCode(400);
    statusCode.xsetReasonPhrase(XmlString.Factory.newValue(e.getMessage()));
  }

  private void createOKStatusCode() {
    statusCode = StatusCode.Factory.newInstance();
    LOGGER.log(Level.INFO,"Answering the notification request with success.");
    statusCode.setCode(200);
    statusCode.xsetReasonPhrase(XmlString.Factory.newValue("OK"));
  }

}
