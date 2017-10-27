package hcsc.ccsp.util;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;


public class GenericUtils {

	/**
	   * This method is used to convert the decimal to numeric value
	   * and returns as number
	   * 
	   */
	public static long decimalToNumericConversion(double decimalNumber) {
		return Math.round(decimalNumber);
	}
	
	
	/**
	   * This method is used to convert the java object to string
	   * and returns as string
	   * 
	   */
	public static String convertObjectToString(Object object) {
		return ReflectionToStringBuilder.toString(object);
	}
}
