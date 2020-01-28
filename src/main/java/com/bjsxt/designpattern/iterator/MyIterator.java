package com.bjsxt.designpattern.iterator;

/**
 * 迭代抽象类 定义得到开始对象、下一个对象、判断是否到首尾元素的统一方法和接口
 * 自定义迭代器接口
 */
public interface MyIterator {
    void first();   //将游标指向第一个元素
    void next();    //将游标指向下一个元素
    boolean hasNext();

    boolean isFirst();
    boolean isLast();

    Object getCurrentObj(); //获取当前游标
}
