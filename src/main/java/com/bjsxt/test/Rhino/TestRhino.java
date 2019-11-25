package com.bjsxt.test.Rhino;

import javax.script.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestRhino {
    public static void main(String[] args) throws ScriptException, NoSuchMethodException {
        //获得脚本引擎
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("javascript");

        //定义变量，存储在引擎的上下文中
        engine.put("msg","you are a good boy!");
        String str = "var user = {name:'andrew',age:30,school:['清华大学','北京大学']};";
        str += "print (user.name);";

        //执行脚本
        engine.eval(str);
        System.out.println(engine.get("msg"));
        engine.eval("msg='andrew is a good boy!'");
        System.out.println(engine.get("msg"));

        //定义函数
        engine.eval("function add(a,b){var sum = a+b;return sum;}");
        //执行js函数
        //取得调用接口
        Invocable invocable = (Invocable) engine;
        //执行脚本中定义的方法
        Object result = invocable.invokeFunction("add", new Object[]{1, 5});
        System.out.println(result);

        //执行一个js文件
        FileReader reader = null;
        try {
            reader = new FileReader("D:\\IT\\dev_codes\\gitproject\\gaoqijavase\\src\\main\\java\\com\\bjsxt\\test\\Rhino\\demo.js");
            engine.eval(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
