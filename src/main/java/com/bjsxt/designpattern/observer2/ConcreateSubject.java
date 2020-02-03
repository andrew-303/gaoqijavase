package com.bjsxt.designpattern.observer2;


import java.util.Observable;

/**
 * 目标对象
 */
public class ConcreateSubject extends Observable {

    private int state;



    public void setState(int state) {

        this.state = state; //目标对象的状态发生了变化
        setChanged();   //表示目标对象已经发生了改变
        notifyObservers(state); //通知所有观察者

    }


    public int getState() {
        return state;
    }

}



