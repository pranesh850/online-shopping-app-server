package com.shoppingapp.ordermanagement.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.shoppingapp.ordermanagement.model.Order;
import com.shoppingapp.ordermanagement.service.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }
}
