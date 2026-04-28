package com.example.ecomsec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecomsec.entity.WishList;

public interface WishListRepository extends JpaRepository<WishList, Long>{

	List<WishList> findByUserId(Long userId);
}
