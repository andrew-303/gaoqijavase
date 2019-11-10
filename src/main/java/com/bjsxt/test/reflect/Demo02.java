package com.bjsxt.test.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        String path = "com.bjsxt.test.reflect.User";

        Class<?> clazz = Class.forName(path);

        //获得类名
        String name = clazz.getName();//得到包名+类名
        System.out.println(name);
        String simpleName = clazz.getSimpleName();//只得到类名
        System.out.println(simpleName);

        //获取属性
        Field[] fields = clazz.getFields();//获取public的属性
        for (Field field : fields) {
            System.out.println("public属性为：" + field);
        }
        Field[] declaredFields = clazz.getDeclaredFields();//获取所有（public/private）属性
        for (Field declaredField : declaredFields) {
            System.out.println("所有的属性有：" + declaredField);
        }
        Field name1 = clazz.getDeclaredField("name");
        System.out.println("name1="+name1);

        //获取方法
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println("public方法有：" + method);
        }
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("所有方法有：" + declaredMethod);
        }
        Method getName = clazz.getDeclaredMethod("getName", null);
        System.out.println("getName=" + getName);

        //获得构造器
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("构造器："+constructor);
        }
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("所有的构造器包括：" + declaredConstructor);
        }
        Constructor<?> constructor = clazz.getDeclaredConstructor(int.class, String.class, int.class);
        System.out.println("带参构造器：" + constructor);
    }
}
