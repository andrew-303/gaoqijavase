package com.bjsxt.designpattern.strategy;

public class NewCustomerfewStrategy implements Strategy{

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("不打折，原价销售");
        return standardPrice;
    }

}
