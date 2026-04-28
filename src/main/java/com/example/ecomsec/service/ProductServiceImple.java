package com.example.ecomsec.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ecomsec.entity.Product;
import com.example.ecomsec.repository.ProductRepository;

@Service
public class ProductServiceImple implements ProductService{
	
	private final ProductRepository productRepository;
	
	

	public ProductServiceImple(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Long id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).orElseThrow(()-> new RuntimeException("Product not found"));
	}

	@Override
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product updateProduct(Long id, Product product) {
		Product dbProduct=productRepository.findById(id).orElseThrow(()-> new RuntimeException("Product not found"));
		// TODO Auto-generated method stub
		dbProduct.setName(product.getName());
		dbProduct.setDescription(product.getDescription());
		dbProduct.setPrice(product.getPrice());
		dbProduct.setStock(product.getStock());
		dbProduct.setImageUrl(product.getImageUrl());
		dbProduct.setCategory(product.getCategory());
		
		return productRepository.save(dbProduct);
	}

	@Override
	public List<Product> searchByName(String name) {
		// TODO Auto-generated method stub
		return productRepository.findByName(name);
		
	}

	@Override
	public List<Product> getByCategoryId(Long categoryId) {
		// TODO Auto-generated method stub
		return productRepository.findByCategoryId(categoryId);
	}

}
