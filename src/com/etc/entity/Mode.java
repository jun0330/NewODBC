package com.etc.entity;

public class Mode {
	private int MODEID;
	private String MODECONTENT;
	private int NAVID;
	private int MODEPRICE;
	
	public Mode() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mode(String mODECONTENT, int nAVID, int mODEPRICE) {
		super();
		MODECONTENT = mODECONTENT;
		NAVID = nAVID;
		MODEPRICE = mODEPRICE;
	}
	public Mode(int mODEID, String mODECONTENT, int nAVID, int mODEPRICE) {
		super();
		MODEID = mODEID;
		MODECONTENT = mODECONTENT;
		NAVID = nAVID;
		MODEPRICE = mODEPRICE;
	}
	public int getMODEID() {
		return MODEID;
	}
	public void setMODEID(int mODEID) {
		MODEID = mODEID;
	}
	public String getMODECONTENT() {
		return MODECONTENT;
	}
	public void setMODECONTENT(String mODECONTENT) {
		MODECONTENT = mODECONTENT;
	}
	public int getNAVID() {
		return NAVID;
	}
	public void setNAVID(int nAVID) {
		NAVID = nAVID;
	}
	public int getMODEPRICE() {
		return MODEPRICE;
	}
	public void setMODEPRICE(int mODEPRICE) {
		MODEPRICE = mODEPRICE;
	}
	@Override
	public String toString() {
		return "Mode [MODEID=" + MODEID + ", MODECONTENT=" + MODECONTENT + ", NAVID=" + NAVID + ", MODEPRICE="
				+ MODEPRICE + "]";
	}
	
	

}
