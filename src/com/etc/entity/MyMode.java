package com.etc.entity;

public class MyMode {
	private int MYMODEID;
	private String MYMODECONTENT;
	private int MODEID;
	
	public MyMode() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyMode(String mYMODECONTENT, int mODEID) {
		super();
		MYMODECONTENT = mYMODECONTENT;
		MODEID = mODEID;
	}
	public MyMode(int mYMODEID, String mYMODECONTENT, int mODEID) {
		super();
		MYMODEID = mYMODEID;
		MYMODECONTENT = mYMODECONTENT;
		MODEID = mODEID;
	}
	public int getMYMODEID() {
		return MYMODEID;
	}
	public void setMYMODEID(int mYMODEID) {
		MYMODEID = mYMODEID;
	}
	public String getMYMODECONTENT() {
		return MYMODECONTENT;
	}
	public void setMYMODECONTENT(String mYMODECONTENT) {
		MYMODECONTENT = mYMODECONTENT;
	}
	public int getMODEID() {
		return MODEID;
	}
	public void setMODEID(int mODEID) {
		MODEID = mODEID;
	}
	@Override
	public String toString() {
		return "MyMode [MYMODEID=" + MYMODEID + ", MYMODECONTENT=" + MYMODECONTENT + ", MODEID=" + MODEID + "]";
	}
	
	

}
