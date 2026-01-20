package com.gmt.PMP.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String showLoginPage() {
        return "Login"; // login.html
    }
//    @PostMapping("/save")
//    public String saveUser(Model m,@ModelAttribute User user) {
//
//    }
    @PostMapping("/login")
    public String login(
            @RequestParam String username,
            @RequestParam String password,
            Model model) {
        return "Dashboard";
    }
    
}
