package com.bjsxt.designpattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class TestSingleton2 {
    public static void main(String[] args) throws Exception {

        //调用懒汉式的单例方法
        Singleton05 instance2 = Singleton05.getInstance();
        Singleton05 instance3 = Singleton05.getInstance();
        System.out.println(instance2==instance3);
        System.out.println(instance2);
        System.out.println(instance3);

        //通过反射的方法,直接调私有构造器
        /*Class<Singleton05> aClass = (Class<Singleton05>) Class.forName("com.bjsxt.designpattern.singleton.Singleton05");
        Constructor<Singleton05> ac = aClass.getDeclaredConstructor(null);
        ac.setAccessible(true);
        Singleton05 singleton05 = ac.newInstance();
        Singleton05 singleton06 = ac.newInstance();
        System.out.println(singleton05);
        System.out.println(singleton06);*/

        //通过反序列化的方法构造多个参数
        FileOutputStream fos = new FileOutputStream("d:/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(instance2);
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("d:/a.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Singleton05 s7 = (Singleton05) ois.readObject();
        System.out.println(s7);


    }
}
