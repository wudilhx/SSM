package javatext;

import com.lhx.spring.pojo.banji;
import com.lhx.spring.pojo.student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text02 {
    @Test
    public void studen() {
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取ioc容器中的bean
        student bean = ioc.getBean("studentone", student.class);
        System.out.println(bean);
    }

    @Test
    public void studens() {
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取ioc容器中的bean
        student studenttwo = ioc.getBean("studentthree", student.class);
        System.out.println(studenttwo);
    }

    @Test
    public void jihe() {
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取ioc容器中的bean
        banji banjitwo = ioc.getBean("banjitwo", banji.class);
        System.out.println(banjitwo);
    }

    @Test
    public void ppp() {
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取ioc容器中的bean
        student studentfive = ioc.getBean("studentfive", student.class);
        System.out.println(studentfive);
    }
}