package com.shoppingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.shoppingapp.service.DashboardService;

@Controller
public class DashboardController {
    private final DashboardService dashboardService;

    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("totalProducts", dashboardService.getTotalProducts());
        model.addAttribute("categories", dashboardService.getCategories());
        model.addAttribute("totalItems", dashboardService.getTotalItemsInStock());
        model.addAttribute("totalValue", dashboardService.getTotalValue());
        return "dashboard";
    }
}
