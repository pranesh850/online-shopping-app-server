package com.shoppingapp.service;

import org.springframework.stereotype.Service;
import com.shoppingapp.repository.ProductRepository;
import com.shoppingapp.repository.CategoryRepository;
import com.shoppingapp.model.Category;

import java.util.List;

@Service
public class DashboardService {
    private final ProductRepository productRepo;
    private final CategoryRepository categoryRepo;

    public DashboardService(ProductRepository productRepo, CategoryRepository categoryRepo) {
        this.productRepo = productRepo;
        this.categoryRepo = categoryRepo;
    }

    public long getTotalProducts() {
        return productRepo.count();
    }

    public long getTotalItemsInStock() {
        return productRepo.findAll().stream().mapToLong(p -> p.getTotalItems()).sum();
    }

    public double getTotalValue() {
        return productRepo.findAll().stream().mapToDouble(p -> p.getPrice() * p.getTotalItems()).sum();
    }

    public List<Category> getCategories() {
        return categoryRepo.findAll();
    }
}
