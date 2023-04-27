package com.lhx.spring.factory;

import com.lhx.spring.pojo.user;
import org.springframework.beans.factory.FactoryBean;

//FactoryBean 是一个接口
// isSingleton 是否单例
//getObject():这个方法将一个对象交给ioc容器管理
//getObjectType():设置所提供对象的类型
//当把FactoryBean的实现类配置成bean时，会将getObject()中的对象交给ioc管理
public class UserfactoryBean implements FactoryBean<user> {
    @Override
    public user getObject() throws Exception {
        return new user();
    }

    @Override
    public Class<?> getObjectType() {
        return user.class;
    }
}
