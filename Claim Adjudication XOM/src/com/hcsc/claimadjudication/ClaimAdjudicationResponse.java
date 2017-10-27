package com.hcsc.claimadjudication;


/**
 * @author vthirumalaivinjam
 * @version 1.0
 * @created 26-Oct-2017 2:43:14 PM
 */
public class ClaimAdjudicationResponse {

	private Claim claim;
	private String[] messages;

	public ClaimAdjudicationResponse(){

	}

	public Claim getClaim() {
		return claim;
	}

	public void setClaim(Claim claim) {
		this.claim = claim;
	}

	public String[] getMessages() {
		return messages;
	}

	public void setMessages(String[] messages) {
		this.messages = messages;
	}

	public void finalize() throws Throwable {

	}
}//end ClaimAdjudicationResponse