package com.hcsc.claimadjudication;


/**
 * @author vthirumalaivinjam
 * @version 1.0
 * @created 26-Oct-2017 2:43:12 PM
 */
public class ClaimAdjudicationRequest {

	private Claim claim;
	private AdministrativePlan plan;

	public ClaimAdjudicationRequest(){

	}

	public Claim getClaim() {
		return claim;
	}

	public void setClaim(Claim claim) {
		this.claim = claim;
	}

	public AdministrativePlan getPlan() {
		return plan;
	}

	public void setPlan(AdministrativePlan plan) {
		this.plan = plan;
	}

	public void finalize() throws Throwable {

	}
}//end ClaimAdjudicationRequest