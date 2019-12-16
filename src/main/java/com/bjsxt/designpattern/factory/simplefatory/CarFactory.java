package com.bjsxt.designpattern.factory.simplefatory;

/**
 * 简单工厂模式
 */
public class CarFactory {
    public static Car createCar(String type) {
        if("奥迪".equals(type)) {
            return new Audi();
        } else if ("宝马".equals(type)) {
            return new Baoma();
        }else {
            return null;
        }
    }
}
