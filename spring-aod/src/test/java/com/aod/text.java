package com.aod;

import com.lhx.aod.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text {
    @Test
    public void cc(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("aop.xml");
       //应该获取代理对象
        //在这里ioc无法获取目标对象
        Calculator bean = ioc.getBean(Calculator.class);
         bean.chu(1, 2);
    }
}
