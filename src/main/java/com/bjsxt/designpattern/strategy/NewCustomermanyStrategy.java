package com.bjsxt.designpattern.strategy;

public class NewCustomermanyStrategy implements Strategy{

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打9折");
        return standardPrice * 0.9;
    }


}
