package com.lhx.aod;

import org.springframework.stereotype.Component;

@Component
public class calculatorimpl implements Calculator{
    @Override
    public int add(int i, int a) {
        int result=i+a;
        System.out.println("方法内部:"+result);
        return result;
    }

    @Override
    public int jian(int a, int b) {
        int result=a-b;
        System.out.println("方法内部:"+result);
        return result;
    }

    @Override
    public int chu(int a, int b) {
        int result=a/b;
        System.out.println("方法内部:"+result);
        return result;
    }
}
