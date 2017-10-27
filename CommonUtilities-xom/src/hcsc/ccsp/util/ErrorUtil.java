package hcsc.ccsp.util;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
//import ccsp.Claim;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author ppandiarajan
 *
 */
public class ErrorUtil {
	public static Map<String, String> Error_Map = new HashMap<String, String>();
	static String errocode = null;
	static String errordesc = null;

	/**
	   * This method is used to load the error code and detail from the xml stored at a location 
	   * and store it in the HashMap
	   * 
	   */
	public static void loadErrorMap() {
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			

			DefaultHandler handler = new DefaultHandler() {

				boolean errcode = false;
				boolean errdesc = false;

				public void startElement(String uri, String localName,
						String qName, Attributes attributes)
						throws SAXException {

					if (qName.equalsIgnoreCase("ErrorCode")) {
						errcode = true;
					}

					if (qName.equalsIgnoreCase("ErrorDescription")) {
						errdesc = true;
					}
				}

				public void endElement(String uri, String localName,
						String qName) throws SAXException {
				}

				public void characters(char ch[], int start, int length)
						throws SAXException {
					if (errcode) {
						errocode = new String(ch, start, length);
						errcode = false;
					}
					if (errdesc) {
						errordesc = new String(ch, start, length);
						errdesc = false;
					}
					if(errocode != null && errordesc != null){
						Error_Map.put(errocode, errordesc);
						errocode = null;
						errordesc = null;
					}
				}

			};
			saxParser.parse(new File("ErrorMap.xml"), handler);
		} catch (Exception e) {
			 e.printStackTrace();
		}
	}

	/**
	   * This method is used to get the error description from the HashMap
	   * based on the code passed as an input
	   * 
	   */
	public static String getDescriptionFromErrorMap(String code) {
		if(Error_Map.isEmpty()){
			loadErrorMap();
		}
		String result = "";
		result = Error_Map.get(code);
		return result;
	}
	
	/**
	   * This method is used to get the error code from the HashMap
	   * based on the description passed as an input
	   * 
	   */
	public static String getCodeFromErrorMap(String description) {
		if(Error_Map.isEmpty()){
			loadErrorMap();
		}
		String result = "";
		for (String code : Error_Map.keySet()) {
			if(Error_Map.get(code).equalsIgnoreCase(description)){
				result = code;
			}
		}
		 return result;
	}
	
	/**
	   * This method is used to check the existence of fields of java object 
	   * and returns true/false based on the values of fields
	   * 
	   */
	public static boolean isNull(Object object) {
		Class<? extends Object> className = object.getClass();
		Field[] fields = className.getDeclaredFields();
		boolean isNull = false;
		Object fieldValue = new Object();
		for (Field field : fields) {
			field.setAccessible(true);
			try {
				 fieldValue = field.get(object);
				 if(fieldValue==null || fieldValue.toString().equals("0") || fieldValue.toString().equals("0.0") || fieldValue.toString().equals("")){
					 isNull = true;
					 break;
				 }
				} catch (IllegalArgumentException | IllegalAccessException e) {
					e.printStackTrace();
			}
		}
		return isNull;
	}
	
	/**
	   * This method is used to check the existence of fields of java object 
	   * and returns the field names whose values are null/empty
	   * 
	   */
	public static List<String> checkForNulls(Object object) {
		List<String> fieldNames = new ArrayList<String>();
		Class<? extends Object> className = object.getClass();
		Field[] fields = className.getDeclaredFields();
		for (Field field : fields) {
			try {
				field.setAccessible(true);
				Object fieldValue = field.get(object);
				if(fieldValue==null || fieldValue.toString().equals("0") || fieldValue.toString().equals("0.0") || fieldValue.toString().equals("")){
					fieldNames.add(field.getName());
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return fieldNames;
	}
	
	
}
