package com.shoppingapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String name;

    // store category name directly for simplicity (no join needed for this small app)
    @Column(nullable=false)
    private String category;

    @Column(nullable=false)
    private double price;

    @Column(name = "total_items", nullable=false)
    private int totalItems;

    public Product() {}

    public Product(String name, String category, double price, int totalItems) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.totalItems = totalItems;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getTotalItems() { return totalItems; }
    public void setTotalItems(int totalItems) { this.totalItems = totalItems; }
}
