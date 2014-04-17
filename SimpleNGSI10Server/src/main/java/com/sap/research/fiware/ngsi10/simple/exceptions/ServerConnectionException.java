package com.sap.research.fiware.ngsi10.simple.exceptions;

/**
 * To be thrown when a connection (as client) to another server has failed
 * 
 *
 */
@SuppressWarnings("serial")
public class ServerConnectionException extends Exception {
	public ServerConnectionException(Exception e) {
		super(e);
	}

}
