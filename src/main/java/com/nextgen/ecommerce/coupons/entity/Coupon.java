package com.nextgen.ecommerce.coupons.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

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
@Schema(
        name = "Coupon",
        description = "Represents all available or expired coupons in e-commerce system."
)
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    @Schema(description = "Coupon Name", example = "SUMMER26")
    private String code;

    @Column(nullable = false)
    @Schema(description = "Coupon discount rate", example = "0.20%")
    private Double discountRate;

    @Column(nullable = false)
    @Schema(description = "Coupon Expiration Date", example = "2026-12-30")
    private String expirationDate;

    @Column(nullable = false)
    @Schema(description = "Coupon Active or Inactive", example = "true")
    private Boolean isActive;
}
