package com.bjsxt.designpattern.factory.abstractfactory;

/**
 * 汽车坐椅接口
 */
public interface Seat {

    void moseeat();
}

/**
 * 高端坐椅实现类
 */
class LaxurySeat implements Seat {

    @Override
    public void moseeat() {
        System.out.println("高端座椅舒适度高");
    }
}
/**
 * 低端坐椅实现类
 */
class LowSeat implements Seat {

    @Override
    public void moseeat() {
        System.out.println("低端座椅舒适度低");
    }
}
