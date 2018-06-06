package com.etc.entity;

public class Express {
	private int EID;
	private String ENAME;
	
	public Express() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Express(int eID) {
		super();
		EID = eID;
	}
	public Express(String eNAME,int eID) {
		super();
		ENAME = eNAME;
		EID = eID;
	}
	public int getEID() {
		return EID;
	}
	public void setEID(int eID) {
		EID = eID;
	}
	public String getENAME() {
		return ENAME;
	}
	public void setENAME(String eNAME) {
		ENAME = eNAME;
	}
	@Override
	public String toString() {
		return "Exoress [EID=" + EID + ", ENAME=" + ENAME + "]";
	}
	
	

}
