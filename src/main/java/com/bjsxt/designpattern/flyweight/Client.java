package com.bjsxt.designpattern.flyweight;

public class Client {
    public static void main(String[] args) {
        ChessFlyweight chess1 = ChessFlyweightFactory.getChess("黑色");
        ChessFlyweight chess2 = ChessFlyweightFactory.getChess("黑色");
        System.out.println(chess1);
        System.out.println(chess2);
        System.out.println("增加外部属性");
        chess1.display(new Coordinate(10,10));
        chess2.display(new Coordinate(20,20));
        ChessFlyweight chess3 = ChessFlyweightFactory.getChess("白色");
        System.out.println(chess3);
        chess3.display(new Coordinate(30,30));
    }
}
