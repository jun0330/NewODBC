package com.etc.entity;

public class User {
	
	private int USERID;
	private String USERACCOUNT;
	private String USERPWD;
	private String USERNICKNAME;
	private String USERSEX;
	private String USERIDCARD;
	private String USEREMAIL;
	private String USERADDRESS;
	private String USERDATE;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int uSERID, String uSERACCOUNT, String uSERPWD, String uSERNICKNAME, String uSERSEX, String uSERIDCARD,
			String uSEREMAIL, String uSERADDRESS, String uSERDATE) {
		super();
		USERID = uSERID;
		USERACCOUNT = uSERACCOUNT;
		USERPWD = uSERPWD;
		USERNICKNAME = uSERNICKNAME;
		USERSEX = uSERSEX;
		USERIDCARD = uSERIDCARD;
		USEREMAIL = uSEREMAIL;
		USERADDRESS = uSERADDRESS;
		USERDATE = uSERDATE;
	}
	public User(int uSERID, String uSERACCOUNT, String uSERPWD, String uSERNICKNAME, String uSERSEX, String uSERIDCARD,
			String uSEREMAIL, String uSERADDRESS) {
		super();
		USERID = uSERID;
		USERACCOUNT = uSERACCOUNT;
		USERPWD = uSERPWD;
		USERNICKNAME = uSERNICKNAME;
		USERSEX = uSERSEX;
		USERIDCARD = uSERIDCARD;
		USEREMAIL = uSEREMAIL;
		USERADDRESS = uSERADDRESS;
	
	}
	
	public User(String uSERPWD, String uSERNICKNAME, String uSERSEX, String uSERIDCARD,
			String uSEREMAIL, String uSERADDRESS,int uSERID) {
		super();
		
		
		USERPWD = uSERPWD;
		USERNICKNAME = uSERNICKNAME;
		USERSEX = uSERSEX;
		USERIDCARD = uSERIDCARD;
		USEREMAIL = uSEREMAIL;
		USERADDRESS = uSERADDRESS;
		USERID = uSERID;
	}

	public int getUSERID() {
		return USERID;
	}

	public void setUSERID(int uSERID) {
		USERID = uSERID;
	}

	public String getUSERACCOUNT() {
		return USERACCOUNT;
	}

	public void setUSERACCOUNT(String uSERACCOUNT) {
		USERACCOUNT = uSERACCOUNT;
	}

	public String getUSERPWD() {
		return USERPWD;
	}

	public void setUSERPWD(String uSERPWD) {
		USERPWD = uSERPWD;
	}

	public String getUSERNICKNAME() {
		return USERNICKNAME;
	}

	public void setUSERNICKNAME(String uSERNICKNAME) {
		USERNICKNAME = uSERNICKNAME;
	}

	public String getUSERSEX() {
		return USERSEX;
	}

	public void setUSERSEX(String uSERSEX) {
		USERSEX = uSERSEX;
	}

	public String getUSERIDCARD() {
		return USERIDCARD;
	}

	public void setUSERIDCARD(String uSERIDCARD) {
		USERIDCARD = uSERIDCARD;
	}

	public String getUSEREMAIL() {
		return USEREMAIL;
	}

	public void setUSEREMAIL(String uSEREMAIL) {
		USEREMAIL = uSEREMAIL;
	}

	public String getUSERADDRESS() {
		return USERADDRESS;
	}

	public void setUSERADDRESS(String uSERADDRESS) {
		USERADDRESS = uSERADDRESS;
	}

	public String getUSERDATE() {
		return USERDATE;
	}

	public void setUSERDATE(String uSERDATE) {
		USERDATE = uSERDATE;
	}

	@Override
	public String toString() {
		return "User [USERID=" + USERID + ", USERACCOUNT=" + USERACCOUNT + ", USERPWD=" + USERPWD + ", USERNICKNAME="
				+ USERNICKNAME + ", USERSEX=" + USERSEX + ", USERIDCARD=" + USERIDCARD + ", USEREMAIL=" + USEREMAIL
				+ ", USERADDRESS=" + USERADDRESS + ", USERDATE=" + USERDATE + "]";
	}
	
	
	
	
	
	
	

}
