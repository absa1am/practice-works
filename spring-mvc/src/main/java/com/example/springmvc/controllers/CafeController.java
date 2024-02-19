package com.example.springmvc.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CafeController {

    @RequestMapping("/cafe")
    public String index(Model model) {
        // Sending data to view (jsp page)
        String name = "Abdus Salam";

        model.addAttribute("name", name);

        return "cafe/index";
    }

    @RequestMapping("/order")
    public String order(HttpServletRequest request, Model model) {
        // Sending data to view (jsp page)
        model.addAttribute("order", request.getParameter("foodType"));

        return "cafe/order";
    }

}
