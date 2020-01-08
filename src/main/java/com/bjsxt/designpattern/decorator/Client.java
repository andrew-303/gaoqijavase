package com.bjsxt.designpattern.decorator;

public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        System.out.println("增加功能--飞行");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();
        System.out.println("增加功能--水上游");
        WaterCar waterCar = new WaterCar(car);
        waterCar.move();
        System.out.println("增加功能--飞行--水上游");
        WaterCar waterCar1 = new WaterCar(new FlyCar(car));
        waterCar1.move();
    }
}
