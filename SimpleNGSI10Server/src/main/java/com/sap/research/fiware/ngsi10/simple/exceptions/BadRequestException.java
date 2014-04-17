package com.sap.research.fiware.ngsi10.simple.exceptions;

/**
 * some expectations for the request were not fulfilled
 * 
 * 
 *
 */
public class BadRequestException extends Exception {

	public BadRequestException(String message) {
		super(message);
	}

}
