package com.example.ecomsec.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.ecomsec.entity.Product;
import com.example.ecomsec.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	private final ProductService service;

	public ProductController(ProductService service) {
		super();
		this.service = service;
	}
	
	@PostMapping
	public Product  save(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	
	@GetMapping
	public List<Product> getAll(){
		return service.getAllProducts();
	}
	
	@GetMapping("/{id}")
	public Product getById(@PathVariable Long id) {
		return service.getProductById(id);
	}
	
	
	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable Long id) {
		service.deleteProduct(id);
		return "Product deleted Successfully";
	}
	
	@PutMapping("/{id}")
	public Product update(@PathVariable Long id,@RequestBody Product product) {
		return service.updateProduct(id, product);
	}
	
	
	@GetMapping("/search/{name}")
	public List<Product> searchByName(@PathVariable String name)
	{
		return service.searchByName(name);
	}
	
	@GetMapping("/category/{categoryId}")
	public List<Product> SearchByCategoryId(@PathVariable Long categoryId){
		return service.getByCategoryId(categoryId);
	}
}
