package com.text;

import com.student.mapper.UserMapper;
import com.student.pojo.student;
import com.student.pojo.user;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import utils.sqlutils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class usertext {
    @Test
    public void aa() throws IOException {
        //获取核心配置文件的输入流
        InputStream resou = Resources.getResourceAsStream("mybatis-config.xml");
        //获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sql = new SqlSessionFactoryBuilder();
        //获取SqlSessionFactory对象
        SqlSessionFactory build = sql.build(resou);
        //获取sql的会话对象SqlSession，是mybatis提供操作数据库的对象 true自动提交
        SqlSession sqlSession = build.openSession();
        //获取 UserMapper的代理实现类对象
        UserMapper map = sqlSession.getMapper(UserMapper.class);
        //调用接口方法实现添加信息功能
        int cc = map.cc();
        System.out.println(cc);
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void zz(){
        SqlSession sqls = sqlutils.sqls();
        //获取 UserMapper的代理实现类对象
        UserMapper map = sqls.getMapper(UserMapper.class);
        //调用接口方法实现添加信息功能
         map.delete();
        sqls.close();
    }
    @Test
    public void ss(){
        SqlSession sqls = sqlutils.sqls();
        //获取 UserMapper的代理实现类对象
        UserMapper map = sqls.getMapper(UserMapper.class);
        List select = map.select();
        for (Object o :select) {
            System.out.println(o);
        }

    }
    @Test
    public void selectname(){
        SqlSession sqls = sqlutils.sqls();
        //获取 UserMapper的代理实现类对象
        UserMapper map = sqls.getMapper(UserMapper.class);
        student xy = map.selectname("熊二");
        System.out.println(xy);
    }
    @Test
    public void denglu(){
        SqlSession sqls = sqlutils.sqls();
        //获取 UserMapper的代理实现类对象
        UserMapper map = sqls.getMapper(UserMapper.class);
        student xy = map.denglu("熊二", 10);
        System.out.println(xy);
    }
    @Test
    public void add(){
        SqlSession sqls = sqlutils.sqls();
        //获取 UserMapper的代理实现类对象
        UserMapper map = sqls.getMapper(UserMapper.class);
         map.add(new student(null, "米兰", 12, "play"));
        sqls.close();
    }
    @Test
    public void selectword(){
        SqlSession sqls = sqlutils.sqls();
        //获取 UserMapper的代理实现类对象
        UserMapper map = sqls.getMapper(UserMapper.class);
        student cc = map.selectword("熊二", 10);
        System.out.println(cc);
    }
}
