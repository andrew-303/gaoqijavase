package com.bjsxt.designpattern.templatemethod;

public class Client {
    public static void main(String[] args) {

        TemplateMethod templateMethod1 = new TemplateMethod() {
            //通过匿名内部类的方式 调用实际的业务处理方法
            @Override
            public void transact() {
                System.out.println("我要取款");
            }
        };

        templateMethod1.process();

        TemplateMethod templateMethod2 = new TemplateMethod() {
            @Override
            public void transact() {
                System.out.println("我要存款");
            }
        };
        templateMethod2.process();
    }
}
