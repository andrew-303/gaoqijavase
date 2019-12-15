package com.bjsxt.designpattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 单例模式--懒汉式[避免反射和反序列化漏洞]
 */
public class Singleton05 implements Serializable {

    //2.私有属性
    /**
     * 类初始化不初始化这个对象，延迟加载，真正用的时候再创建
     */
    private static Singleton05 instance;

    //1.私有的构造器，外部就无法直接创建对象
    private Singleton05(){
        if(instance != null) {
            throw new RuntimeException();
        }
    }

    //3.调用生成类的实例
    /**
     * 方法同步，调用效率不高
     */
    public static synchronized Singleton05 getInstance() {
        if (instance == null) {
            instance = new Singleton05();
        }
        return instance;
    }

    //反序列化时
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
