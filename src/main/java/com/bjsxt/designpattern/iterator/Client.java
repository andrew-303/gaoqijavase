package com.bjsxt.designpattern.iterator;

public class Client {
    public static void main(String[] args) {
        ConcreteAggregate ca = new ConcreteAggregate();
        ca.addObject("aa");
        ca.addObject("bb");
        ca.addObject("cc");

        MyIterator iterator = ca.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.getCurrentObj());
            iterator.next();
        }
    }
}
