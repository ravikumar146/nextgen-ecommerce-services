package com.nextgen.ecommerce.cartitems.controller;

import com.nextgen.ecommerce.cartitems.entity.CartItem;
import com.nextgen.ecommerce.cartitems.service.CartService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Controller class for handling cart-related operations.
 */
@Tag(
        name = "Cart Items",
        description = "Controller for managing cart-related operations"
)
@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @Operation(summary = "Get cart details by customer ID")
    @GetMapping("/{customerId}")
    public CartItem getCartByCustomerId(@PathVariable Long customerId) {
        return cartService.getCartByCustomerId(customerId);
    }

    @Operation(summary = "Add item to cart")
    @PostMapping("/{customerId}/items")
    public String addItemToCart(@PathVariable Long customerId, @RequestBody CartItem cartItem) {
        return cartService.addItemToCart(customerId, cartItem);
    }
}
