package com.bjsxt.designpattern.templatemethod;

public abstract class TemplateMethod {

    //具体的方法
    public void takeNumber() {
        System.out.println("取号排队");
    }

    public abstract void transact();    //办理具体业务，抽象钩子方法，由具体实现类来实现

    public void evaluate() {
        System.out.println("评价服务");
    }

    //模板方法，把基本操作组合到一起，子类一般不重写
    public final void process() {

        this.takeNumber();

        this.transact();


        this.evaluate();
    }
}
