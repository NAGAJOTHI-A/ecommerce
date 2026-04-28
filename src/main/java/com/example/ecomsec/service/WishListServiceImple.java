package com.example.ecomsec.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ecomsec.entity.WishList;
import com.example.ecomsec.repository.ProductRepository;
import com.example.ecomsec.repository.UserRepository;
import com.example.ecomsec.repository.WishListRepository;

@Service
public class WishListServiceImple implements WishListService{

	private final WishListRepository wishListRepository;
	private final UserRepository userRepository;
	private final ProductRepository productRepository;
	public WishListServiceImple(WishListRepository wishListRepository, UserRepository userRepository,
			ProductRepository productRepository) {
		super();
		this.wishListRepository = wishListRepository;
		this.userRepository = userRepository;
		this.productRepository = productRepository;
	}
	
	@Override
	public WishList add(WishList wishList) {
		Long userId=wishList.getUser().getId();
		Long productId=wishList.getProduct().getId();
		
		if(!userRepository.existsById(userId)){
			throw new RuntimeException("User Not Found");
		}
		if(!productRepository.existsById(productId)) {
			throw new RuntimeException("Product Not Found");
		}
		return wishListRepository.save(wishList);
	}

	@Override
	public List<WishList> getWishListByUser(Long userId) {
		// TODO Auto-generated method stub
		return wishListRepository.findByUserId(userId);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		wishListRepository.deleteById(id);
	}
	
}
