package com.bjsxt.test.annotation2;

/**
 * 普通实体类
 */
@SxtTable("tb_student")
public class SxtStudent {

    @SxtFiled(cloumnName = "id",type = "int",length = 10)
    private int id;

    @SxtFiled(cloumnName = "sname",type = "varchar",length = 20)
    private String studentName;

    @SxtFiled(cloumnName = "age",type = "int" , length = 3)
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
