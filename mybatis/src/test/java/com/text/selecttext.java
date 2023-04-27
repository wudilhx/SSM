package com.text;

import com.student.mapper.UserMapper;
import com.student.mapper.selectMapper;
import com.student.pojo.student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.sqlutils;

import java.util.List;
import java.util.Map;

public class selecttext {
    @Test
    public void selectcount(){
        SqlSession sqls = sqlutils.sqls();
        //获取 UserMapper的代理实现类对象
        selectMapper mapper = sqls.getMapper(selectMapper.class);
        Integer selectcount = mapper.selectcount();
        System.out.println(selectcount);

    }
    @Test
    public void selectmapid(){
        SqlSession sqls = sqlutils.sqls();
        //获取 UserMapper的代理实现类对象
        selectMapper mapper = sqls.getMapper(selectMapper.class);
        Map<String, Object> selectmapid = mapper.selectmapid(2);
        System.out.println(selectmapid);
    }
    @Test
    public void selectmap(){
        SqlSession sqls = sqlutils.sqls();
        //获取 UserMapper的代理实现类对象
        selectMapper mapper = sqls.getMapper(selectMapper.class);
        Map<String, Object> selectmap = mapper.selectmap();
        System.out.println(selectmap);
    }
    @Test
    public void selectmo(){
        SqlSession sqls = sqlutils.sqls();
        //获取 UserMapper的代理实现类对象
        selectMapper mapper = sqls.getMapper(selectMapper.class);
        List xu = mapper.selectmo("光");
        System.out.println(xu);
    }
    @Test
    public void deletemore(){
        SqlSession sqls = sqlutils.sqls();
        //获取 UserMapper的代理实现类对象
        selectMapper mapper = sqls.getMapper(selectMapper.class);
       mapper.deletemore("2,3");
    }
    @Test
    public void addkey(){
        SqlSession sqls = sqlutils.sqls();
        //获取 UserMapper的代理实现类对象
        selectMapper mapper = sqls.getMapper(selectMapper.class);
        student student = new student(null,"吉吉",11,"吃香蕉");
        mapper.addkey(student);
        System.out.println(student.getId());
    }
}
