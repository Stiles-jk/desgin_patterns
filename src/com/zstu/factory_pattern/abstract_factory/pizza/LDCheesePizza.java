package com.zstu.factory_pattern.abstract_factory.pizza;

/**
 * @auther Stiles-JKY
 * @date 2020/4/30-6:06
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的奶酪披萨");
        System.out.println(" 伦敦的奶酪pizza 准备原材料");
    }
}
