package com.example.ecomsec.service;

import java.util.List;
import com.example.ecomsec.entity.Category;

public interface CategoryService {
 
	Category saveCategory(Category category);
	Category getCategoryById(Long id);
	List<Category> getAllCategories();
	void deleteCategory(Long id);
}
