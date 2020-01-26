package com.bjsxt.designpattern.flyweight;

/**
 * 抽象享元类
 */
public interface ChessFlyweight {
    //声明公共方法，向外界提供对象的内部状态，可以共享
    void setColor(String color);
    String getColor();
    //设置外部状态
    void display(Coordinate coordinate);
}

/**
 * 具体的享元类
 */
class ConcreateChess implements ChessFlyweight{

    //为内部状态提供变量进行存储
    private String color;

    public ConcreateChess(String color) {
        super();
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println("棋子颜色：" + color);
        System.out.println("棋子位置：" + coordinate.getX()+"---" + coordinate.getY());
    }
}



