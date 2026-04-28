package com.example.ecomsec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import com.example.ecomsec.entity.Cart;

import jakarta.transaction.Transactional;

public interface CartRepository extends JpaRepository<Cart, Long>{

	List<Cart> findByUserId(Long userId);
	@Modifying
	
	void deleteByUserId(Long userId);
}
