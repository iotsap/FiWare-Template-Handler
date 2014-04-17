package com.sap.research.fiware.ngsi10.simple;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import noNamespace.SubscribeContextRequest;
import noNamespace.SubscribeContextResponseDocument;

import org.springframework.stereotype.Service;

import com.sap.research.fiware.ngsi10.simple.helpers.MethodNotAllowedHelper;

/**
 * HTTP endpoint for the 'subscribeContext' operation
 * 
 *
 */
@Service("subscribeContext")
@Path("/subscribeContext/")
public class SubscribeContext {

	@GET
	public Response postOnSubscribeContext() {
		return MethodNotAllowedHelper.onlyPostAllowed();
	}

	@PUT
	public Response putOnSubscribeContext() {
		return MethodNotAllowedHelper.onlyPostAllowed();
	}

	@POST
	@Produces({ MediaType.APPLICATION_XML })
	public SubscribeContextResponseDocument subscribeContext(SubscribeContextRequest req) {
		return new SubscribeContextHandler(req).handle();
	}

	@DELETE
	public Response deleteOnSubscribeContext() {
		return MethodNotAllowedHelper.onlyPostAllowed();
	}

}