package com.MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//查询所有用户信息 --/user--get
//根据用户id查询信息--/user/1--get
//添加用户信息--/user--post
//删除用户信息--/user/1--delete
//修改用户信息--/user/1--put
/*注意：当前浏览器只能发送get和post请求
    若要发送put和delete的请求需要在web.xml文件配置一个过滤器HiddenHttpMethodFilter
    配置过滤器之后需要满足俩个条件：
    1,当前请求必须为post
    2,当前请求必须传输请求参数_method,_method的值才是最终的请求方式
* */
@Controller
public class restcontroller {
//    @GetMapping
@RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getAlluser(){
    System.out.println("查询所有用户信息");
    return "success";
}
//@GetMapping
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String getiduser(@PathVariable Integer id){
        System.out.println("根据id查询用户信息"+id);
        return "success";
    }
    @PutMapping("/user/{id}")
//    @RequestMapping(value = "/user/{id}",method = RequestMethod.PUT)
    public String getidupdate(@PathVariable Integer id){
        System.out.println("根据id修改用户信息"+id);
        return "success";
    }
}
