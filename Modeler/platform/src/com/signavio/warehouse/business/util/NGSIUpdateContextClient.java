package com.signavio.warehouse.business.util;
import static org.apache.commons.lang.StringEscapeUtils.escapeHtml;

import java.net.URI;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;


public class NGSIUpdateContextClient {
	
	static final String template = "<updateContextRequest>\r\n" + 
			"    <contextElementList>\r\n" + 
			"        <contextElement>\r\n" + 
			"            <entityId type=\"BPMN model\">\r\n" + 
			"            <id>$name</id>\r\n" + 
			"            </entityId>\r\n" + 
			"            <contextAttributeList>\r\n" + 
			"                <contextAttribute>\r\n" + 
			"                    <name>template</name>\r\n" + 
			"                    <contextValue>$contextValue</contextValue>\r\n" + 
			"                </contextAttribute>\r\n" + 
			"               \r\n" + 
			"            </contextAttributeList>\r\n" + 
			"        </contextElement>\r\n" + 
			"    </contextElementList>\r\n" + 
			"    <updateAction>APPEND</updateAction>\r\n" + 
			"</updateContextRequest>";

	public static void sendModel(String path, String xml) throws Exception{
		String[] splitPath = path.split("/");
		String filename = splitPath[splitPath.length-1];
		String escapedXml = escapeHtml(xml);
		String body = template.replace("$name", filename);
		body = body.replace("$contextValue", escapedXml);
		System.out.println("Request body:"+body);
		HttpPost post = new HttpPost();
		post.addHeader("Content-Type", "application/xml");
		post.setURI(new URI("http://130.206.81.233:1026/NGSI10/updateContext"));
		StringEntity entity = new StringEntity(body);
		post.setEntity(entity);
		HttpClient httpclient = new DefaultHttpClient();
		HttpResponse httpresponse = httpclient.execute(post);
		ResponseHandler<String> handler = new BasicResponseHandler();
		String temp = handler.handleResponse(httpresponse);
		System.out.println(temp);
	}

}
