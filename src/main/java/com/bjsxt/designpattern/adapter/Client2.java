package com.bjsxt.designpattern.adapter;

/**
 * 客户端类
 */
public class Client2 {

    public void test1(Target t) {
        t.handleReq();
    }

    public static void main(String[] args) {
        Client2 client = new Client2();
        Adaptee adaptee = new Adaptee();
        Target t = new Adapter2(adaptee);
        client.test1(t);
    }
}
