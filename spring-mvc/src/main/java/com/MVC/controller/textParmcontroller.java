package com.MVC.controller;

import com.MVC.pojo.user;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

//1,通过在servletAPI来获取
//直接在形参位置设置HttpServletRequest
//2,通过控制器的方法的形参获取
//在控制器的参数位置设置形参和请求参数的名字一致即可
//@RequestParam注解参数
// (value = "userName",required = false,defaultValue = "hello")
//在形参和请求参数名字不一样时设置 value值和请求参数名字一样
//required默认为true value所对应请求参数必须传输   defaultValue给参数设置默认值
//3, @RequestHeader("referer")获取请求头信息
//@CookieValue("JSESSIONID")获取cookie信息
//4,设置参数为实体类形参 实体类形参属性与请求参数名字一致,就可以通过通过实体类类型
//的形参获取请求参数
@Controller
public class textParmcontroller {
@RequestMapping("/hello/user")
    public String login(HttpServletRequest request){
    HttpSession session = request.getSession();
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    System.out.println(username+password);
    return "success";
}
//获取表单属性
@RequestMapping("/user")
    public String logintwo(@RequestParam(value = "userName") String username,
                           String password,
                       @RequestHeader("referer") String referer,
                       @CookieValue("JSESSIONID") String jsessionId
){
    System.out.println(referer);
    System.out.println(jsessionId);
    System.out.println(username+password);
    return "success";
}
@RequestMapping("/user/pojo")
    public String pojo(user user){
    System.out.println(user);
    return "success";
}
}
