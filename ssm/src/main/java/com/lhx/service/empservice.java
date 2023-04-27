package com.lhx.service;

import com.github.pagehelper.PageInfo;
import com.lhx.pojo.employ;

import java.util.List;

public interface empservice {
    List<employ> getAllEmployee();

    PageInfo<employ> getAllEmployees(Integer pageNum);
}
