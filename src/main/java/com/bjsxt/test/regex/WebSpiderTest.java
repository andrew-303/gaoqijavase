package com.bjsxt.test.regex;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 网络爬虫-利用正则提取链接地址
 */
public class WebSpiderTest {

    /**
     * 提取url对应的页面内容
     * @param urlStr  页面地址
     * @param charset   页面字符集编码格式
     */
    public static String getUrlContent(String urlStr,String charset) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            URL url = new URL(urlStr);
            InputStream openStream = url.openStream();
            //通过IO读取内容
            BufferedReader reader = new BufferedReader(new InputStreamReader(openStream, charset));
            String temp ="";
            while ((temp = reader.readLine()) != null) {
                stringBuilder.append(temp);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringBuilder.toString();

    }

    /**
     * 正则匹配页面内容中的a标签内的网址列表
     * @param destStr  待解析的页面内容字符串
     * @param regex     正则表达式
     * @return
     */
    public static List<String> getMatherSubStr(String destStr, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(destStr);
        List<String> list = new ArrayList<String>();
        while (matcher.find()) {
            list.add(matcher.group(1));
        }
        return list;
    }

    public static void main(String[] args) {
        String urlContent = getUrlContent("https://www.163.com/", "gbk");
//        System.out.println(urlContent);
        String regex1="<a[\\s\\S]+?</a>"; //取到超链接的所有内容
        String regex2="href=\"(.+?)\"";     //取到超链接中的herf后的网址
        //通过匹配字母数字特殊符号等内容的方式，去掉无关内容，只取url地址
        String regex3="href=\"([\\w\\s./:#=?]+?)\"";
        List<String> stringList = getMatherSubStr(urlContent, regex3);
        for (String s : stringList) {
            System.out.println(s);
        }
    }
}
