package com.bjsxt.designpattern.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 中介者具体实现类
 */
public class President implements Mediator{

    private Map<String,Department> map = new HashMap<String, Department>();

    @Override
    public void register(String dname, Department d) {
        map.put(dname,d);
    }

    @Override
    public void command(String dname) {
        System.out.println(map.get(dname).getClass().getName());
        map.get(dname).selfAction();
    }
}
