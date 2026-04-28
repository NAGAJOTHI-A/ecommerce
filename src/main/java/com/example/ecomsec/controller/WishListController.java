package com.example.ecomsec.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecomsec.entity.WishList;
import com.example.ecomsec.service.WishListService;

@RestController
@RequestMapping("/api/wishlist")
public class WishListController {

	private final WishListService service;

	public WishListController(WishListService service) {
		super();
		this.service = service;
	}
	
	
	@PostMapping
	public WishList add(@RequestBody WishList wishList) {
		return service.add(wishList);
	}
	
	@GetMapping("/{userId}")
	public List<WishList> getWishListByUid(@PathVariable Long userId){
		return service.getWishListByUser(userId);
	}
	
	@DeleteMapping("/{id}")
	public String remove(@PathVariable Long id) {
		service.delete(id);
		return "Removed from WishList";
	}
}
