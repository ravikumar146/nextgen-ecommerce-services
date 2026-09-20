package com.nextgen.ecommerce.coupons.controller;

import com.nextgen.ecommerce.coupons.entity.Coupon;
import com.nextgen.ecommerce.coupons.service.CouponService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * CouponController is responsible for handling HTTP requests related to coupons.
 * It provides endpoints for creating, retrieving, updating, and deleting coupons.
 */
@Tag(name = "Coupons", description = "APIs for managing coupons")
@RestController
@RequestMapping("/api/coupons")
public class CouponController {

    @Autowired
    private CouponService couponService;

    @Operation(summary = "Create a new coupon")
    @PostMapping("/create")
    public ResponseEntity<Coupon> createCoupon(@RequestBody Coupon coupon) {
        Coupon createdCoupon = couponService.createCoupon(coupon);
        return ResponseEntity.ok(createdCoupon);
    }

    @Operation(summary = "Get all coupons")
    @GetMapping("/list")
    public ResponseEntity<List<Coupon>> getAllCoupons() {
        List<Coupon> coupons = couponService.getAllCoupons();
        return ResponseEntity.ok(coupons);
    }
}
