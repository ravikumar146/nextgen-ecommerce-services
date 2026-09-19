package com.nextgen.ecommerce.orders.controller;


import com.nextgen.ecommerce.orders.entity.Order;
import com.nextgen.ecommerce.orders.service.OrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(
        name = "Orders",
        description = "APIs for managing ecommerce orders"
)
@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @Operation(summary = "Get all orders")
    @GetMapping("/list")
    public ResponseEntity<List<Order>> getAllOrders() {
        return ResponseEntity.ok(orderService.getAllOrders());
    }

    @Operation(summary = "Get order details by ID")
    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
        return ResponseEntity.ok(orderService.getOrderById(id));
    }

    @Operation(summary = "Create a new order")
    @PostMapping("/create")
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        return ResponseEntity.status(201).body(orderService.createOrder(order));
    }

}
