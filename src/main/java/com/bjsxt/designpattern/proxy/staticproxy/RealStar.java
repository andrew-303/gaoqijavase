package com.bjsxt.designpattern.proxy.staticproxy;

public class RealStar implements Star {
    @Override
    public void confer() {
        System.out.println("RealStar.confer");
    }

    @Override
    public void signContract() {
        System.out.println("RealStar.signContract");
    }

    @Override
    public void bootTicket() {
        System.out.println("RealStar.bootTicket");
    }

    @Override
    public void sing() {
        System.out.println("RealStar(歌星本人).sing");
    }

    @Override
    public void collectMoney() {
        System.out.println("RealStar.collectMoney");
    }
}
