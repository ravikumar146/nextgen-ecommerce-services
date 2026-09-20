package com.nextgen.ecommerce.coupons.service;

import com.nextgen.ecommerce.coupons.entity.Coupon;

import java.util.List;

/**
 * CouponService is an interface that defines the contract for coupon-related business logic.
 * Implementations of this interface will provide methods for creating, retrieving, updating,
 * and deleting coupons, as well as any other coupon-related operations.
 */
public interface CouponService {

    Coupon createCoupon(Coupon coupon);

    List<Coupon> getAllCoupons();
}
