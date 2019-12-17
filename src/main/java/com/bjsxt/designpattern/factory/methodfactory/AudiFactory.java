package com.bjsxt.designpattern.factory.methodfactory;

public class AudiFactory implements CarFactory{
    @Override
    public Car creatCar() {
        return new Audi();
    }
}
