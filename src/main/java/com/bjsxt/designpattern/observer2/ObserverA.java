package com.bjsxt.designpattern.observer2;

import java.util.Observable;

public class ObserverA implements java.util.Observer {

    private int myState;

    @Override
    public void update(Observable o, Object arg) {
        myState = ((ConcreateSubject)o).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
