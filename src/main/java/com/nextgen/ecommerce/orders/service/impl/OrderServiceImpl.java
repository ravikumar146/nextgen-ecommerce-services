package com.nextgen.ecommerce.orders.service.impl;

import com.nextgen.ecommerce.orders.entity.Order;
import com.nextgen.ecommerce.orders.repository.OrderRepository;
import com.nextgen.ecommerce.orders.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of the OrderService interface for managing orders.
 */

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Order not found with ID: " + id)
                );
    }

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }
}
