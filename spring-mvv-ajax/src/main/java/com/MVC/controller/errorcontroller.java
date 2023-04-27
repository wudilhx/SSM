package com.MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class errorcontroller {
    @RequestMapping("/errors")
    public String CC(){
        System.out.println(1/0);
        return "success";
    }
}
