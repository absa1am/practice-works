package com.example.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {

    @ResponseBody
    @RequestMapping("/makeup")
    public String makeup() {
        return "Ok! Here is your makeup.";
    }

    @ResponseBody
    @RequestMapping("/books")
    public String getBooks() {
        return "Ok! Here is your books.";
    }

}
