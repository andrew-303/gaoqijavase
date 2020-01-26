package com.bjsxt.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 * 创建并管理享元对象，享元池一般被设计成键值对
 */
public class ChessFlyweightFactory {

    //享元池
    private static Map<String,ChessFlyweight> map = new HashMap<String, ChessFlyweight>();

    public static ChessFlyweight getChess(String color) {
        if (map.get(color) != null) {
            return map.get(color);
        } else {
            ChessFlyweight cfw = new ConcreateChess(color);
            map.put(color,cfw);
            return cfw;
        }
    }
}
