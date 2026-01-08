package com.gmt.PMP;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorld {
    @GetMapping("/login")
    public String showLoginPage() {
        return "Login"; // login.html
    }

    @PostMapping("/login")
    public String login(
            @RequestParam String username,
            @RequestParam String password,
            Model model) {

        // Dummy validation (for learning)
        if (username.equals("admin") && password.equals("1234")) {
            model.addAttribute("username", username);
            return "login";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
}
