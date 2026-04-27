package com.example.ecomsec.service;

import java.util.List;

import com.example.ecomsec.entity.Product;

public interface ProductService {

	Product saveProduct(Product product);
	List<Product> getAllProducts();
	Product getProductById(Long id);
	void deleteProduct(Long id);
	Product updateProduct(Long id,Product product);
	List<Product> searchByName(String name);
	List<Product> getByCategoryId(Long categoryId);
}
