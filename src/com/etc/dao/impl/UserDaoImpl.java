package com.etc.dao.impl;

import java.util.List;

import com.etc.dao.UserDao;
import com.etc.entity.User;

import com.etc.util.DBUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return DBUtil.execute("insert into tab_user values(?,?,?,?,?,?,?,?,sysdate)", user.getUSERID(),
				user.getUSERACCOUNT(),user.getUSERPWD(),user.getUSERNICKNAME(),user.getUSERSEX(),user.getUSERIDCARD(),
				user.getUSEREMAIL(),user.getUSERADDRESS())>0;
	}
	
	@Override
	public User queryUserByAccountAndPwd(String userAccount, String userPwd) {
		// TODO Auto-generated method stub
		List<User> list = (List<User>) DBUtil.select("select * from tab_user where userAccount=? and userPwd=?",
				User.class, userAccount, userPwd);

		if (list.size() > 0)
			return list.get(0);
		return null;
	}
	
	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return DBUtil.execute("update tab_user set userPwd=?,userNickName=?,userSex=?,userIdCard=?,userEmail=?,userAddress=? where userId=?",user.getUSERPWD(),user.getUSERNICKNAME(),user.getUSERSEX(),user.getUSERIDCARD()
				,user.getUSEREMAIL(),user.getUSERADDRESS(),user.getUSERID())>0;
	}
	}


