package com.zstu.strategy;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-15:43
 */
public class Client {

    public static void main(String[] args) {
        Duck wildDuck = new WildDuck();
        wildDuck.fly();
        wildDuck.display();

        //可以动态的改变flyBehavior
        wildDuck.setFlyBehavior(new NoFlyBehavior());
        wildDuck.fly();
    }
}
