package com.lhx.mapper;

import com.lhx.pojo.emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface dynamicmapper {

    List<emp> getempanddynamic(emp emp);
    //批量添加
    void getadds(@Param("adds") List<emp> emps);
    //批量删除
    void getdeletes(@Param("deletes") Integer[]emps);
}
