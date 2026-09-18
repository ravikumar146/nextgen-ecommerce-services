package com.medicare.pharma.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String name;

    @Column(length = 2000)
    private String description;

    @Column(nullable = false, length = 100)
    private String category;

    @Column(nullable = false, length = 50)
    private String productType;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(precision = 10, scale = 2)
    private BigDecimal discountPrice;

    @Column(nullable = false)
    private Integer stockQuantity;

    @Column(nullable = false)
    @Builder.Default
    private Boolean requiresPrescription = false;

    @Column(length = 150)
    private String manufacturer;

    @Column(length = 100)
    private String brand;

    @Column(length = 100)
    private String dosage;

    @Column(length = 100)
    private String form;

    @Column(length = 100)
    private String packSize;

    @Column(length = 500)
    private String composition;

    @Column(length = 500)
    private String imageUrl;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;
}
