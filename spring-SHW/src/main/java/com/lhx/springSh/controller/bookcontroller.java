package com.lhx.springSh.controller;

import com.lhx.springSh.service.impl.bookservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class bookcontroller {
    @Autowired
    private bookservices bookservices;
    public void buybook(Integer userid,Integer bookid){
        bookservices.buybook(userid,bookid);
    }
}
