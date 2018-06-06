package com.etc.entity;

public class Address {
	private int ADDRESSID;
	private String ADDRESSNAME;
	private String ADDRESSPHONE;
	private String ADDRESSADDR;
	private int USERID;
	
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String aDDRESSNAME, String aDDRESSPHONE, String aDDRESSADDR, int uSERID) {
		super();
		ADDRESSNAME = aDDRESSNAME;
		ADDRESSPHONE = aDDRESSPHONE;
		ADDRESSADDR = aDDRESSADDR;
		USERID = uSERID;
	}
	public Address(int aDDRESSID, String aDDRESSNAME, String aDDRESSPHONE, String aDDRESSADDR, int uSERID) {
		super();
		ADDRESSID = aDDRESSID;
		ADDRESSNAME = aDDRESSNAME;
		ADDRESSPHONE = aDDRESSPHONE;
		ADDRESSADDR = aDDRESSADDR;
		USERID = uSERID;
	}
	public int getADDRESSID() {
		return ADDRESSID;
	}
	public void setADDRESSID(int aDDRESSID) {
		ADDRESSID = aDDRESSID;
	}
	public String getADDRESSNAME() {
		return ADDRESSNAME;
	}
	public void setADDRESSNAME(String aDDRESSNAME) {
		ADDRESSNAME = aDDRESSNAME;
	}
	public String getADDRESSPHONE() {
		return ADDRESSPHONE;
	}
	public void setADDRESSPHONE(String aDDRESSPHONE) {
		ADDRESSPHONE = aDDRESSPHONE;
	}
	public String getADDRESSADDR() {
		return ADDRESSADDR;
	}
	public void setADDRESSADDR(String aDDRESSADDR) {
		ADDRESSADDR = aDDRESSADDR;
	}
	public int getUSERID() {
		return USERID;
	}
	public void setUSERID(int uSERID) {
		USERID = uSERID;
	}
	@Override
	public String toString() {
		return "Address [ADDRESSID=" + ADDRESSID + ", ADDRESSNAME=" + ADDRESSNAME + ", ADDRESSPHONE=" + ADDRESSPHONE
				+ ", ADDRESSADDR=" + ADDRESSADDR + ", USERID=" + USERID + "]";
	}
	
	

}
