package com.bjsxt.designpattern.chainofresp;

/**
 * 客户端测试类
 */
public class Client {
    public static void main(String[] args) {
        Leader a = new Director("张三");
        Leader b = new Manager("李四");
        Leader c = new GeneralManager("王五");

        //组织责任链结构对象
        a.setNextLeader(b);
        b.setNextLeader(c);

        LeaveRequest request = new LeaveRequest("大锤", 35, "春节回家相亲");
        a.hanlerRequest(request);
    }
}
