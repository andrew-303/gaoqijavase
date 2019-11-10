package com.bjsxt.test.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SxtAnnotation02 {

    //在只有一个属性时，属性名可以设置为value，这样在使用此注解时，参数名就可以不写
    String value();
}
