package com.nextgen.ecommerce.products.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Product entity representing a product.
 */
@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Schema(
        name = "Product",
        description = "Represents a product available in the system."
)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(
            description = "Unique identifier of the product.",
            example = "1",
            accessMode = Schema.AccessMode.READ_ONLY
    )
    private Long id;

    @Column(nullable = false, length = 150)
    @Schema(
            description = "Name of the pharmaceutical product.",
            example = "Paracetamol 500mg",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private String name;

    @Column(length = 2000)
    @Schema(
            description = "Detailed description of the product.",
            example = "Used for the temporary relief of mild to moderate pain and fever."
    )
    private String description;

    @Column(nullable = false, length = 100)
    @Schema(
            description = "Category to which the product belongs.",
            example = "Pain Relief",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private String category;

    @Column(nullable = false, length = 50)
    @Schema(
            description = "Type or dosage form of the product.",
            example = "Tablet",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private String productType;

    @Column(nullable = false, precision = 10, scale = 2)
    @Schema(
            description = "Original price of the product.",
            example = "120.00",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private BigDecimal price;

    @Column(precision = 10, scale = 2)
    @Schema(
            description = "Discounted price of the product. Null when no discount is applied.",
            example = "99.99",
            nullable = true
    )
    private BigDecimal discountPrice;

    @Column(nullable = false)
    @Schema(
            description = "Number of units currently available in stock.",
            example = "150",
            requiredMode = Schema.RequiredMode.REQUIRED,
            minimum = "0"
    )
    private Integer stockQuantity;

    @Column(nullable = false)
    @Builder.Default
    @Schema(
            description = "Indicates whether the product requires a prescription before purchase.",
            example = "false",
            defaultValue = "false",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private Boolean requiresPrescription = false;

    @Column(length = 150)
    @Schema(
            description = "Name of the company that manufactures the product.",
            example = "Sun Pharmaceutical Industries Ltd."
    )
    private String manufacturer;

    @Column(length = 100)
    @Schema(
            description = "Brand name of the product.",
            example = "Crocin"
    )
    private String brand;

    @Column(length = 100)
    @Schema(
            description = "Dosage strength of the product.",
            example = "500 mg"
    )
    private String dosage;

    @Column(length = 100)
    @Schema(
            description = "Pharmaceutical form of the product.",
            example = "Tablet"
    )
    private String form;

    @Column(length = 100)
    @Schema(
            description = "Package size or quantity.",
            example = "10 tablets"
    )
    private String packSize;

    @Column(length = 500)
    @Schema(
            description = "Active ingredients or chemical composition of the product.",
            example = "Paracetamol 500 mg"
    )
    private String composition;

    @Column(length = 500)
    @Schema(
            description = "URL of the product image.",
            example = "https://example.com/images/paracetamol-500.jpg"
    )
    private String imageUrl;

    @Column(nullable = false, updatable = false)
    @Schema(
            description = "Date and time when the product was created.",
            example = "2026-09-18T10:30:00",
            accessMode = Schema.AccessMode.READ_ONLY
    )
    private LocalDateTime createdAt;

    @Column(nullable = false)
    @Schema(
            description = "Date and time when the product was last updated.",
            example = "2026-09-18T14:45:00",
            accessMode = Schema.AccessMode.READ_ONLY
    )
    private LocalDateTime updatedAt;

    /**
     * Automatically sets creation and update timestamps.
     */
    @PrePersist
    protected void onCreate() {
        LocalDateTime now = LocalDateTime.now();
        this.createdAt = now;
        this.updatedAt = now;
    }

    /**
     * Automatically updates the modification timestamp.
     */
    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
}