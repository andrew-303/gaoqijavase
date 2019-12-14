package com.bjsxt.designpattern.singleton;

/**
 * 单例模式--懒汉式[延迟加载]
 * 单例模式：一个类只有一个实例，且对外暴露一个创建该实例的全局访问点
 */
public class Singleton02 {

    //2.私有属性
    /**
     * 类初始化不初始化这个对象，延迟加载，真正用的时候再创建
     */
    private static Singleton02 instance;

    //1.私有的构造器，外部就无法直接创建对象
    private Singleton02(){}

    //3.调用生成类的实例
    /**
     * 方法同步，调用效率不高
     */
    public static synchronized Singleton02 getInstance() {
        if (instance == null) {
            instance = new Singleton02();
        }
        return instance;
    }

}
