package com.etc.service;

import java.util.List;

import com.etc.entity.FriendLink;

public interface FrinendLinkService {
	
	//增加
	public boolean addFriendLink(FriendLink friendlink);
	
	
	//删除
	public boolean delFriendLink(int eid);
	
	
	//修改
	public boolean updateFriendLink(FriendLink friendlink);
	
	
	
	//查询
	public List<FriendLink> getAllFriendLink();
}
