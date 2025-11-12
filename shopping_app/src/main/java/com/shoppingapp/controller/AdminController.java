package com.shoppingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.shoppingapp.repository.ProductRepository;

@Controller
public class AdminController {
    private final ProductRepository productRepo;

    public AdminController(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    @GetMapping("/admin")
    public String adminPage(Model model) {
        model.addAttribute("products", productRepo.findAll());
        return "admin";
    }
}
