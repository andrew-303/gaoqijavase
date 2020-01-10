package com.bjsxt.designpattern.facade;

/**
 * 外观模式也叫门面模式
 */
public class RegisterFacade {
    public void register() {
        GongShangju gsj = new HaidianGongshangju();
        gsj.checkName();

        Shuiwuju swj = new HaidianShuiwuju();
        swj.orgCodeCertificate();

        HaidianZhijianju zhj = new HaidianZhijianju();
        zhj.taxCertificate();
    }


}
