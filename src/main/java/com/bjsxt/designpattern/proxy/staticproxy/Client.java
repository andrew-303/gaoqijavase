package com.bjsxt.designpattern.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        RealStar realStar = new RealStar();
        ProxyStar proxyStar = new ProxyStar(realStar);

        proxyStar.confer();
        proxyStar.signContract();
        proxyStar.bootTicket();
        proxyStar.sing();
        proxyStar.collectMoney();

    }
}
