package com.zstu.factory_pattern.simple_factory.pizza;

/**
 * @auther Stiles-JKY
 * @date 2020/4/30-0:04
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(" 给希腊披萨 准备原材料 ");
    }
}
