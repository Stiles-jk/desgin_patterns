package com.zstu.strategy;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-15:42
 */
public class ToyDuck extends Duck {

    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
    }
    @Override
    public void display() {
        System.out.println("toy duck");
    }
}
