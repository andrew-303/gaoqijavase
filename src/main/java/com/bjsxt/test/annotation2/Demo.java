package com.bjsxt.test.annotation2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 利用反射读取注解的信息，模拟处理注解信息的流程
 */
public class Demo {

    public static void main(String[] args) {

        try {
            //使用反射读取类的信息,包含类名、字段、注解等
            Class clazz = Class.forName("com.bjsxt.test.annotation2.SxtStudent");
            //获得类的所有有效注解
            Annotation[] annotations = clazz.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println("SxtStudent类的注解为："+annotation);
            }

            //获得类的指定的注解
            SxtTable sxtTable = (SxtTable) clazz.getAnnotation(SxtTable.class);
            System.out.println(sxtTable.value());

            //获得类的属性studentName的注解:
            Field studentName = clazz.getDeclaredField("studentName");
            SxtFiled sxtFiled = studentName.getAnnotation(SxtFiled.class);
            System.out.println(sxtFiled.cloumnName()+"--"+sxtFiled.type()+"--"+sxtFiled.length());

            //获得类的属性id的注解：
            Field id = clazz.getDeclaredField("id");
            SxtFiled sxtFiled1 = id.getAnnotation(SxtFiled.class);
            System.out.println(sxtFiled1.cloumnName()+"--"+sxtFiled1.type()+"--"+sxtFiled1.length());

            Field age = clazz.getDeclaredField("age");
            SxtFiled sxtFiled2 = age.getAnnotation(SxtFiled.class);
            System.out.println(sxtFiled2.cloumnName()+"--"+ sxtFiled2.type()+"--"+sxtFiled2.length());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
