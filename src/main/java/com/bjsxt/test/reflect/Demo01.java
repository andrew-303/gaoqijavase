package com.bjsxt.test.reflect;

/**
 * 测试各种类型对应的java.lang.Class对象的获取方式
 */
public class Demo01 {
    public static void main(String[] args) {
        String path = "com.bjsxt.test.reflect.User";
        try {
            Class userCLazz = Class.forName(path);

            System.out.println(userCLazz+ "-->" + userCLazz.hashCode());

            System.out.println(String.class + "-->"+ String.class.hashCode());
            System.out.println(path.getClass() + "-->"+ path.getClass().hashCode());

            System.out.println(int.class + "-->" + int.class.hashCode());
            System.out.println(double.class + "-->" + double.class.hashCode());

            int[] array1 = new  int[10];
            int[] array2 = new int[20];
            int[][] array3 = new int[10][2];
            System.out.println(array1.getClass() + " " +array1.getClass().hashCode());
            System.out.println(array2.getClass() + " " +array2.getClass().hashCode());
            System.out.println(array3.getClass() + " " +array3.getClass().hashCode());


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
