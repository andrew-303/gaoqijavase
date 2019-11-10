package com.bjsxt.test.annotation2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义数据库表中字段的注解
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SxtFiled {

    String cloumnName();    //字段名
    String type();  //字段类型
    int length();   //字段长度
}
