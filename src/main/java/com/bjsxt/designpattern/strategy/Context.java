package com.bjsxt.designpattern.strategy;

/**
 * 负责和具体的策略类交互
 * 这样的话，具体的算法和直接的客户端调用分离了
 */
public class Context {

    private Strategy strategy;  //当前采用的算法对象

    //可以通过构造器注入
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //可以通过set方法注入
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }


    public void printPrice(double price) {
        System.out.println("您的报价：" + strategy.getPrice(price));
    }
}
