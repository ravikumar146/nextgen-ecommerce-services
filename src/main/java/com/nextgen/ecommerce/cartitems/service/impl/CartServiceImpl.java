package com.nextgen.ecommerce.cartitems.service.impl;

import com.nextgen.ecommerce.cartitems.entity.CartItem;
import com.nextgen.ecommerce.cartitems.repository.CartRepository;
import com.nextgen.ecommerce.cartitems.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementation of the CartService interface for managing cart-related operations.
 */
@Service
public class CartServiceImpl  implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Override
    public CartItem getCartByCustomerId(Long customerId) {
        // Implementation for retrieving cart details by customer ID
        return cartRepository.findByCustomerId(customerId)
                .orElseThrow(() -> new RuntimeException("Cart not found for customer ID: " + customerId));
    }

    @Override
    public String addItemToCart(Long customerId, CartItem cartItem) {
        // Implementation for adding an item to the cart for a specific customer
        cartRepository.save(cartItem);
        return "Item added to cart successfully";
    }
}
