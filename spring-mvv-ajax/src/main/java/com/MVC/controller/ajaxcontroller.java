package com.MVC.controller;

import com.MVC.pojo.person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//@RequestBody获取json格式的请求参数
//1、@RequestBody：将请求体中的内容和控制器方法的形参进行绑定
// * 2、使用@RequestBody注解将json格式的请求参数转换为java对象
// * a>导入jackson的依赖
// * b>在SpringMVC的配置文件中设置<mvc:annotation-driven />
// * c>在处理请求的控制器方法的形参位置，直接设置json格式的请求参数要转换的java类型的形参，使用@RequestBody注解标识即可
// * 3、@ResponseBody：将所标识的控制器方法的返回值作为响应报文的响应体响应到浏览器
// * 4、使用@ResponseBody注解响应浏览器json格式的数据
// * a>导入jackson的依赖
// * b>在SpringMVC的配置文件中设置<mvc:annotation-driven />
// * c>将需要转换为json字符串的java对象直接作为控制器方法的返回值，
// 使用@ResponseBody注解标识控制器方法
// * 就可以将java对象直接转换为json字符串，并响应到浏览器
//         *
//         * 常用的Java对象转换为json的结果：
//         * 实体类-->json对象
//         * map-->json对象
//         * list-->json数组
@Controller
public class ajaxcontroller {
    @RequestMapping("/hello")
    public String aa(){
        return "succc";
    }
    @RequestMapping("/ajax/text")
    public void cc(Integer id, HttpServletResponse response) throws IOException {
        System.out.println(id);
        response.getWriter().write("hello");
    }
    @RequestMapping("/ajaxJSON/text")
    public void JSON(Integer id, @RequestBody person person, HttpServletResponse response) throws IOException {
        System.out.println(person);
        response.getWriter().write("hello");
    }
    @RequestMapping("/ajaxJSON/XY")
    @ResponseBody
    public person JSONXY(Integer id,  HttpServletResponse response) throws IOException {
        person lhx = new person("lhx", "123456");
       return lhx;
    }
    @RequestMapping("/ajaxJSON/map")
    @ResponseBody
    public Map JSONmap(Integer id,  HttpServletResponse response) throws IOException {
            Map<String, String> map=new HashMap<>();
            map.put("cc","ok");
            map.put("ss","yes");
            map.put("tt","no");
        return map;
    }

}
