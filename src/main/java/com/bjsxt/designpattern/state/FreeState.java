package com.bjsxt.designpattern.state;

public class FreeState implements State{
    @Override
    public void handle() {
        System.out.println("空闲状态");
    }
}
