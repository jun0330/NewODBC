package com.etc.service.impl;

import com.etc.dao.AdminDao;
import com.etc.dao.impl.AdminDaoImpl;
import com.etc.entity.Admin;
import com.etc.service.AdminService;

public class AdminServiceImpl implements AdminService {
	AdminDao ad=new AdminDaoImpl();

	@Override
	public boolean AdminReg(Admin admin) {
		// TODO Auto-generated method stub
		return ad.addAdmin(admin);
	}

	@Override
	public Admin adminLogin(String adminAccount, String adminPwd) {
		// TODO Auto-generated method stub
		return ad.queryAdminByAccountAndPwd(adminAccount, adminPwd);
	}
	
@Override
public boolean updateGetAdmin(Admin admin) {
	// TODO Auto-generated method stub
	return ad.updateAdmin(admin);
}

}
