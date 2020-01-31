package com.bjsxt.designpattern.strategy;

public class OldCustomermanyStrategy implements Strategy{
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打8折");
        return standardPrice * 0.8;
    }
}
