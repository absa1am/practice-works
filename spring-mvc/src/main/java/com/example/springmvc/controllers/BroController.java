package com.example.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BroController {

    @ResponseBody
    @RequestMapping("/cricketbat")
    public String cricketBat() {
        return "Ok! Here is your cricket bat.";
    }

}
