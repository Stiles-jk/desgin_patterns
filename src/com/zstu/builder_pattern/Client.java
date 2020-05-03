package com.zstu.builder_pattern;

/**
 * @auther Stiles-JKY
 * @date 2020/5/1-15:43
 */
public class Client {

    public static void main(String[] args) {

        //建造者模式使用
        CommonHouse commonHouse = new CommonHouse();//创建一个commonHouse蓝图(无参构造器)
        HouseDirector director = new HouseDirector(commonHouse);//将蓝图传给director
        House house = director.constructHouse();
        System.out.println("--------------------------");

        HighBuilding highBuilding = new HighBuilding();
        //重置建造者
        director.setHouseBuilder(highBuilding);
        //完成盖房子，返回产品(高楼)
        director.constructHouse();

    }
}
