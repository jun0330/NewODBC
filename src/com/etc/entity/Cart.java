package com.etc.entity;

public class Cart {
	
	private int CARTID;
	private int MYMODELID;
	private int CARTCOUNT;
	private String CARTDATE;
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(int cARTID, int mYMODELID, int cARTCOUNT, String cARTDATE) {
		super();
		CARTID = cARTID;
		MYMODELID = mYMODELID;
		CARTCOUNT = cARTCOUNT;
		CARTDATE = cARTDATE;
	}

	@Override
	public String toString() {
		return "Cart [CARTID=" + CARTID + ", MYMODELID=" + MYMODELID + ", CARTCOUNT=" + CARTCOUNT + ", CARTDATE="
				+ CARTDATE + "]";
	}

	public int getCARTID() {
		return CARTID;
	}

	public void setCARTID(int cARTID) {
		CARTID = cARTID;
	}

	public int getMYMODELID() {
		return MYMODELID;
	}

	public void setMYMODELID(int mYMODELID) {
		MYMODELID = mYMODELID;
	}

	public int getCARTCOUNT() {
		return CARTCOUNT;
	}

	public void setCARTCOUNT(int cARTCOUNT) {
		CARTCOUNT = cARTCOUNT;
	}

	public String getCARTDATE() {
		return CARTDATE;
	}

	public void setCARTDATE(String cARTDATE) {
		CARTDATE = cARTDATE;
	}

	
}
