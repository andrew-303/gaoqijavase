package com.bjsxt.designpattern.factory.simplefatory;

/**
 * 简单工厂模式2
 */
public class CarFactory2 {

    public static Car createAudi(){
        return new Audi();
    }

    public static Car createBaoma(){
        return new Baoma();
    }

}
