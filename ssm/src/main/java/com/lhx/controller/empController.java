package com.lhx.controller;

import com.github.pagehelper.PageInfo;
import com.lhx.pojo.employ;
import com.lhx.service.empservice;
import com.lhx.service.impl.empserviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


//查询所有员工信息 /employ--get
//id查询员工信息 /employ/id--get
//跳转到添加页面 /to/add--get
//添加员工信息 /employ--post
//删除员工信息 /employ/id--delete
//修改员工信息 /employ/id--put
@Controller
public class empController {
    @Autowired
    private empservice empservice;
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        //查询所有的员工信息
        List<employ> list = empservice.getAllEmployee();
        //将员工信息在请求域中共享
//        model.addAttribute("list", list);
        model.addAttribute("list",list);
        //跳转到employee_list.html
        return "employee_list";
    }
    @RequestMapping(value = "/employee/page/{pageNum}", method = RequestMethod.GET)
    public String getAllEmployees(@PathVariable("pageNum") Integer pageNum, Model model){
        //获取员工分页信息
        PageInfo<employ> page=  empservice.getAllEmployees(pageNum);
        model.addAttribute("page",page);
        return "employee_list";
    }
}
