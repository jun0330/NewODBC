package com.etc.service;

import com.etc.entity.Admin;

public interface AdminService {
	
	public boolean AdminReg(Admin admin);
	
	public Admin adminLogin(String adminAccount, String adminPwd);
	
	public boolean updateGetAdmin(Admin admin);

}
