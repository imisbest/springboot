package com.csw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("findAll")
    public String findAll() {
        System.out.println("findAll");
        return "index";
    }
}
