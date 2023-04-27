package com.lhx.spring.dao.imel;

import com.lhx.spring.dao.userdao;
import com.lhx.spring.service.userservice;
import org.springframework.stereotype.Repository;
@Repository
public class userdaoimpl implements userdao{
@Override
    public void usersave() {
        System.out.println("添加成功");
    }
}
