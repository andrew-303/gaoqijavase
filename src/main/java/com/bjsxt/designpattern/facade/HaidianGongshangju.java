package com.bjsxt.designpattern.facade;

public class HaidianGongshangju implements GongShangju{
    @Override
    public void checkName() {
        System.out.println("在海淀工商局查询工商注册信息");
    }
}
