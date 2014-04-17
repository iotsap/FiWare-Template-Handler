package com.sap.research.fiware.ngsi10.simple;

import noNamespace.ContextElementResponseList;
import noNamespace.EntityId;
import noNamespace.QueryContextRequest;
import noNamespace.QueryContextResponse;
import noNamespace.QueryContextResponseDocument;

public class QueryContextHandler {

	private QueryContextRequest req;
	private QueryContextResponseDocument respDoc;
	
	public QueryContextHandler(QueryContextRequest req) {
		this.req = req;
	}

	public QueryContextResponseDocument handle() {
		ContextElementResponseList contextElementResponseList = prepareResponse();
		writeValues(contextElementResponseList);
		return respDoc;
	}

	private void writeValues(ContextElementResponseList contextElementResponseList) {
		EntityId[] entityIDs = req.getEntityIdList().getEntityIdArray();
		String[] contextAttributes = req.getAttributeList().getAttributeArray();
		ContextElementResponseListHelper contextElementResponseListHelper = new ContextElementResponseListHelper(contextElementResponseList, entityIDs, contextAttributes);
		contextElementResponseListHelper.write();
	}

	private ContextElementResponseList prepareResponse() {
		respDoc = QueryContextResponseDocument.Factory.newInstance();
		QueryContextResponse resp = respDoc.addNewQueryContextResponse();
		ContextElementResponseList contextElementResponseList = resp.addNewContextResponseList();
		return contextElementResponseList;
	}
}
