package com.zstu.strategy;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-15:19
 */
public class WildDuck extends Duck {

    //构造器，传入FlyBehavior 的对象
    public  WildDuck() {
        // TODO Auto-generated constructor stub
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println(" 这是野鸭 ");
    }
}
