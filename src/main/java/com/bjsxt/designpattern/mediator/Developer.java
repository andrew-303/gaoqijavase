package com.bjsxt.designpattern.mediator;

/**
 * 具体的同事类
 */
public class Developer implements Department {

    private Mediator m; //持有中介者的引用

    public Developer(Mediator m) {
        this.m = m;
        m.register("Developer",this);
    }

    @Override
    public void selfAction() {
        System.out.println("专心开发产品");
        m.command("Finacial");
    }

    @Override
    public void outAction() {
        System.out.println("没有经费了，需要补充经费");
    }
}
