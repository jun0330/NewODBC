package com.etc.dao;

import java.util.List;

import com.etc.entity.Nav;

public interface NavDao {
	public List<Nav> queryNav();
	public boolean checkNavByName(String navName);
	public boolean inserNav(Nav n);
}
