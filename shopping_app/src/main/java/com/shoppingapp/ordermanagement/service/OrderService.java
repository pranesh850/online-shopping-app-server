package com.shoppingapp.ordermanagement.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.shoppingapp.ordermanagement.model.Order;
import com.shoppingapp.ordermanagement.repository.OrderRepository;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }
}
