package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
