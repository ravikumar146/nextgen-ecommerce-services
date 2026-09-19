package com.nextgen.ecommerce.orders.service;

import com.nextgen.ecommerce.orders.entity.Order;

import java.util.List;

/**
 * Service interface for managing orders.
 */
public interface OrderService {

    List<Order> getAllOrders();

    Order getOrderById(Long id);

    Order createOrder(Order order);
}
