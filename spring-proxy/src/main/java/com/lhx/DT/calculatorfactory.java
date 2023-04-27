package com.lhx.DT;

import sun.jvm.hotspot.oops.Array;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

//目标对象与代理类对象实现相同的接口
public class calculatorfactory {
    private Object tager;

    public calculatorfactory(Object tager) {
        this.tager = tager;
    }
    public Object getProxy(){
//         ClassLoader loader:指定加载动态生成的代理类的类加载器
//          Class [] interfaces:获取目标对象实现的所有接口的class对象的数组
//          InvocationHandler h:设置代理类中的抽象方法如何重写
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?>[] interfaces = tager.getClass().getInterfaces();
        InvocationHandler h=new InvocationHandler() {
            //代理对象对象的方法 重写
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    System.out.println(Arrays.toString(args));
                    //proxy 代理对象  method 要执行的方法   args要执行的方法的参数列表
                    result = method.invoke(tager, args);
                    System.out.println(method.getName()+result);
                } catch (InvocationTargetException e) {
                    System.out.println("3"+e);
                }finally {
                    System.out.println("4");
                }
                return result;

            }
        };
        //通过这个方法创建动态代理类
        return Proxy.newProxyInstance(classLoader,interfaces,h);
    }
}
