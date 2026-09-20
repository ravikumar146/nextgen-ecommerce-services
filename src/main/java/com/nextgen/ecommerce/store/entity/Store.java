package com.nextgen.ecommerce.store.entity;

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
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    @Column
    private String location;

    @Column
    private String operatingHours;

    @Column
    private String pinCode;

    @Column
    private String contactInfo;

}
