package com.nextgen.ecommerce.coupon.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

/**
 * Coupon is an entity class that represents a coupon in the e-commerce system.
 * It contains fields for coupon details such as code, discount amount, expiration date, etc.
 * This class can be annotated with JPA annotations to map it to a database table.
 */
@Entity
@Table(name = "coupons")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String code;

    @Column(nullable = false)
    private Double discountRate;

    @Column(nullable = false)
    private String expirationDate;

    @Column(nullable = false)
    private Boolean isActive;
}
