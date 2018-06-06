package com.etc.entity;

public class FriendLink {
	
	private int FLID;
	private String FLNAME;
	private String FLURL;
	private int FLINDEX;
	
	
	
	public FriendLink() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FriendLink(String fLNAME, String fLURL, int fLINDEX) {
		super();
		FLNAME = fLNAME;
		FLURL = fLURL;
		FLINDEX = fLINDEX;
	}
	public FriendLink(int fLID, String fLNAME, String fLURL, int fLINDEX) {
		super();
		FLID = fLID;
		FLNAME = fLNAME;
		FLURL = fLURL;
		FLINDEX = fLINDEX;
	}
	public int getFLID() {
		return FLID;
	}
	public void setFLID(int fLID) {
		FLID = fLID;
	}
	public String getFLNAME() {
		return FLNAME;
	}
	public void setFLNAME(String fLNAME) {
		FLNAME = fLNAME;
	}
	public String getFLURL() {
		return FLURL;
	}
	public void setFLURL(String fLURL) {
		FLURL = fLURL;
	}
	public int getFLINDEX() {
		return FLINDEX;
	}
	public void setFLINDEX(int fLINDEX) {
		FLINDEX = fLINDEX;
	}
	@Override
	public String toString() {
		return "FriendLink [FLID=" + FLID + ", FLNAME=" + FLNAME + ", FLURL=" + FLURL + ", FLINDEX=" + FLINDEX + "]";
	}
	
	

}
