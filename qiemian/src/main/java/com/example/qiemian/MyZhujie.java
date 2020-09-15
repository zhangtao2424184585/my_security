package com.example.qiemian;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Classname MyZhujie
 * @Description TODO
 * @Date 2020/9/7 17:33
 * @Created by zhangtao
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyZhujie {
}
