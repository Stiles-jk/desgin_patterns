package com.zstu.builder_pattern;

/**
 * @auther Stiles-JKY
 * @date 2020/5/1-15:49
 */
public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println(" 高楼的打地基100米 ");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 高楼的砌墙20cm ");
    }

    @Override
    public void roofed() {
        System.out.println(" 高楼的透明屋顶 ");
    }
}
