package com.zstu.factory_pattern.simple_factory.pizza;

/**
 * @auther Stiles-JKY
 * @date 2020/4/23-0:08
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(" 给制作奶酪披萨 准备原材料 ");
    }
}
