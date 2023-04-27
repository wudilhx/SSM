package com.MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@RequestMapping标识注解位置
//@RequestMapping标识一个类：设置映射请求的请求路径的初始信息
//@RequestMapping标识一个方法：设置映射请求请求路径的具体信息
//@RequestMapping参数
//1,value:属性是数组型，浏览器发送请求匹配属性里任一值
//2,method:设置请求方式  是数组类型
//3,在@RequestMapping的基础上派生注解：@GetMapping Post Put Delete
//4,parm:判断请求的参数
// parm 表示必须携带parm参数,!parm 表示一定不带
// parm=value表示当前所匹配请求的请求参数中必须携带parm参数且值为value
//5,Headers：请求头信息
//6,@RequestMapping("/a?c/text")
//？：表示任意的单个字符 不包括？
//*：表示任意的0个或多个字符    不包括/和?
//**：表示任意层数的任意目录/**/
//7,@RequestMapping使用
//传统 /user?id=1          rest:/user/1
//通过{**}的方式获取路径中的数据
//通过@PathVariable注解，将占位符所标识的值和控制器方法的形参进行绑定
//转发页面
@Controller
public class hellowcontroller {
//    @RequestMapping("/")// /代表返回给服务器的绝对路径http://localhost:8080/spring_mvc/
    //调用protal方法
//    public String protal(){
//        return "index";
//    }

    //http://localhost:8080/spring_mvc/hello或/abc都匹配这个页面
    //value值数组类型
    @RequestMapping(value = {"/hello","/abc"},
                     method = {RequestMethod.POST,RequestMethod.GET},
                     headers = {"referer"}
//                 params = {"username","password=123"}
             )
    public String cc(){
        return "success";
    }
    //获取路径中的占位符
    @RequestMapping("/hello/text/{id}/{username}")
    public String ss(@PathVariable Integer id,@PathVariable String username){
        System.out.println(id+username);
        return "success";
    }
}
