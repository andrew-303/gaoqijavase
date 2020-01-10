package com.bjsxt.designpattern.facade;

public class HaidianShuiwuju implements Shuiwuju{
    @Override
    public void orgCodeCertificate() {
        System.out.println("海淀税务局完成税务登记");
    }
}
