package com.bjsxt.designpattern.adapter;

/**
 * 客户端类
 */
public class Client {

    public void test1(Target t) {
        t.handleReq();
    }

    public static void main(String[] args) {
        Client client = new Client();
        Target t = new Adapter();
        client.test1(t);
    }
}
