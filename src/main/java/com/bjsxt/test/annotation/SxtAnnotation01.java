package com.bjsxt.test.annotation;

import jdk.nashorn.internal.ir.annotations.Reference;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SxtAnnotation01 {

    /**
     * 注解中的属性
     * String表示属性的类型
     * username()表示属性的名称
     * default表示默认值
     */

    String username() default "";
    String[] schoolName() default {"北大，清华"};
    int age() default 0;
}
