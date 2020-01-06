package com.bjsxt.designpattern.composite;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        Folder f1 = new Folder("我的文件夹");
        AbstractFile f2,f3,f4,f5;
        f2 = new ImageFile("头像.jpg");
        f3 = new TextFile("java学习大全.txt");
        f1.add(f2);
        f1.add(f3);

        Folder f11 = new Folder("我的照片");
        f4 = new ImageFile("旅游照片.jpg");
        f5 = new ImageFile("工作照片.png");
        f11.add(f4);
        f11.add(f5);

        f1.add(f11);

        f1.killVitus();
    }
}
