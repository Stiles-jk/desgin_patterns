package com.zstu.builder_pattern;

/**
 * @auther Stiles-JKY
 * @date 2020/5/1-15:44
 */
public abstract class HouseBuilder {
    protected House house = new House();

    //创建流程
    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    //建造房子好， 将产品(房子) 返回
    public House buildHouse() {
        return house;
    }
}
