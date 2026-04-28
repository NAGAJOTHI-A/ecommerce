package com.example.ecomsec.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ecomsec.entity.Reviews;
import com.example.ecomsec.repository.ReviewRepository;

@Service
public class ReviewServiceImple implements ReviewService{

	
	private final ReviewRepository repository;
	
	
	
	public ReviewServiceImple(ReviewRepository repository) {
		super();
		this.repository = repository;
	}

	
	@Override
	public Reviews add(Reviews review) {
		// TODO Auto-generated method stub
		return repository.save(review);
	}

	@Override
	public List<Reviews> getProduct(Long productId) {
		// TODO Auto-generated method stub
		return repository.findByProductId(productId);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Double average(Long productId) {
		// TODO Auto-generated method stub
		return repository.getAverageRating(productId);
	}

}
