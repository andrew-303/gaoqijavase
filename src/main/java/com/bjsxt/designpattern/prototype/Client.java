package com.bjsxt.designpattern.prototype;

import java.util.Date;

/**
 * 测试浅复制
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(123456789L);
        Sheep s1 = new Sheep("多利",date);
        Sheep s2 = (Sheep) s1.clone();

        System.out.println("传入时间: "+ date);
        System.out.println("s1的名字："+s1.getName());
        System.out.println("s1的生日："+s1.getBidtyday());

        //将date对象的时间修改掉，
        date.setTime(2345678901L);
        System.out.println("修改后s1的生日："+s1.getBidtyday());
        s2.setName("少利");
        System.out.println("s2的名字："+s2.getName());
        //得到的结果是date的对象修改后的时间，而不是初始拷贝的是s1后的时间
        System.out.println("s2的生日："+s2.getBidtyday());

    }
}
