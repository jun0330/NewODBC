package com.etc.entity;

public class Order {
	private int ORDERID;
	private String ORDERCODE;
	private int MYMYDEID;
	private int ORDERPRICE;
	private String USERACCOUNT;
	private String ORDERSTATUS;
	private String ENAME;
	private String ORDEREXPCODE;
	private String ORDERREMARKS;
	private String ORDERDATE;


	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(String oRDERCODE, int mYMYDEID, int oRDERPRICE, String uSERACCOUNT, String oRDERSTATUS, String eNAME,
			String oRDEREXPCODE, String oRDERREMARKS, String oRDERDATE) {
		super();
		ORDERCODE = oRDERCODE;
		MYMYDEID = mYMYDEID;
		ORDERPRICE = oRDERPRICE;
		USERACCOUNT = uSERACCOUNT;
		ORDERSTATUS = oRDERSTATUS;
		ENAME = eNAME;
		ORDEREXPCODE = oRDEREXPCODE;
		ORDERREMARKS = oRDERREMARKS;
		ORDERDATE = oRDERDATE;
	}
	public Order(int oRDERID, String oRDERCODE, int mYMYDEID, int oRDERPRICE, String uSERACCOUNT, String oRDERSTATUS,
			String eNAME, String oRDEREXPCODE, String oRDERREMARKS, String oRDERDATE) {
		super();
		ORDERID = oRDERID;
		ORDERCODE = oRDERCODE;
		MYMYDEID = mYMYDEID;
		ORDERPRICE = oRDERPRICE;
		USERACCOUNT = uSERACCOUNT;
		ORDERSTATUS = oRDERSTATUS;
		ENAME = eNAME;
		ORDEREXPCODE = oRDEREXPCODE;
		ORDERREMARKS = oRDERREMARKS;
		ORDERDATE = oRDERDATE;
	}
	public int getORDERID() {
		return ORDERID;
	}
	public void setORDERID(int oRDERID) {
		ORDERID = oRDERID;
	}
	public String getORDERCODE() {
		return ORDERCODE;
	}
	public void setORDERCODE(String oRDERCODE) {
		ORDERCODE = oRDERCODE;
	}
	public int getMYMYDEID() {
		return MYMYDEID;
	}
	public void setMYMYDEID(int mYMYDEID) {
		MYMYDEID = mYMYDEID;
	}
	public int getORDERPRICE() {
		return ORDERPRICE;
	}
	public void setORDERPRICE(int oRDERPRICE) {
		ORDERPRICE = oRDERPRICE;
	}
	public String getUSERACCOUNT() {
		return USERACCOUNT;
	}
	public void setUSERACCOUNT(String uSERACCOUNT) {
		USERACCOUNT = uSERACCOUNT;
	}
	public String getORDERSTATUS() {
		return ORDERSTATUS;
	}
	public void setORDERSTATUS(String oRDERSTATUS) {
		ORDERSTATUS = oRDERSTATUS;
	}
	public String getENAME() {
		return ENAME;
	}
	public void setENAME(String eNAME) {
		ENAME = eNAME;
	}
	public String getORDEREXPCODE() {
		return ORDEREXPCODE;
	}
	public void setORDEREXPCODE(String oRDEREXPCODE) {
		ORDEREXPCODE = oRDEREXPCODE;
	}
	public String getORDERREMARKS() {
		return ORDERREMARKS;
	}
	public void setORDERREMARKS(String oRDERREMARKS) {
		ORDERREMARKS = oRDERREMARKS;
	}
	public String getORDERDATE() {
		return ORDERDATE;
	}
	public void setORDERDATE(String oRDERDATE) {
		ORDERDATE = oRDERDATE;
	}
	@Override
	public String toString() {
		return "Order [ORDERID=" + ORDERID + ", ORDERCODE=" + ORDERCODE + ", MYMYDEID=" + MYMYDEID + ", ORDERPRICE="
				+ ORDERPRICE + ", USERACCOUNT=" + USERACCOUNT + ", ORDERSTATUS=" + ORDERSTATUS + ", ENAME=" + ENAME
				+ ", ORDEREXPCODE=" + ORDEREXPCODE + ", ORDERREMARKS=" + ORDERREMARKS + ", ORDERDATE=" + ORDERDATE
				+ "]";
	}
	
	

}
