package com.bjsxt.designpattern.observer;

public class ObserverA implements Observer {
    private int myState;    //保持和目标对象的状态一致

    @Override
    public void update(Subject subject) {

        myState = ((ConcreateSubject)subject).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
