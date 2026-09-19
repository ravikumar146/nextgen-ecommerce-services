package com.nextgen.ecommerce.cart.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Represents an item in the shopping cart.
 */
@Entity
@Table(name = "cart_items")
@Getter
@Schema
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CartItem {

    @Id
    @GeneratedValue(
            generator = "cart_item_id_seq"
    )
    @Schema(description = "Unique identifier for the cart item", example = "1")
    private Long id;

    @Column(name = "customer_id", nullable = false)
    @Schema(description = "Identifier of the customer who owns the cart item", example = "123")
    private Long customerId;

    @Column(name = "product_ids", nullable = false)
    @Schema(description = "Identifiers of the products in the cart item", example = "456")
    private List<Long> productIds;
}
