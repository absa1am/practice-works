package com.dsinnovators.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TaskController {

    @RequestMapping(value = "/todo")
    public String todo() {
        return "todo";
    }

}
