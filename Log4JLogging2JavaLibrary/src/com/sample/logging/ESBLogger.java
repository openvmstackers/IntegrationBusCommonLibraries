package com.sample.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ESBLogger {
	
	private static Logger mainLogger = LogManager.getLogger();
	
	public static void logDebug(String logMessage, String applicationName){
		mainLogger = LogManager.getLogger(applicationName);
		if(mainLogger.isDebugEnabled()){
			mainLogger.debug(logMessage);
		}
	}

	public static void logInfo(String logMessage, String applicationName){
		mainLogger = LogManager.getLogger(applicationName);
		if(mainLogger.isInfoEnabled()){
			mainLogger.info(logMessage);
		}
	}

	public static void logError(String logMessage, String applicationName){
		mainLogger = LogManager.getLogger(applicationName);
		if(mainLogger.isErrorEnabled()){
			mainLogger.error(logMessage);
		}
	}


}
