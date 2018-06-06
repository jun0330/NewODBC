package com.etc.dao;

import com.etc.entity.Admin;

public interface AdminDao {
	
	public boolean addAdmin(Admin admin);
	
	// 根据账户名和密码查询管理员信息
	public Admin queryAdminByAccountAndPwd(String adminAccount, String adminPwd);
	
	public boolean updateAdmin(Admin admin);

}
