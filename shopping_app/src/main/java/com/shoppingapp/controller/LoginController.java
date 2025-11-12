package com.shoppingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping({"/", "/login"})
    public String showLoginPage() {
        return "login";
    }

    // Dummy login: accept any non-empty username/password
    @PostMapping("/do-login")
    public String doLogin(String username, String password) {
        if (username != null && !username.isEmpty() && password != null && !password.isEmpty()) {
            return "redirect:/dashboard";
        }
        return "login";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login";
    }
}
