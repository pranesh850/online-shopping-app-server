package com.shoppingapp.ordermanagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "order_status")
public class OrderStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

    // ✅ Getters and Setters
}
