package com.zstu.factory_pattern.abstract_factory.pizza;

/**
 * @auther Stiles-JKY
 * @date 2020/4/30-6:07
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {

        setName("北京的奶酪pizza");
        System.out.println(" 北京的奶酪pizza 准备原材料");
    }
}


