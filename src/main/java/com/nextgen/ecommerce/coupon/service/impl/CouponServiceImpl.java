package com.nextgen.ecommerce.coupon.service.impl;

import com.nextgen.ecommerce.coupon.entity.Coupon;
import com.nextgen.ecommerce.coupon.repository.CouponRepository;
import com.nextgen.ecommerce.coupon.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CouponServiceImpl is an implementation of the CouponService interface.
 * It provides the business logic for managing coupons in the e-commerce system.
 */
@Service
public class CouponServiceImpl implements CouponService {

    @Autowired
    private CouponRepository couponRepository;

    @Override
    public Coupon createCoupon(Coupon coupon) {
       return couponRepository.save(coupon);
    }

    @Override
    public java.util.List<Coupon> getAllCoupons() {
        return couponRepository.findAll();
    }
}
