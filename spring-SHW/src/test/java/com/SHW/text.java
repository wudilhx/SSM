package com.SHW;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//指定当前测试类在spring测试环境中执行，此时可以通过注入的方式直接获取IOC容器中的bean
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-jdbc.xml")//设置spring测试环境的配置文件
public class text {
    @Autowired
private JdbcTemplate jdbcTemplate;
    @Test
    public void ssc(){
        String sql="insert into student values(null,?,?,?)";
        jdbcTemplate.update(sql,"毛毛",10,"play");
    }
}
