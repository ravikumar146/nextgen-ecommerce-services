package com.nextgen.ecommerce.stores.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

/**
 * Store is an entity class that represents a store in the e-commerce system.
 * It can contain fields for store details such as name, location, and other relevant information.
 * This class can be annotated with JPA annotations to map it to a database table.
 */
@Entity
@Table(name = "stores")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(
        name = "Store",
        description = "Represents all available stores in the e-commerce system."
)
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Schema(description = "Store Name", example = "SRI RAMA TRADERS")
    private String name;

    @Column
    @Schema(description = "Store Description", example = "Sells chemical products")
    private String description;

    @Column
    @Schema(description = "Store Location", example = "AP")
    private String location;

    @Column
    @Schema(description = "Store Operating Hours", example = "MON-FRI")
    private String operatingHours;

    @Column
    @Schema(description = "Store Pin Code", example = "535501")
    private String pinCode;

    @Column
    @Schema(description = "Contact Info", example = "contact")
    private String contactInfo;

}
