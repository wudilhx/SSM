package com.student.mapper;

import com.student.pojo.student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int cc();
    void delete();
    List select();
    student selectname(String name);
    //登录验证
    student denglu(String name,Integer age);
    //添加
    void add(student ss);
    //登录验证2
    student selectword(@Param("username") String name,@Param("age") Integer age);
}
