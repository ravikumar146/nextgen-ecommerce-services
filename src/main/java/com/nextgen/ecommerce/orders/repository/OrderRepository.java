package com.nextgen.ecommerce.orders.repository;

import com.nextgen.ecommerce.orders.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *  Repository interface for managing Order entities in the ecommerce application.
 */

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    // Additional custom query methods can be defined here if needed
}
