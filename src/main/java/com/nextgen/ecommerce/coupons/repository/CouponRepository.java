package com.nextgen.ecommerce.coupons.repository;

import com.nextgen.ecommerce.coupons.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository class for managing coupon data.
 */
@Repository
public interface CouponRepository  extends JpaRepository<Coupon, Integer> {
}
