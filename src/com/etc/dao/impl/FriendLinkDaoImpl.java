package com.etc.dao.impl;

import java.util.List;

import com.etc.dao.FriendLinkDao;
import com.etc.entity.FriendLink;
import com.etc.entity.Message;
import com.etc.util.DBUtil;

public class FriendLinkDaoImpl implements FriendLinkDao {

	// 增加
	@Override
	public boolean addFriendLink(FriendLink friendlink) {
		// TODO Auto-generated method stub
		return DBUtil.execute("insert into tab_friendlink values(?,?,?,?) ",friendlink.getFLID(),friendlink.getFLNAME(),friendlink.getFLURL(),friendlink.getFLINDEX()) > 0;
	}

	// 删除
	@Override
	public boolean delFriendLink(int flid) {
		// TODO Auto-generated method stub
		return DBUtil.execute("delete from tab_friendlink where flid=?", flid) > 0;
	}

	// 修改
	@Override
	public boolean updateFriendLink(FriendLink friendlink) {
		// TODO Auto-generated method stub
		return DBUtil.execute("update  tab_friendlink set FLNAME=?,FLURL=?, FLINDEX=? where FLID=?",
				friendlink.getFLNAME(), friendlink.getFLURL(), friendlink.getFLINDEX(),friendlink.getFLID()) > 0;
	}

	// 查询
	@Override
	public List<FriendLink> queryAllFriendLink() {
		// TODO Auto-generated method stub
		return (List<FriendLink>) DBUtil.select("select * from tab_friendlink", FriendLink.class);
	}

}
