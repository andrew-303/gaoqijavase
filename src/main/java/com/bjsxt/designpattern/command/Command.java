package com.bjsxt.designpattern.command;

/**
 * 抽象命令类
 */
public interface Command {
    void execute();
}

class ConcreateCommand implements Command{

    private Receiver receiver;

    public ConcreateCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
