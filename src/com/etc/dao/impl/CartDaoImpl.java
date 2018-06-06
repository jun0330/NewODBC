package com.etc.dao.impl;

import java.util.List;

import com.etc.dao.CartDao;
import com.etc.entity.Cart;
import com.etc.util.DBUtil;

public class CartDaoImpl implements CartDao {

	@Override
	// ²éÑ¯ËùÓĞCart
	public List<Cart> queryCart() {
		// TODO Auto-generated method stub
		return (List<Cart>) DBUtil.select("select * from CART", Cart.class);
	}

	@Override
	public boolean delCartByCartId(int CARTID) {
		// TODO Auto-generated method stub
		return DBUtil.execute("delete from CART where CARTID=?", CARTID) > 0;
	}

}
