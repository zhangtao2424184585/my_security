package com.example.qiemian;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @Classname MyXieMian
 * @Description TODO
 * @Date 2020/9/7 17:33
 * @Created by zhangtao
 */
@Aspect
@Component
public class MyXieMian {
//    @Before("@annotation(MyZhujie)")
////    @Before("execution(* com.sharpcj.aopdemo.test1.IBuy.buy(..))")
//    public void xixi(){
//        System.out.println("111");
//    }
    @Around("@annotation(MyZhujie)")
    public Object heihei(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("1111");
        Object result =  pj.proceed();
        Object[] args = pj.getArgs();
        System.out.println("----------------------");
        for (Object arg : args) {
            System.out.println(arg);
        }
        System.out.println("----------------------");

        Signature signature = pj.getSignature();
//        Field[] declaredField = signature.getClass().getDeclaredFields();
//        for (Field field : declaredField) {
//            System.out.println(field.getName());
//        }
        System.out.println(pj+" :1111");
        Annotation[] annotations = signature.getDeclaringType().getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.toString());
        }
        System.out.println("22222");
        return result;
    }
}
