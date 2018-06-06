package com.etc.dao.impl;

import java.util.List;

import com.etc.dao.MessageDao;
import com.etc.entity.FriendLink;
import com.etc.entity.Message;
import com.etc.util.DBUtil;

public class MessageDaoImpl implements MessageDao {

	@Override
	public boolean addMessage(Message message) {
		// TODO Auto-generated method stub
		return DBUtil.execute("insert into tab_message values(?,?,?,?,?)",message.getMESSAGEID(),message.getUSERACCOUNT(),message.getMESSAGETITLE(),message.getMESSAGECONTENT(),message.getMESSAGEDATE())>0;
	}

	@Override
	public boolean delMessage(int messageid) {
		// TODO Auto-generated method stub
		return DBUtil.execute("delete from tab_message where messageid=?", messageid)>0;
	}

	@Override
	public boolean updateMessage(Message messgae) {
		// TODO Auto-generated method stub
		return DBUtil.execute("update tab_message set MESSAGETITLE=?,MESSAGECONTENT=? where messageid=?",
				messgae.getMESSAGETITLE(),messgae.getMESSAGECONTENT(),messgae.getMESSAGEID())>0;
	}

	@Override
	public List<Message> queryAllMessage() {
		// TODO Auto-generated method stub
		return (List<Message>) DBUtil.select("select * from tab_message",Message.class);
	}

}
