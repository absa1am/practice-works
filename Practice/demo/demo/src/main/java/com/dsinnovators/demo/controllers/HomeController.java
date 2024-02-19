package com.dsinnovators.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        Map<Integer, String> lang = new HashMap<>();

        lang.put(1, "C");
        lang.put(2, "C++");
        lang.put(3, "Java");

        for (var l : lang.entrySet()) {
            System.out.println(l.getKey() + ": " + l.getValue());
        }

        model.addAttribute("languages", lang);

        return "index";
    }

}
