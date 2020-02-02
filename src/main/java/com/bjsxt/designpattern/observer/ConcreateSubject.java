package com.bjsxt.designpattern.observer;

/**
 * 具体的目标对象
 */
public class ConcreateSubject extends Subject{

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyAllObserver();
    }
}
