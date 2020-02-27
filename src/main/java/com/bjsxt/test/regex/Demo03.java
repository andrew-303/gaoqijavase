package com.bjsxt.test.regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 测试正则表达式的替换
 */
public class Demo03 {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher("ddd12**ddd88**ddd235");

        String newStr = m.replaceAll("#");
        System.out.println("将数字替换成#后新字符串为: " + newStr );

    }
}
