package com.bjsxt.test.annotation;

@SxtAnnotation01
public class Demo01 {

    @SxtAnnotation01(username = "biyl",schoolName = {"浙大"} ,age = 35)
    public void test1() {

    }

    @SxtAnnotation02("123456")
    public void test2(){

    }
}
