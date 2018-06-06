package com.etc.dao.impl;

import java.util.List;

import com.etc.dao.AdminDao;
import com.etc.entity.Admin;
import com.etc.util.DBUtil;

public class AdminDaoImpl implements AdminDao {

	@Override
	public boolean addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return DBUtil.execute("insert into tab_admin values(?,?,?,?)", admin.getADMINID(),
				admin.getADMINACCOUNT(),admin.getADMINPWD(),admin.getADMINNICKNAME()
			)>0;
	}
	
	@Override
	public Admin queryAdminByAccountAndPwd(String adminAccount, String adminPwd) {
		// TODO Auto-generated method stub
		List<Admin> list = (List<Admin>) DBUtil.select("select * from tab_admin where adminAccount=? and adminPwd=?",
				Admin.class, adminAccount, adminPwd);

		if (list.size() > 0)
			return list.get(0);
		return null;
	}
	
	@Override
	public boolean updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return DBUtil.execute("update tab_admin set adminPwd=?,adminNickName=? where adminId=?",admin.getADMINPWD(),admin.getADMINNICKNAME(),admin.getADMINID()
				)>0;
	}
	}


