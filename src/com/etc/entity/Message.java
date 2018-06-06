package com.etc.entity;

public class Message {
	
	private int MESSAGEID;
	private String USERACCOUNT;
	private String MESSAGETITLE;
	private String MESSAGECONTENT;
	private String MESSAGEDATE;
	
	
	
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Message(int mESSAGEID) {
		super();
		MESSAGEID = mESSAGEID;
	}


	public Message(String uSERACCOUNT, String mESSAGETITLE, String mESSAGECONTENT, String mESSAGEDATE) {
		super();
		USERACCOUNT = uSERACCOUNT;
		MESSAGETITLE = mESSAGETITLE;
		MESSAGECONTENT = mESSAGECONTENT;
		MESSAGEDATE = mESSAGEDATE;
	}
	public Message(int mESSAGEID, String uSERACCOUNT, String mESSAGETITLE, String mESSAGECONTENT, String mESSAGEDATE) {
		super();
		MESSAGEID = mESSAGEID;
		USERACCOUNT = uSERACCOUNT;
		MESSAGETITLE = mESSAGETITLE;
		MESSAGECONTENT = mESSAGECONTENT;
		MESSAGEDATE = mESSAGEDATE;
	}
	public int getMESSAGEID() {
		return MESSAGEID;
	}
	public void setMESSAGEID(int mESSAGEID) {
		MESSAGEID = mESSAGEID;
	}
	public String getUSERACCOUNT() {
		return USERACCOUNT;
	}
	public void setUSERACCOUNT(String uSERACCOUNT) {
		USERACCOUNT = uSERACCOUNT;
	}
	public String getMESSAGETITLE() {
		return MESSAGETITLE;
	}
	public void setMESSAGETITLE(String mESSAGETITLE) {
		MESSAGETITLE = mESSAGETITLE;
	}
	public String getMESSAGECONTENT() {
		return MESSAGECONTENT;
	}
	public void setMESSAGECONTENT(String mESSAGECONTENT) {
		MESSAGECONTENT = mESSAGECONTENT;
	}
	public String getMESSAGEDATE() {
		return MESSAGEDATE;
	}
	public void setMESSAGEDATE(String mESSAGEDATE) {
		MESSAGEDATE = mESSAGEDATE;
	}
	@Override
	public String toString() {
		return "Message [MESSAGEID=" + MESSAGEID + ", USERACOOUNT=" + USERACCOUNT + ", MESSAGETITLE=" + MESSAGETITLE
				+ ", MESSAGECONTENT=" + MESSAGECONTENT + ", MESSAGEDATE=" + MESSAGEDATE + "]";
	}
	
	

}
