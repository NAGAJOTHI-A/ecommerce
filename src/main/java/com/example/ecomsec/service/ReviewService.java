package com.example.ecomsec.service;

import java.util.List;

import com.example.ecomsec.entity.Reviews;

public interface ReviewService {

	Reviews add(Reviews review);
	List<Reviews> getProduct(Long productId);
	void delete(Long id);
	Double average(Long productId);
}
