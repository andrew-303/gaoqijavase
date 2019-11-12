package com.bjsxt.test.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * 反射操作泛型
 */
public class Demo04 {
    public void test01(Map<String, User> map, List<User> list) {
        System.out.println("Demo04.test01()");

    }
    public Map<Integer,User> test02() {
        System.out.println("Demo04.test02()");
        return null;
    }

    public static void main(String[] args) {
        try {
            //获取指定方法参数泛型信息
            Method test01 = Demo04.class.getMethod("test01", Map.class, List.class);
            //获取泛型参数类型
            Type[] genericParameterTypes = test01.getGenericParameterTypes();
            for (Type parameterType : genericParameterTypes) {
                System.out.println("test01的参数类型：" + parameterType);
                if (parameterType instanceof ParameterizedType) {
                    Type[] types = ((ParameterizedType) parameterType).getActualTypeArguments();
                    for (Type type : types) {
                        System.out.println("泛型类型：" + type);
                    }
                }
            }

            System.out.println("---------------分隔线-----------------");
            //获得指定返回值泛型信息
            Method test02 = Demo04.class.getMethod("test02", null);
            Type genericReturnType = test02.getGenericReturnType();
            if (genericReturnType instanceof ParameterizedType) {
                Type[] types = ((ParameterizedType) genericReturnType).getActualTypeArguments();
                for (Type type : types) {
                    System.out.println("返回值泛型：" + type);
                }

            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
