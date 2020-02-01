package com.bjsxt.designpattern.state;

/**
 * 实际修改状态的类
 * 维护一个state，定义了当前的状态
 */
public class HomeContext {
    private State state;

    public void setState(State state) {
        System.out.println("改变状态");
        state.handle();
    }
}
