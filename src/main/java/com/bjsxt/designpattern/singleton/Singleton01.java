package com.bjsxt.designpattern.singleton;

/**
 * 单例模式--饿汉式
 * 单例模式：一个类只有一个实例，且对外暴露一个创建该实例的全局访问点
 */
public class Singleton01 {
    //2.私有化对象属性
    /**
     * 类初始化时，立即加载这个对象（没有延时加载的优势）
     * 加载类时，天然是线程安全的
     */
    private static Singleton01 instance = new Singleton01();

    //1.构造器私有化，外部就无法直接创建对象
    private Singleton01(){
    }

    //3.提供外部访问的入口
    /**
     * 因为方法没有同步，调用效率就会比较高
     */
    public static Singleton01 getInstance() {
        return instance;
    }
}
