package com.etc.service.impl;

import java.util.List;

import com.etc.dao.CartDao;
import com.etc.dao.impl.CartDaoImpl;
import com.etc.entity.Cart;
import com.etc.service.CartService;

public class CartServiceImpl implements CartService {

	CartDao cd = new CartDaoImpl();
	
	@Override
	public List<Cart> getCarts() {
		// TODO Auto-generated method stub
		return cd.queryCart();
	}

	@Override
	public boolean delCart(int CARTID) {
		// TODO Auto-generated method stub
		return cd.delCartByCartId(CARTID);
	}

}
