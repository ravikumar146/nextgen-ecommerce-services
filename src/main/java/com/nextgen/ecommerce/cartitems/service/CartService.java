package com.nextgen.ecommerce.cartitems.service;

import com.nextgen.ecommerce.cartitems.entity.CartItem;

/**
 * Service interface for managing cart-related operations.
 */
public interface CartService {

    /**
     * Retrieves the cart details for a specific customer.
     *
     * @param customerId The ID of the customer.
     * @return The cart details for the specified customer.
     */
    CartItem getCartByCustomerId(Long customerId);

    /**
     * Adds an item to the cart for a specific customer.
     *
     * @param customerId The ID of the customer.
     * @param cartItem   The item to be added to the cart.
     */
    String addItemToCart(Long customerId, CartItem cartItem);
}
