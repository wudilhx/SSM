package com.lhx.spring.web;

import com.lhx.spring.service.impl.userserviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class userweb {
    @Autowired
    private userserviceimpl user;
public userweb(){}

    public userserviceimpl getUser() {
        return user;
    }

    public void setUser(userserviceimpl user) {
        this.user = user;
    }
public void ss(){
        user.usersave();
}
}
