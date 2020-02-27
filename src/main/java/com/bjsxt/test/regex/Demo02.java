package com.bjsxt.test.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 测试正则表达式的分组处理
 */
public class Demo02 {
    public static void main(String[] args) {

        //表达式的意思是以字母+数字作为分组
        Pattern p = Pattern.compile("([a-z]+)([0-9]+)");
        Matcher m = p.matcher("aaa123**fdf1223**ddd567");

        while (m.find()) {
            System.out.println("m.group(): " + m.group());
            System.out.println("m.group(0): " + m.group(0));
            System.out.println("m.group(1): " + m.group(1));
            System.out.println("m.group(2): " + m.group(2));
        }


    }
}
