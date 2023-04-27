package com.lhx.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lhx.mapper.Empmapper;
import com.lhx.pojo.employ;
import com.lhx.service.empservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class empserviceimpl implements empservice {
    @Autowired
private Empmapper empmapper;
    @Override
    public List<employ> getAllEmployee() {
        return empmapper.getallemp();
    }

    @Override
    public PageInfo<employ> getAllEmployees(Integer pageNum) {
       //开启分页
        PageHelper.startPage(pageNum,3);
        //查询所有员工
              List<employ> list=  empmapper.getallemp();
        //获取分页相关数据
        PageInfo<employ> pagey = new PageInfo<>(list,2);
        return pagey;
    }
}
