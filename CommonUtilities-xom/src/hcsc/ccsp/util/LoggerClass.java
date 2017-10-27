package hcsc.ccsp.util;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class LoggerClass {
	public static Logger logger=Logger.getLogger(LoggerClass.class);
	
	
	public static void loggerMethod(Object message){
		PropertyConfigurator.configure("log4j.properties");
		logger.info(message);
	}
	
	public static void logRequestResponse(String message,String requestResponse){
		PropertyConfigurator.configure("log4j.properties");
		logger.info(message);
		logger.info(requestResponse);
	}
	public static void logLevelLogger(String logLevel, String message){
		
		PropertyConfigurator.configure("log4j.properties");
		if(logLevel.equalsIgnoreCase("ERROR")){
			logger.error("ERROR : "+message);
		}
		else if(logLevel.equalsIgnoreCase("DEBUG")){
			logger.debug("DEBUG : "+message);
		}
		else if(logLevel.equalsIgnoreCase("FATAL")){
			logger.fatal("FATAL : "+message);
		}
		else if(logLevel.equalsIgnoreCase("WARN")){
			logger.warn("WARN : "+message);
		}
		else{
			logger.info("INFO : "+ message);
		}
	}
}
