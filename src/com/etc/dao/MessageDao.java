package com.etc.dao;

import java.util.List;

import com.etc.entity.Message;

public interface MessageDao {

	// 增加
	public boolean addMessage(Message message);

	// 删除
	public boolean delMessage(int messageid);

	// 修改
	public boolean updateMessage(Message messgae);

	// 查询
	public List<Message> queryAllMessage();

}
