package javatext;

import com.lhx.spring.pojo.Hellowword;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text01 {
    @Test
    public void xx(){
        //获取IOC容器
        ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取ioc容器中的bean
        Hellowword bean =(Hellowword) ioc.getBean("helloword");
        bean.cc();
    }
}
