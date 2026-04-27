package com.example.ecomsec.service;

import java.util.List;


import org.springframework.stereotype.Service;
import com.example.ecomsec.entity.Category;
import com.example.ecomsec.repository.CategoryRepository;

@Service
public class CategoryServiceImple implements CategoryService{

	
	private final CategoryRepository categoryRepository;
	public CategoryServiceImple(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}
	
	

	@Override
	public Category saveCategory(Category category) {
		// TODO Auto-generated method stub
		
		return categoryRepository.save(category);
	}

	@Override
	public Category getCategoryById(Long id) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("category not found")) ;
	}

	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public void deleteCategory(Long id) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(id);
	}

}
