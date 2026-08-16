package com.redblack.extension.delivery_manager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeliveriesController {
    @GetMapping("/deliveries")
    public String overview(Model model) {
        return "deliveries";
    }
}
