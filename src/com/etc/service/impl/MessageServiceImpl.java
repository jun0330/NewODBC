package com.etc.service.impl;

import java.util.List;

import com.etc.dao.MessageDao;
import com.etc.dao.impl.MessageDaoImpl;
import com.etc.entity.Message;
import com.etc.service.MessageService;

public class MessageServiceImpl implements MessageService {
	
	MessageDao md = new MessageDaoImpl();

	@Override
	public boolean addMessage(Message message) {
		// TODO Auto-generated method stub
		return md.addMessage(message);
	}

	@Override
	public boolean delMessage(int messageid) {
		// TODO Auto-generated method stub
		return md.delMessage(messageid);
	}

	@Override
	public boolean updateMessage(Message message) {
		// TODO Auto-generated method stub
		return md.updateMessage(message);
	}

	@Override
	public List<Message> getAllMessage() {
		// TODO Auto-generated method stub
		return md.queryAllMessage();
	}

}
