package com.zstu.factory_pattern.simple_factory.pizza;

/**
 * @auther Stiles-JKY
 * @date 2020/4/30-0:04
 */
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 给胡椒披萨准备原材料 ");
    }
}
