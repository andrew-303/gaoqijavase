package com.bjsxt.designpattern.observer2;

public class Client {
    public static void main(String[] args) {

        ConcreateSubject subject = new ConcreateSubject();

        ObserverA observer1 = new ObserverA();
        ObserverA observer2 = new ObserverA();
        ObserverA observer3 = new ObserverA();

        //将上面的观察者添加到目标对象的容器中
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        System.out.println("修改状态");
        subject.setState(3000);
        System.out.println(observer1.getMyState());
        System.out.println(observer2.getMyState());
        System.out.println(observer3.getMyState());

        System.out.println("修改状态");
        subject.setState(30);
        System.out.println(observer1.getMyState());
        System.out.println(observer2.getMyState());
        System.out.println(observer3.getMyState());
    }
}
