package com.bjsxt.test.compile;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * 动态编译的几种实现方式
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        //1、getSystemJavaCompiler
        //getSystemJavaComplier();
        //2、
        //getRuntime();
        //3、
        getMethod();

    }

    //通过getSystemJavaCompiler实现动态编译
    public static  void getSystemJavaComplier() {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int result = compiler.run(null, null, null, "E:/IT/test_tecnology/java/JavaComplie.java");
        System.out.println(result ==0 ? "编译成功"  : "编译失败");

    }

    //通过Runtime.getRuntime调用执行类  实现动态编译
    public static void getRuntime() throws IOException {
        Runtime run = Runtime.getRuntime();
        Process process = run.exec("java -cp E:/IT/test_tecnology/java/  JavaComplie");
        InputStream is = process.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String info = " ";
        while ((info = reader.readLine()) != null) {
            System.out.println(info);
        }
    }

    //通过类加载器+反射原理实现动态编译
    public static void getMethod() {
        try {
            URL[] urls = {new URL("file:/" + "E:/IT/test_tecnology/java/")};
            URLClassLoader loader = new URLClassLoader(urls);
            Class<?> javaComplie = loader.loadClass("JavaComplie");
            //调用加载类的main方法
            Method main = javaComplie.getMethod("main", String[].class);
            main.invoke(null, (Object) new String[]{});


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
