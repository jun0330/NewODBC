package com.etc.dao.impl;

import java.util.List;

import com.etc.dao.NavDao;
import com.etc.entity.Nav;
import com.etc.util.DBUtil;

public class NavDaoImpl implements NavDao {

	@Override
	public List<Nav> queryNav() {
		return (List<Nav>)DBUtil.select("select * from tab_nav order by navindex",Nav.class);
	}
	@Override
	public boolean checkNavByName(String navName) {
		List<Nav> navList=(List<Nav>)DBUtil.select("select * from tab_nav where navname=?", Nav.class, navName);
		if(navList.isEmpty()) 
			return false;
		return true;
	}
	@Override
	public boolean inserNav(Nav n) {
		return DBUtil.execute("insert into tab_nav values(seq_nav.nextval,?,?,?)",n.getNAVNAME(),n.getNAVPAGE(),n.getNAVINDEX())>0;	
	}
}
