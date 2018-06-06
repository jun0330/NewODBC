package com.etc.service;

import java.util.List;

import com.etc.entity.Message;

public interface MessageService {

	// 增加
	public boolean addMessage(Message message);

	// 删除
	public boolean delMessage(int messageid);

	// 修改
	public boolean updateMessage(Message message);

	// 查询
	public List<Message> getAllMessage();

}
