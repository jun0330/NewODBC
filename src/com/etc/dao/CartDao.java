package com.etc.dao;

import java.util.List;

import com.etc.entity.Cart;

public interface CartDao {
	
	public List<Cart> queryCart();
	
	public boolean delCartByCartId(int CARTID);
	
	
}
