package com.etc.entity;

public class Img {
	private int IMGID;
	private String IMGNAME;
	private String IMGURL;
	
	public Img() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Img(int iMGID, String iMGNAME, String iMGURL) {
		super();
		IMGID = iMGID;
		IMGNAME = iMGNAME;
		IMGURL = iMGURL;
	}
	public Img(String iMGNAME, String iMGURL) {
		super();
		IMGNAME = iMGNAME;
		IMGURL = iMGURL;
	}
	public int getIMGID() {
		return IMGID;
	}
	public void setIMGID(int iMGID) {
		IMGID = iMGID;
	}
	public String getIMGNAME() {
		return IMGNAME;
	}
	public void setIMGNAME(String iMGNAME) {
		IMGNAME = iMGNAME;
	}
	public String getIMGURL() {
		return IMGURL;
	}
	public void setIMGURL(String iMGURL) {
		IMGURL = iMGURL;
	}
	@Override
	public String toString() {
		return "Img [IMGID=" + IMGID + ", IMGNAME=" + IMGNAME + ", IMGURL=" + IMGURL + "]";
	}
	
	
	

}
