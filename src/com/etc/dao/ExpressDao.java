package com.etc.dao;

import java.util.List;

import com.etc.entity.Express;

public interface ExpressDao {
	//增加
	public boolean addExpress(Express express);
	
	//删除
	public boolean delExpress(int eid);
	
	//修改
	public boolean updateExpress(Express express);
	
	//查询
	public List<Express> queryAllExpress();

}
