package com.bjsxt.designpattern.command;

public class Client {
    public static void main(String[] args) {


        Command command = new ConcreateCommand(new Receiver());
        Invoke invoke = new Invoke(command);
        invoke.call();
    }

}
