package com.nextgen.ecommerce.cartitems.repository;

import com.nextgen.ecommerce.cartitems.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Cart entity.
 */
@Repository
public interface CartRepository extends JpaRepository<CartItem, Long> {

    /**
     * Finds a cart item by the customer ID.
     *
     * @param customerId The ID of the customer.
     * @return An Optional containing the cart item if found, or empty if not found.
     */
    java.util.Optional<CartItem> findByCustomerId(Long customerId);
}
