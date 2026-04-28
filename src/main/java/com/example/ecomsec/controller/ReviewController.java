package com.example.ecomsec.controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecomsec.entity.Reviews;
import com.example.ecomsec.service.ReviewService;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

	private final ReviewService service;

	public ReviewController(ReviewService service) {
		super();
		this.service = service;
	}
	
	@PostMapping
	public Reviews add(@RequestBody Reviews review) {
		return service.add(review);
	}
	
	@GetMapping("/{productId}")
	public List<Reviews> get(@PathVariable Long productId){
		return service.getProduct(productId);
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		service.delete(id);
		return "Review Deleted Successfully";
	}
	
	@GetMapping("/average/{productId}")
	public Double average(@PathVariable Long productId) {
		return service.average(productId);
	}
	
	
}
