package com.MVC.text;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class textT {
    @RequestMapping("/aa")
    public String cc(Model model){
       model.addAttribute("cc","ss");
       return "aa";
    }
}
