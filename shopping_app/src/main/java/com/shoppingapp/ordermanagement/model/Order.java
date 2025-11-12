package com.shoppingapp.ordermanagement.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;
    private Long userId;
    private LocalDateTime orderDate;
    private Long addressId;
    private Long paymentId;
    private double unitPrice;
    private int numberOfItems;
    private double offer;
    private double deliveryCost;
    private double totalCost;
    private LocalDateTime deliveryDate;
    private Long statusId;

    // ✅ Add Getters and Setters for JSON serialization
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getProductId() { return productId; }
    public void setProductId(Long productId) { this.productId = productId; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public LocalDateTime getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDateTime orderDate) { this.orderDate = orderDate; }

    public Long getAddressId() { return addressId; }
    public void setAddressId(Long addressId) { this.addressId = addressId; }

    public Long getPaymentId() { return paymentId; }
    public void setPaymentId(Long paymentId) { this.paymentId = paymentId; }

    public double getUnitPrice() { return unitPrice; }
    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }

    public int getNumberOfItems() { return numberOfItems; }
    public void setNumberOfItems(int numberOfItems) { this.numberOfItems = numberOfItems; }

    public double getOffer() { return offer; }
    public void setOffer(double offer) { this.offer = offer; }

    public double getDeliveryCost() { return deliveryCost; }
    public void setDeliveryCost(double deliveryCost) { this.deliveryCost = deliveryCost; }

    public double getTotalCost() { return totalCost; }
    public void setTotalCost(double totalCost) { this.totalCost = totalCost; }

    public LocalDateTime getDeliveryDate() { return deliveryDate; }
    public void setDeliveryDate(LocalDateTime deliveryDate) { this.deliveryDate = deliveryDate; }

    public Long getStatusId() { return statusId; }
    public void setStatusId(Long statusId) { this.statusId = statusId; }
}
