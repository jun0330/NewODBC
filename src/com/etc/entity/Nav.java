package com.etc.entity;

public class Nav {
	
	private int NAVID;
	private String NAVNAME;
	private String NAVPAGE;
	private int NAVINDEX;
	
	
	
	
	public Nav() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Nav(String nAVNAME, String nAVPAGE, int nAVINDEX) {
		super();
		NAVNAME = nAVNAME;
		NAVPAGE = nAVPAGE;
		NAVINDEX = nAVINDEX;
	}
	public Nav(int nAVID, String nAVNAME, String nAVPAGE, int nAVINDEX) {
		super();
		NAVID = nAVID;
		NAVNAME = nAVNAME;
		NAVPAGE = nAVPAGE;
		NAVINDEX = nAVINDEX;
	}
	public int getNAVID() {
		return NAVID;
	}
	public void setNAVID(int nAVID) {
		NAVID = nAVID;
	}
	public String getNAVNAME() {
		return NAVNAME;
	}
	public void setNAVNAME(String nAVNAME) {
		NAVNAME = nAVNAME;
	}
	public String getNAVPAGE() {
		return NAVPAGE;
	}
	public void setNAVPAGE(String nAVPAGE) {
		NAVPAGE = nAVPAGE;
	}
	public int getNAVINDEX() {
		return NAVINDEX;
	}
	public void setNAVINDEX(int nAVINDEX) {
		NAVINDEX = nAVINDEX;
	}
	@Override
	public String toString() {
		return "Nav [NAVID=" + NAVID + ", NAVNAME=" + NAVNAME + ", NAVPAGE=" + NAVPAGE + ", NAVINDEX=" + NAVINDEX + "]";
	}
	
	
	

}
