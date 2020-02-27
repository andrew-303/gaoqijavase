package com.bjsxt.test.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 测试正则表达式对象的基本用法
 */
public class Demo01 {
    public static void main(String[] args) {
        //字符串fjkdsjfksjd2344dfkjdfk  是否符合指定的增则表达式\w+

        //正则表达式对象
        Pattern pattern = Pattern.compile("\\w+");

        //创建Mather对象
//        Matcher matcher = pattern.matcher("fjkdsjfk11d2344dfkjdfk");
        Matcher matcher = pattern.matcher("fjkdsjfk&&d2344dfkjdfk");

//        boolean yesorno = matcher.matches();    //尝试将整个字符串与该模式匹配
//        System.out.println("matcher.matches()结果：" + yesorno);

//        boolean yesorno2 = matcher.find();  //该方法扫描输入的序列，查找与该模式匹配的下一个子序列
//        System.out.println("matcher.find()的结果：" + yesorno2);

        while (matcher.find()) {
            System.out.println(matcher.group());    //group(),group(0)匹配整个表达式的子字符串
        }
    }

}
