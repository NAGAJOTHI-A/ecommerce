package com.example.ecomsec.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ecomsec.entity.Cart;
import com.example.ecomsec.repository.CartRepository;

@Service
public class CartServiceImple implements CartService{

	private final CartRepository repository;
	
	
	
	public CartServiceImple(CartRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Cart addToCart(Cart cart) {
		// TODO Auto-generated method stub
		return repository.save(cart);
	}

	@Override
	public List<Cart> getCartByUser(Long userId) {
		// TODO Auto-generated method stub
		return repository.findByUserId(userId);
	}

	@Override
	public void removeItem(Long cartId) {
		// TODO Auto-generated method stub
		repository.deleteById(cartId);
	}

	@Override
	public void clearCart(Long userId) {
		// TODO Auto-generated method stub
		repository.deleteByUserId(userId);
	}

}
