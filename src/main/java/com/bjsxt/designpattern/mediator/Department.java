package com.bjsxt.designpattern.mediator;

/**
 * 抽象的同事类
 */
public interface Department {

    void selfAction();  //自己部门需要做的事情

    void outAction();   //报告经理，需要做的事情

}
