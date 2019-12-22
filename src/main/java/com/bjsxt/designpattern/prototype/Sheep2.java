package com.bjsxt.designpattern.prototype;

import java.util.Date;

/**
 * 实现原型模式的深复制
 */
public class Sheep2 implements Cloneable{
    private String name;
    private Date bidtyday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone(); //实现Object对象的Clone()方法
        //添加如下代码，实现深复制
        Sheep2 s = (Sheep2) obj;
        s.bidtyday= (Date) this.bidtyday.clone(); //把属性也一同拷贝
        return obj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBidtyday() {
        return bidtyday;
    }

    public void setBidtyday(Date bidtyday) {
        this.bidtyday = bidtyday;
    }

    public Sheep2(String name, Date bidtyday) {
        this.name = name;
        this.bidtyday = bidtyday;
    }

    public Sheep2() {
    }
}
