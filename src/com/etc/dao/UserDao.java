package com.etc.dao;

import com.etc.entity.User;


public interface UserDao {
	
	public boolean addUser(User user);
	
	// 根据账户名和密码查询用户信息
	public User queryUserByAccountAndPwd(String userAccount, String userPwd);
	
	public boolean updateUser(User user);

}
