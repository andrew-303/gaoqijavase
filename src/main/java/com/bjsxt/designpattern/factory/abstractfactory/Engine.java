package com.bjsxt.designpattern.factory.abstractfactory;

/**
 * 汽车引擎接口
 */
public interface Engine {
    void run();
    void start();
}

/**
 * 高端引擎接口
 */
class LaxuryEngine implements Engine {

    @Override
    public void run() {
        System.out.println("高端引擎跑得快");
    }

    @Override
    public void start() {
        System.out.println("高端引擎启动快");
    }
}

/**
 * 低端引擎
 */
class LowEngine implements Engine {

    @Override
    public void run() {
        System.out.println("低端引擎跑得慢");
    }

    @Override
    public void start() {
        System.out.println("低端引擎启动慢");
    }
}