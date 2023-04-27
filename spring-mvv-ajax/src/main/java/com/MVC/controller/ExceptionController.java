package com.MVC.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
    //设置异常信息
    @ExceptionHandler(ArithmeticException.class)
    public String handleException(Throwable ex, Model model){
         model.addAttribute("ex",ex);
         return "error";
    }
}
