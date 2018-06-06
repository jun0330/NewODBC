package com.etc.service.impl;

import java.util.List;

import com.etc.dao.FriendLinkDao;
import com.etc.dao.impl.FriendLinkDaoImpl;
import com.etc.entity.FriendLink;
import com.etc.service.FrinendLinkService;

public class FriendLinkServiceImpl implements FrinendLinkService {
	
	FriendLinkDao FLD= new FriendLinkDaoImpl();

	@Override
	public boolean addFriendLink(FriendLink friendlink) {
		// TODO Auto-generated method stub
		return FLD.addFriendLink(friendlink);
	}

	

	@Override
	public boolean delFriendLink(int eid) {
		// TODO Auto-generated method stub
		return FLD.delFriendLink(eid);
	}

	@Override
	public boolean updateFriendLink(FriendLink friendlink) {
		// TODO Auto-generated method stub
		return FLD.updateFriendLink(friendlink);
	}

	@Override
	public List<FriendLink> getAllFriendLink() {
		// TODO Auto-generated method stub
		return FLD.queryAllFriendLink();
	}

}
