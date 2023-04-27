package Zhujie_text;

import com.lhx.spring.dao.userdao;
import com.lhx.spring.service.impl.userserviceimpl;
import com.lhx.spring.service.userservice;
import com.lhx.spring.web.userweb;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.tools.serialver.resources.serialver;

//@Component：将类标识为普通组件
// @Controller：将类标识为控制层组件
// @Service：将类标识为业务层组件
// @Repository：将类标识为持久层组件
//一.自动装配功能
// 只需要@Autowired注解
//1 放在成员变量上 2放在set方法上 3 放在有参构造器上
//@Autowired注解原理
//a 注解赋值不需要get set方法 无参构造器
//b 通过bytype形式，在ioc容器中通过类型匹配某个bean形成的
//c 如果有多个bean，会自动转换为byname的方式
//d 此时bean的id都对不上可以用@Qualifier
//通过注解的value值，指定某个bean的id，将这个bean为属性赋值

public class annotationtext {
    @Test
    public void annotation(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-ioc-annotationZJ.xml");
       userweb bean = ioc.getBean(userweb.class);
       bean.ss();
        System.out.println(bean);
        //userservice.class 可以用接口类型（接口唯一实现类），也可以是父类类型
        userservice bean1 = ioc.getBean(userserviceimpl.class);
        System.out.println(bean1);
        userdao bean2 = ioc.getBean(userdao.class);
        bean2.usersave();
    }
}
