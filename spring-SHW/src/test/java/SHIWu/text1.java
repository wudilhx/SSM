package SHIWu;

import com.lhx.springSh.controller.bookcontroller;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx-annoction.xml")
public class text1 {
    //声明式事务的配置步骤：
    //1 在spring配置文件中配置事务管理器
    //2 开启事务的注解驱动
    //在需要被事务管理的方法上，添加@Transactional注解，该方法就会被事务管理
    //标识在类上，则类中所有方法都会被事务管理
    @Autowired
    private bookcontroller bookcontroller;
    @Test
    public void cc(){
        bookcontroller.buybook(1,1);
    }
}
