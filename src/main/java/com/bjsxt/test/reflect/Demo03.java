package com.bjsxt.test.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 通过反射API构造对象
 */
public class Demo03 {
    public static void main(String[] args) {
        String path = "com.bjsxt.test.reflect.User";

        try {
            Class<User> clazz = (Class<User>) Class.forName(path);

            //通过反射API调用构造器，构造对象
            User user = clazz.newInstance();//其实是调用了User的无参构造器
            System.out.println(user);

            Constructor<User> c = clazz.getDeclaredConstructor(int.class, String.class, int.class);
            User gaoqi = c.newInstance(111, "gaoqi",  5);
            System.out.println(gaoqi.getName());

            //通过反射API调用普通方法
            User user1 = clazz.newInstance();
            //user1.setName("zhangsan");
            Method setName = clazz.getDeclaredMethod("setName", String.class);
            setName.invoke(user1, "zhangsi");
            System.out.println(user1.getName());

            //通过反射API操作属性
            User user2 = clazz.newInstance();
            Field name = clazz.getDeclaredField("name");
            name.setAccessible(true); //表示这个属性不用做安全检查了，可以直接访问
            name.set(user2, "liwu");

            System.out.println(user2.getName());
            System.out.println(name.get(user2));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
