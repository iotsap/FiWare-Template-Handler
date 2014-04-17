package com.sap.research.fiware.ngsi10.simple;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import noNamespace.QueryContextRequest;
import noNamespace.QueryContextResponseDocument;

import org.springframework.stereotype.Service;

import com.sap.research.fiware.ngsi10.simple.helpers.MethodNotAllowedHelper;

@Service("queryContext")
@Path("/queryContext/")
public class QueryContext {

	@GET
	public Response postOnQueryContext() {
		return MethodNotAllowedHelper.onlyPostAllowed();
	}

	@PUT
	public Response putOnQueryContext() {
		return MethodNotAllowedHelper.onlyPostAllowed();
	}

	@POST
	@Produces({ MediaType.APPLICATION_XML })
	public QueryContextResponseDocument queryContext(QueryContextRequest req) {
		return new QueryContextHandler(req).handle();
	}

	@DELETE
	public Response deleteOnQueryContext() {
		return MethodNotAllowedHelper.onlyPostAllowed();
	}

}
