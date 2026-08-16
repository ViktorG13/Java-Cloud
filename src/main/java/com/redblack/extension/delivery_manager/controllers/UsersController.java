package com.redblack.extension.delivery_manager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {
    
    @GetMapping("/users")
    public String users(Model model) {
        model.addAttribute("title", "Users");
        return "users";
    }
}
