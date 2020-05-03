package com.zstu.builder_pattern;

/**
 * @auther Stiles-JKY
 * @date 2020/5/1-15:51
 */
public class HouseDirector {
    HouseBuilder builder;
    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    //通过setter 传入 houseBuilder
    public void setHouseBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    //如何处理建造房子的流程，交给指挥者
    public House constructHouse() {
        builder.buildBasic();
        builder.buildWalls();
        builder.roofed();
        return builder.buildHouse();
    }
}
