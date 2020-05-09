package com.zstu.strategy;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-15:39
 */
public class PekingDuck extends Duck {

    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("peking duck");
    }
}
