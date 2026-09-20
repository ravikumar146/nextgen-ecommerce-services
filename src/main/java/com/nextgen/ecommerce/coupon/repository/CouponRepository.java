package com.nextgen.ecommerce.coupon.repository;

import com.nextgen.ecommerce.coupon.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository class for managing coupon data.
 */
@Repository
public interface CouponRepository  extends JpaRepository<Coupon, Integer> {
}
