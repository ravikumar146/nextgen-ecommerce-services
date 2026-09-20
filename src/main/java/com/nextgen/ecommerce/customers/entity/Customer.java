package com.nextgen.ecommerce.customers.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

/**
 * Entity class representing a customer in the e-commerce system.
 */
@Entity
@Table(name = "customers")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(
        name = "Customer",
        description = "Represents customer information in e-commerce system."
)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(
            description = "Unique identifier of the customer.",
            example = "1",
            accessMode = Schema.AccessMode.READ_ONLY
    )
    private Long id;

    @Column
    @Schema(
            description = "Name of the customer.",
            example = "John Doe"
    )
    private String name;

    @Column
    @Schema(
            description = "Email address of the customer.",
            example = "john.doe@example.com"
    )
    private String email;

    @Column
    @Schema(
            description = "Phone number of the customer.",
            example = "+1-555-1234"
    )
    private String phoneNumber;
}
