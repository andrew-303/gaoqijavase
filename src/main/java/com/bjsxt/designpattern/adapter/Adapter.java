package com.bjsxt.designpattern.adapter;

/**
 * 适配器(类适配器形式-继承Adaptee类)
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void handleReq() {
        super.request();
    }
}
