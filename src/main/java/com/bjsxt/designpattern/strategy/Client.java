package com.bjsxt.designpattern.strategy;

public class Client {

    public static void main(String[] args) {
        Strategy oldCustomermanyStrategy = new OldCustomermanyStrategy();
        Context context1 = new Context(oldCustomermanyStrategy);
        context1.printPrice(100);

        NewCustomermanyStrategy newCustomermanyStrategy = new NewCustomermanyStrategy();
        Context context2 = new Context(newCustomermanyStrategy);
        context2.printPrice(100);

        NewCustomerfewStrategy newCustomerfewStrategy = new NewCustomerfewStrategy();
        Context context3 = new Context(newCustomerfewStrategy);
        context3.printPrice(100);
    }
}
