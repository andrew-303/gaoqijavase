package com.bjsxt.designpattern.strategy;

public class OldCustomerNewStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打8.5折");
        return standardPrice * 0.85;
    }

}
