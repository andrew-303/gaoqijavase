package com.bjsxt.designpattern.mediator;

public class Market implements Department {

    private Mediator m;

    public Market(Mediator m) {
        this.m = m;
        m.register("Market",this);
    }

    @Override
    public void selfAction() {
        System.out.println("市场调研");
    }

    @Override
    public void outAction() {
        System.out.println("调拨市场经费");
    }
}
