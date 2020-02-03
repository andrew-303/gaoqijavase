package com.bjsxt.designpattern.memento;

/**
 * 测试类
 */
public class TestClient {

    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();

        Emp emp = new Emp("Andrew", 18, 10000);
        System.out.println("第1次打印对象：" + emp.getEname() +"---" + emp.getAge() + "---" + emp.getSalary());

        System.out.println("进行一次备忘操作");
        careTaker.setEmpMemento(emp.memento());

        emp.setEname("jack");
        emp.setAge(30);
        emp.setSalary(20000);
        System.out.println("第2次打印对象：" + emp.getEname() +"---" + emp.getAge() + "---" + emp.getSalary());

        System.out.println("还原备忘对象");
        emp.recovery(careTaker.getEmpMemento());
        System.out.println("第3次打印对象：" + emp.getEname() +"---" + emp.getAge() + "---" + emp.getSalary());

    }
}
