package javatext;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class waibulei_text {
    //连接外部类德鲁伊数据库连接池
    @Test
    public void cc() throws SQLException {
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-datasource.xml");
        DruidDataSource bean = ioc.getBean(DruidDataSource.class);
        System.out.println(bean.getConnection());
    }
}
