package com.etc.service;

import java.util.List;

import com.etc.entity.Nav;

public interface NavService {
	public List<Nav> getNav();
	public boolean checkNavName(String navName);
	public boolean addNav(Nav n);
}
