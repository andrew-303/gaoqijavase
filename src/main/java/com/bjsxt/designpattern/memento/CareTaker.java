package com.bjsxt.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 负责人类
 * 负责管理备忘录对象
 */
public class CareTaker {

    private EmpMemento empMemento;
//    private List<EmpMemento> list = new ArrayList<EmpMemento>();  //管理多个备忘录对象

    public EmpMemento getEmpMemento() {
        return empMemento;
    }

    public void setEmpMemento(EmpMemento empMemento) {
        this.empMemento = empMemento;
    }
}
