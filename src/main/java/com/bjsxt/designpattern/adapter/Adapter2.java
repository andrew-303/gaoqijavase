package com.bjsxt.designpattern.adapter;

/**
 * 适配器(组合类的适配器形式-不继承Adaptee类)
 */
public class Adapter2  implements Target{

    private Adaptee adaptee;

    @Override
    public void handleReq() {
        adaptee.request();
    }

    public Adapter2(Adaptee adaptee) {
        super();
        this.adaptee = adaptee;
    }
}
