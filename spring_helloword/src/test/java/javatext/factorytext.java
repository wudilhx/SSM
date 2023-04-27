package javatext;

import com.lhx.spring.pojo.user;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class factorytext {
    @Test
    public void factory(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-factory.xml");
        user bean = ioc.getBean(user.class);
        System.out.println(bean);
    }
}
