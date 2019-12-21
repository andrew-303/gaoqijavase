package com.bjsxt.designpattern.factory.abstractfactory;

public class Client {
    public static void main(String[] args) {
        //通过低端汽车工厂生成低端汽车组件
        LowCarFactory lowCarFactory = new LowCarFactory();
        Engine lowEngine = lowCarFactory.createEngien();
        lowEngine.run();
        lowEngine.start();

        Seat lowSeat = lowCarFactory.createSeat();
        lowSeat.moseeat();

        Tyre lowTyre = lowCarFactory.createTyre();
        lowTyre.revole();

        System.out.println("------------------------");

        //通过高端汽车工厂生成高端汽车组件
        LuxuryCarFactory luxuryCarFactory = new LuxuryCarFactory();
        Engine luxuryEngien = luxuryCarFactory.createEngien();
        Seat luxurySeat = luxuryCarFactory.createSeat();
        Tyre luxuryTyre = luxuryCarFactory.createTyre();

        luxuryEngien.run();
        luxuryEngien.start();

        luxurySeat.moseeat();

        luxuryTyre.revole();
    }
}
