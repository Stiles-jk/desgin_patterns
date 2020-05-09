package com.zstu.strategy;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-15:25
 */
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("can't fly");
    }
}
