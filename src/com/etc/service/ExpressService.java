package com.etc.service;

import java.util.List;

import com.etc.entity.Express;

public interface ExpressService {
	
	//添加快递service
	public boolean addExpress(Express express);
	
	//删除快递的service
	public boolean delExpressById(int eid);

	//修改快递名称的service
	public boolean updateExpress(Express express);
	
	//查询快递的service
	public List<Express> queryAllExpress();
}
