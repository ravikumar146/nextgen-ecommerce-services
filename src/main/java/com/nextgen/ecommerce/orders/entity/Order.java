package com.nextgen.ecommerce.orders.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

/**
 * Represents an order in the e-commerce system.
 */
@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Schema(
        name = "Order",
        description = "Represents an order placed by a customer in the e-commerce system."
)
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(
            description = "Unique identifier of the order.",
            example = "1",
            accessMode = Schema.AccessMode.READ_ONLY
    )
    private Long id;

    @Column (nullable = false)
    @Schema(
            description = "Total amount of the order.",
            example = "99.99",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private Double totalAmount;

    @Column (nullable = false)
    @Schema(
            description = "Status of the order.",
            example = "PENDING",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private String status;

    @Column (nullable = false)
    @Schema(
            description = "Date and time when the order was placed.",
            example = "2023-01-01T12:00:00Z",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private LocalDateTime orderDate;

    @Column (nullable = false)
    @Schema(
            description = "Customer ID associated with the order.",
            example = "123",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private Long customerId;

}
