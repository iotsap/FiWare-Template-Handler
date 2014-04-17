package com.sap.research.fiware.ngsi10.simple;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import noNamespace.UpdateContextRequest;
import noNamespace.UpdateContextResponseDocument;

import org.springframework.stereotype.Service;

import com.sap.research.fiware.ngsi10.simple.helpers.MethodNotAllowedHelper;

/**
 * HTTP endpoint for the 'updateContext' operation
 * 
 *
 */
@Service("updateContext")
@Path("/updateContext/")
public class UpdateContext {

	@GET
	public Response postOnUpdateContext() {
		return MethodNotAllowedHelper.onlyPostAllowed();
	}

	@PUT
	public Response putOnUpdateContext() {
		return MethodNotAllowedHelper.onlyPostAllowed();
	}

	@POST
	@Produces({ MediaType.APPLICATION_XML })
	public UpdateContextResponseDocument updateContext(UpdateContextRequest req) {
		return new UpdateContextHandler(req).handle();
	}

	@DELETE
	public Response deleteOnUpdateContext() {
		return MethodNotAllowedHelper.onlyPostAllowed();
	}

}