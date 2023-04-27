package com.lhx.spring.service.impl;

import com.lhx.spring.dao.userdao;
import com.lhx.spring.service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//为注解扫描后的bean设置的id，没设置为类名的小驼峰的形式即首字母小写
@Service("service")
public class userserviceimpl implements userservice {
    @Autowired
    private userdao ssy;

    public userdao getSs() {
        return ssy;
    }

    public void setSs(userdao ss) {
        this.ssy = ssy;
    }

    public void  usersave(){
        ssy.usersave();
    }
}
