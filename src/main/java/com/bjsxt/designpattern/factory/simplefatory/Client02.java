package com.bjsxt.designpattern.factory.simplefatory;

/**
 * 有了工厂模式后，创建对象
 */
public class Client02 {
    public static void main(String[] args) {
        Car car = CarFactory.createCar("奥迪");
        car.run();

        Car car1 = CarFactory.createCar("宝马");
        car1.run();

//        Car car2 = CarFactory.createCar("比亚迪");
//        car2.run();

        Car audi = CarFactory2.createAudi();
        audi.run();
        Car baoma = CarFactory2.createBaoma();
        baoma.run();
    }
}
