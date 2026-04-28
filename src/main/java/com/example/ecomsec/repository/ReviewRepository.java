package com.example.ecomsec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.ecomsec.entity.Reviews;

public interface ReviewRepository extends JpaRepository<Reviews, Long>{

	List<Reviews> findByProductId(Long productId);
	
	@Query("select avg(r.rating) from Reviews r where r.product.id=?1")
	Double getAverageRating(Long productId);
	
	
}
