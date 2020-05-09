package com.zstu.strategy;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-15:26
 */
public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("good at flying");
    }
}
