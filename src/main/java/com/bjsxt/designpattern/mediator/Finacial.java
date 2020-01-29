package com.bjsxt.designpattern.mediator;

public class Finacial implements Department{

    private Mediator m;

    public Finacial(Mediator m) {
        this.m = m;
        m.register("Finacial",this);
    }

    @Override
    public void selfAction() {
        System.out.println("自己数钱");
    }

    @Override
    public void outAction() {
        System.out.println("向经理汇报，财务状况");
    }
}
