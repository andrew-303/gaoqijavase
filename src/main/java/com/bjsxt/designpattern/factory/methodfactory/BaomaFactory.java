package com.bjsxt.designpattern.factory.methodfactory;

public class BaomaFactory implements CarFactory{
    @Override
    public Car creatCar() {
        return new Baoma();
    }
}
