package com.shoppingapp.ordermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shoppingapp.ordermanagement.model.OrderStatus;

public interface OrderStatusRepository extends JpaRepository<OrderStatus, Long> {
}
