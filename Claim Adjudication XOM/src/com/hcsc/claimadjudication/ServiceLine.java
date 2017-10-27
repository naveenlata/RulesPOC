package com.hcsc.claimadjudication;

import java.util.Date;
import java.util.List;


/**
 * Provider Class
 * @author I32159C
 * @version 1.0
 * @created 26-Oct-2017 2:43:23 PM
 */
public class ServiceLine {

	private String categoryCode;
	private List<String> cptModifierList;
	private String denyIndicator;
	private String descriptorCode;
	private List<String> diagnosisBit;
	private List<String> diagnosisCodeList;
	private String drugInd;
	private String errorCode;
	private String formatCode;
	private Date fromDate;
	private String genericDrugInd;
	private String hcpcsCode;
	private List<String> ineligibleReasonCodeInputList;
	private String ineligibleReasonCodeOutput;
	private int lineNumber;
	private String originalTypeOfService;
	private String pearlTypeOfService;
	private Provider performingProvider;
	private String placeOfTreatment;
	private String premierTypeOfService;
	private List<String> primaryPremierBits;
	private List<String> procedureBit;
	private String procedureCode;
	/**
	 * Response fields
	 */
	private String provisionId;
	private String revenueCode;
	private int serviceDays;
	private int timeMiles;
	private Date toDate;
	private String typeOfService;
	private int units;
	private String usageCode;

	public ServiceLine(){

	}

	public void finalize() throws Throwable {

	}
}//end ServiceLine