package com.sap.research.fiware.ngsi10.simple.startup;

import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.sap.research.fiware.ngsi10.simple.RegisterContextClient;
import com.sap.research.fiware.ngsi10.simple.exceptions.ServerConnectionException;


/**
 * Application Lifecycle Listener implementation class StartupListener
 *
 */
public class StartupListener implements ServletContextListener {

	private static final Logger LOG = Logger.getLogger(StartupListener.class.getName());
	
	@Override
	public void contextInitialized(ServletContextEvent context) {
	      /*try {
			(new RegisterContextClient()).registerContext();
		} catch (ServerConnectionException e) {
			LOG.warning("Could not register context: "+e.getMessage());
		}*/
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {}

	
}
