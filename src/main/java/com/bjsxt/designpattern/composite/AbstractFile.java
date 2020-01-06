package com.bjsxt.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象构建
 */
public interface AbstractFile {
    void killVitus();//杀毒方法
}

class ImageFile implements AbstractFile {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVitus() {
        System.out.println("----图像文件:" + name + "正在被查杀！" );
    }
}

class TextFile implements AbstractFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVitus() {
        System.out.println("----文本文件:" + name + "正在被查杀！" );
    }
}

class Folder implements AbstractFile {

    private String name;
    //定义容器，用来存放容器构建下的子节点
    private List<AbstractFile> list = new ArrayList<AbstractFile>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        list.add(file);
    }

    public void remove(AbstractFile file) {
        list.remove(file);
    }

    public AbstractFile getChild(int index) {
        return list.get(index);
    }

    @Override
    public void killVitus() {
        System.out.println("文件夹：" + name +"正在进行查杀！");

        //递归进行文件夹内的查杀
        for (AbstractFile abstractFile : list) {
            abstractFile.killVitus();
        }
    }
}