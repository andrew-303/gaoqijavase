package com.bjsxt.designpattern.facade;

public class HCBCYinhang implements Yinhang{
    @Override
    public void openAccount() {
        System.out.println("在工商银行完成开户");
    }
}
