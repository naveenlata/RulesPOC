package com.hcsc.claimadjudication;

import java.util.Collection;
import java.util.Date;


/**
 * @author vthirumalaivinjam
 * @version 1.0
 * @created 26-Oct-2017 2:43:06 PM
 */
public class AdministrativePlan {

	private Date businessEffectiveDate;
	private Date businessEndDate;
	private CorePackage corePackage;
	private Date effectiveDateTimestamp;
	private Date endTimeStamp;
	private int id;
	private String productCode;
	public CorePackage CorePackage;
	public Collection IncludedServiceCategory;
	public Collection CorePackageVariableValue;
	public Collection ExcludedServiceCategory;

	public AdministrativePlan(){

	}

	public void finalize() throws Throwable {

	}
}//end AdministrativePlan