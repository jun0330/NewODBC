package com.etc.dao;

import java.util.List;

import com.etc.entity.FriendLink;

public interface FriendLinkDao {

	// 增加
	public boolean addFriendLink(FriendLink friendlink);

	// 删除
	public boolean delFriendLink(int flid);

	// 修改
	public boolean updateFriendLink(FriendLink friendlink);

	// 查询
	public List<FriendLink> queryAllFriendLink();

}
