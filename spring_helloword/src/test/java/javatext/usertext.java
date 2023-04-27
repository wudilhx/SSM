package javatext;

import com.lhx.spring.web.userweb;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class usertext {
    @Test
    public void user(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-autowire.xml");
        userweb bean = ioc.getBean(userweb.class);
         bean.ss();
    }
}
