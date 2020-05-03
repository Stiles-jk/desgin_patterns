package com.zstu.factory_pattern.abstract_factory.order;

/**
 * @auther Stiles-JKY
 * @date 2020/4/30-6:45
 */
public class PizzaStore {
    public static void main(String[] args) {
        //传入工厂类型，生产对应工厂的pizza
        new OrderPizza(new LDFactory());
    }
}
