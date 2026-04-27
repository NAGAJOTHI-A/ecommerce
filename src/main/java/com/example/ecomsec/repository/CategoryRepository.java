package com.example.ecomsec.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecomsec.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
