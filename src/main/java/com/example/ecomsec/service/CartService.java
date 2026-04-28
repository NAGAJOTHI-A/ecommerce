package com.example.ecomsec.service;

import java.util.List;

import com.example.ecomsec.entity.Cart;

public interface CartService {

	
	Cart addToCart(Cart cart);
	List<Cart> getCartByUser(Long userId);
	void removeItem(Long cartId);
	void clearCart(Long userId);
}

