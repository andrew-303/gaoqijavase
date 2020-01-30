package com.bjsxt.designpattern.command;

/**
 * 调用者
 */
public class Invoke {

    private Command command;

    public Invoke(Command command) {
        this.command = command;
    }

    public void call(){
        command.execute();
    }
}
