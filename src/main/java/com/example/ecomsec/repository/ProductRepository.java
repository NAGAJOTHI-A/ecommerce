package com.example.ecomsec.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecomsec.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	List<Product> findByName(String name);
	List<Product> findByCategoryId(Long categoryId);
}
