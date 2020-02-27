package com.bjsxt.test.regex;

import java.util.Arrays;

/**
 * 测试正则表达式的分割
 */
public class Demo04 {

    public static void main(String[] args) {

        String str = "a,b,c";
        String[] array = str.split(",");
        System.out.println("用逗号分割后，新数组为: "+Arrays.toString(array));

        String str2 = "a343b3434c";
        //用正则去做分割条件，按数字进行分割
        String[] array2 = str.split("\\d");
        System.out.println("用正则按数字分割后，新数组为：" + Arrays.toString(array2));
    }
}
