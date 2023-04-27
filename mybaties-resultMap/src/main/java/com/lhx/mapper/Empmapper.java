package com.lhx.mapper;

import com.lhx.pojo.dmp;
import com.lhx.pojo.emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Empmapper {
    int add(emp aa);
   List select();
   //多对一对象 1对多集合
    emp selectid(@Param("id") Integer id);
    //分布查询
    //查询员工以及部门信息
    emp getempselectidsone(@Param("id") Integer id);
}
