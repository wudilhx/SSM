package com.MVC.controller;

import com.MVC.pojo.user;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

//像域对象共享数据:
//1,通过 ModelAndView向请求域共享数据
//2,使用model向请求域共享数据
//使用modelMap向请求域共享数据
//map
@Controller
public class textScopController {
@RequestMapping("/text/mav")
    public ModelAndView textmav(){
    //model:像请求域中共享数据
    //view:设计逻辑视图实行页面跳转
    ModelAndView mav = new ModelAndView();
    //像请求域中共享数据
    mav.addObject("mav","hello,你好");
    //设计逻辑视图
    mav.setViewName("success");
    return mav;
}

@RequestMapping("/text/model")
    public String models(Model model){
       model.addAttribute("mav","hello");
       return "success";
}
    @RequestMapping("/text/modelmap")
    public String modelsmap(ModelMap modelMap){
    //类型全是：org.springframework.validation.support.BindingAwareModelMap
        System.out.println(modelMap.getClass().getName());
        modelMap.addAttribute("mav","hello");
        return "success";
    }
     @RequestMapping("/text/session")
    public String sessions(HttpSession session){
         user user = new user(1,"xiao","123456");
         session.setAttribute("cc",user);
         return "success";
     }
    @RequestMapping("/text/application")
    public String applications(HttpSession session){
        ServletContext servletContext = session.getServletContext();
        servletContext.setAttribute("ss","cc");
        return "success";
    }
    //转发
    @RequestMapping("/text/thymeleaf")
    public String thyme(){
    return "success";
    }
    @RequestMapping("/text/forward")
    public String forward(){
        return "forward:/cas.jsp";
    }
    //重定向
    @RequestMapping("/text/redirect")
    public String redirects(){
    return "redirect:/text/model";
    }
}
