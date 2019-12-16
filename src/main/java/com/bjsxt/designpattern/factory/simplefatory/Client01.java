package com.bjsxt.designpattern.factory.simplefatory;

/**
 * 在没有工厂模式之前，创建对象
 */
public class Client01 {

    public static void main(String[] args) {
        Car car1 = new Audi();
        Car car2 = new Baoma();

        car1.run();
        car2.run();
    }
}
