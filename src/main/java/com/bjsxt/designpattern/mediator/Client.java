package com.bjsxt.designpattern.mediator;

public class Client {

    public static void main(String[] args) {
        President p = new President();
        Developer dev = new Developer(p);
        Market market = new Market(p);
        Finacial fin = new Finacial(p);

        dev.outAction();
        dev.selfAction();
    }
}
