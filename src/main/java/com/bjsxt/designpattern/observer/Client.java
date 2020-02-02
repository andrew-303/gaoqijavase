package com.bjsxt.designpattern.observer;

public class Client {

    public static void main(String[] args) {

        //目标对象
        ConcreateSubject concreateSubject = new ConcreateSubject();

        //观察和对象
        ObserverA observer1 = new ObserverA();
        ObserverA observer2 = new ObserverA();
        ObserverA observer3 = new ObserverA();

        concreateSubject.register(observer1);
        concreateSubject.register(observer2);
        concreateSubject.register(observer3);

        //该表目标对象的状态
        concreateSubject.setState(1000);
        System.out.println(observer1.getMyState());
        System.out.println(observer2.getMyState());
        System.out.println(observer3.getMyState());

        System.out.println("#####");
        concreateSubject.setState(10);
        System.out.println(observer1.getMyState());
        System.out.println(observer2.getMyState());
        System.out.println(observer3.getMyState());
    }
}
