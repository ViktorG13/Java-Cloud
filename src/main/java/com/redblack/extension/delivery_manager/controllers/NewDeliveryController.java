package com.redblack.extension.delivery_manager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewDeliveryController {
    
    @GetMapping("/new-delivery")
    public String newDelivery(Model model)
    {
        return "delivery-form";
    }
}
