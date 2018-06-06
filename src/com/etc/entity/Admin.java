package com.etc.entity;

public class Admin {
	
	private int ADMINID;
	private String ADMINACCOUNT;
	private String ADMINPWD;
	private String ADMINNICKNAME;
	
	
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String aDMINACCOUNT, String aDMINPWD, String aDMINNICKNAME) {
		super();
		ADMINACCOUNT = aDMINACCOUNT;
		ADMINPWD = aDMINPWD;
		ADMINNICKNAME = aDMINNICKNAME;
	}
	public Admin(int aDMINID, String aDMINACCOUNT, String aDMINPWD, String aDMINNICKNAME) {
		super();
		ADMINID = aDMINID;
		ADMINACCOUNT = aDMINACCOUNT;
		ADMINPWD = aDMINPWD;
		ADMINNICKNAME = aDMINNICKNAME;
	}
	public Admin(String aDMINPWD, String aDMINNICKNAME,int aDMINID) {
		super();
		
		
		ADMINPWD = aDMINPWD;
		ADMINNICKNAME = aDMINNICKNAME;
		ADMINID = aDMINID;
	}
	public int getADMINID() {
		return ADMINID;
	}
	public void setADMINID(int aDMINID) {
		ADMINID = aDMINID;
	}
	public String getADMINACCOUNT() {
		return ADMINACCOUNT;
	}
	public void setADMINACCOUNT(String aDMINACCOUNT) {
		ADMINACCOUNT = aDMINACCOUNT;
	}
	public String getADMINPWD() {
		return ADMINPWD;
	}
	public void setADMINPWD(String aDMINPWD) {
		ADMINPWD = aDMINPWD;
	}
	public String getADMINNICKNAME() {
		return ADMINNICKNAME;
	}
	public void setADMINNICKNAME(String aDMINNICKNAME) {
		ADMINNICKNAME = aDMINNICKNAME;
	}
	@Override
	public String toString() {
		return "Admin [ADMINID=" + ADMINID + ", ADMINACCOUNT=" + ADMINACCOUNT + ", ADMINPWD=" + ADMINPWD
				+ ", ADMINNICKNAME=" + ADMINNICKNAME + "]";
	}
	
	
	

}
