package com.shoppingapp.ordermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shoppingapp.ordermanagement.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
