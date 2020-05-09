package com.zstu.strategy;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-15:25
 */
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("little fly");
    }
}
