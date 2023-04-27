package com.student.mapper;

import com.student.pojo.student;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface selectMapper {
    //查询用户总记录数
    Integer selectcount();
    //根据id查用户信息为map集合
    Map<String,Object> selectmapid(@Param("id") Integer id);
   //查用户信息为map集合 id为key 将map集合内容放入一个大的map集合中
    //2 设置返回值为list
    @MapKey("id")
    Map<String,Object> selectmap();
    //3 模糊查询
    List selectmo(@Param("mahu") String mohu);
    //4 批量删除
    void deletemore(@Param("ids") String ids);
    //5添加并获取主键
    void addkey(student ss);
}
