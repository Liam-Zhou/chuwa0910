package com.pattern.builder.demo1;

//具体的构造者，用来构建ofo单车对象
public class OfoBuilder extends Builder{

    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车架");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
