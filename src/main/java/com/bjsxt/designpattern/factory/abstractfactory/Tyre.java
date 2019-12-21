package com.bjsxt.designpattern.factory.abstractfactory;

/**
 * 汽车轮胎接口
 */
public interface Tyre {
    void revole();
}

/**
 * 高端轮胎实现类
 */
class LuxuryTyre implements Tyre {

    @Override
    public void revole() {
        System.out.println("高端轮胎抓地力好");
    }
}

/**
 * 低端轮胎实现类
 */
class LowTyre implements Tyre {

    @Override
    public void revole() {
        System.out.println("低端轮胎抓地力差");
    }
}