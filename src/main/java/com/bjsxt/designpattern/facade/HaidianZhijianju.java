package com.bjsxt.designpattern.facade;

public class HaidianZhijianju implements Zhijianju{
    @Override
    public void taxCertificate() {
        System.out.println("在海淀质监局进行质量检查");
    }
}
