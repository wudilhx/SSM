package com.lhx.mapper;

import com.lhx.pojo.dmp;
import org.apache.ibatis.annotations.Param;

public interface dmpmapper {
    //返回值与映射文件empmapper <association property="dmp"相对应

    dmp getdmpidtwo(@Param("id") Integer id);
    //一对多
    //查询部门的员工  部门
    dmp getdmpid(@Param("id") Integer id);
}
