package com.bjsxt.designpattern.state;

public class BookedState implements State{
    @Override
    public void handle() {
        System.out.println("已约定状态");
    }
}
