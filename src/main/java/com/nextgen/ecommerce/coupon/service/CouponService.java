package com.nextgen.ecommerce.coupon.service;

import com.nextgen.ecommerce.coupon.entity.Coupon;
import org.springframework.web.bind.annotation.RequestBody;

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
