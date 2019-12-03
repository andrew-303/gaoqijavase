package com.bjsxt.test.javaassist;

import javassist.*;

import java.io.IOException;

/**
 * 测试使用javassist生成一个新的类
 */
public class Demo01 {
    public static void main(String[] args) throws CannotCompileException, IOException, NotFoundException {

        ClassPool classPool = ClassPool.getDefault();
        CtClass ctClass = classPool.makeClass("com.bjsxt.test.bean.Emp");

        //创建属性
        CtField cf1 = CtField.make("private int empno;", ctClass);
        CtField cf2 = CtField.make("private int empname;", ctClass);
        //添加进属性
        ctClass.addField(cf1);
        ctClass.addField(cf2);

        //创建方法
        CtMethod cm1 = CtMethod.make("public int getEmpno(){return empno;}", ctClass);
        CtMethod cm2 = CtMethod.make("public void setEmpno(int empno){this.empno = empno;}", ctClass);
        ctClass.addMethod(cm1);
        ctClass.addMethod(cm2);

        //添加构造器
        CtConstructor constructor = new CtConstructor(new CtClass[]{CtClass.intType, classPool.get("java.lang.String")}, ctClass);
        constructor.setBody("{this.empno=empno;this.empname=empname;}");
        ctClass.addConstructor(constructor);

        ctClass.writeFile("d:/myjava");
        System.out.println("生成java类");

    }
}
