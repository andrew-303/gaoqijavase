package com.bjsxt.designpattern.singleton;

/**
 * 单例模式--静态内部类实现方式(也是一种懒加载)
 */
public class Singleton03 {

    //2.静态内部类
    private static class SingletonClassInner{
        private static final Singleton03 instance = new Singleton03();
    }

    //1.私有构造器
    private Singleton03(){}

    //3.提供给外部的全局方法
    public static Singleton03 getInstance() {
        return SingletonClassInner.instance;
    }
}
