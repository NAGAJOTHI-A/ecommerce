package com.example.ecomsec.service;

import java.util.List;

import com.example.ecomsec.entity.WishList;

public interface WishListService {

	WishList add(WishList wishList);
	
	List<WishList> getWishListByUser(Long userId);  
	
	void delete(Long id);
	
}
