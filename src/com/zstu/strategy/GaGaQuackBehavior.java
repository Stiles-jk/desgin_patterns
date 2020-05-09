package com.zstu.strategy;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-15:29
 */
public class GaGaQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("ga ga");
    }
}
