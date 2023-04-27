package com.lhx.aod;

import jdk.internal.vm.annotation.Contended;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.prefs.Preferences;

//切面类
//一：在切面中，需要通过指定的注解将方法标识为通知方法
//二：@Order(1)设置切面类的优先级数值越小越先执行
//@Order(1)
@Component
@Aspect//将当前组件标识为切面
public class LoggerAspect {
    //*代表所有   ..代表参数列表什么参数类型都行
//  三， 切入点表达式 public int com.lhx.aod.calculatorimpl.add(int,int)
   //四 ， @Pointcut公共的切入点表达式
    @Pointcut("execution(* com.lhx.aod.*.*(..))")
    public void Pointcut(){}
//1
    @Before("Pointcut()")
    public void before(JoinPoint joinPoint){
        //1 获取连接点所对应的签名信息（public void before）
        Signature signature = joinPoint.getSignature();
        //2 获取方法参数 Object类型获取的是地址
        Object[] args = joinPoint.getArgs();
        System.out.println("前置通知"+signature.getName()+"\t"+ Arrays.toString(args));
    }
    //2
    //后置通知 在目标函数的finallary里输出
    @After("Pointcut()")
    public void after(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        System.out.println("后置通知"+signature.getName());
    }
    //3 返回通知
    //在返回后调用
    //获取返回值 在@AfterReturning注释里配置returning = "result"
    //方法参数里可以设置接收目标对象的返回值的参数
    @AfterReturning(value = "Pointcut()",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        System.out.println("返回通知"+"\t"+result);
    }
    //4 异常通知
    //方法参数里可以设置接收目标对象方法的异常
    @AfterThrowing(value = "Pointcut()",throwing = "ex")
    public void afterthrow(Throwable ex){
        System.out.println("异常通知"+"\t"+ex);
    }
    //5 环绕通知 目标对象的方法不在执行由joinPoint.proceed()代替
    @Around("Pointcut()")
    public Object aroundmether(ProceedingJoinPoint joinPoint){
        Object proceed=null;
        try {
            System.out.println("环绕前置通知");
            //表示目标对象方法的执行
             proceed = joinPoint.proceed();
            System.out.println(proceed);
            System.out.println("环绕返回通知");
        } catch (Throwable e) {
            System.out.println("环绕异常通知"+e);
        }finally {
            System.out.println("环绕后置通知");
        }
 return proceed;
    }
}
