package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long> {

}
