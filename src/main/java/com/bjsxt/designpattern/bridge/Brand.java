package com.bjsxt.designpattern.bridge;

/**
 * 品牌维度的接口-桥接模式
 */
public interface Brand {

    void sale();
}

class Lenovo implements Brand {
    @Override
    public void sale() {
        System.out.println("卖联想品牌");
    }
}

class Dell implements Brand {
    @Override
    public void sale() {
        System.out.println("卖戴尔品牌");
    }
}



