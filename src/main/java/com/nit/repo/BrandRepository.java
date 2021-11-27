package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long> {

}
