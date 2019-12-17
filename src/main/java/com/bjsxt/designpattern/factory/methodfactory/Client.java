package com.bjsxt.designpattern.factory.methodfactory;

public class Client {
    public static void main(String[] args) {
        Car car1 = new AudiFactory().creatCar();
        Car car2 = new BaomaFactory().creatCar();

        car1.run();
        car2.run();
    }
}
