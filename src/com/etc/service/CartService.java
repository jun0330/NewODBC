package com.etc.service;

import java.util.List;

import com.etc.entity.Cart;

public interface CartService {
	public List<Cart> getCarts();
	public boolean delCart(int CARTID);
}
