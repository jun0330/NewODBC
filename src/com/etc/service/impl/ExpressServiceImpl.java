package com.etc.service.impl;

import java.util.List;

import com.etc.dao.ExpressDao;
import com.etc.dao.impl.ExpressDaoImp;
import com.etc.entity.Express;
import com.etc.service.ExpressService;

public class ExpressServiceImpl implements ExpressService {
	
	ExpressDao ed = new ExpressDaoImp();

	@Override
	public boolean addExpress(Express express) {
		// TODO Auto-generated method stub
		return ed.addExpress(express);
	}

	@Override
	public boolean delExpressById(int eid) {
		// TODO Auto-generated method stub
		return ed.delExpress(eid);
	}

	@Override
	public boolean updateExpress(Express express) {
		// TODO Auto-generated method stub
		return ed.updateExpress(express);
	}

	@Override
	public List<Express> queryAllExpress() {
		// TODO Auto-generated method stub
		return ed.queryAllExpress();
	}

}
