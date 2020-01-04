package com.bjsxt.designpattern.bridge;

public class Client {
    public static void main(String[] args) {

        Computer c = new Desktop(new Lenovo());
        c.sale();

        Computer cdell = new Latop(new Dell());
        cdell.sale();
    }
}
