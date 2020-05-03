package com.zstu.factory_pattern.abstract_factory.pizza;

/**
 * @auther Stiles-JKY
 * @date 2020/4/30-6:07
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的胡椒pizza");
        System.out.println(" 伦敦的胡椒pizza 准备原材料");
    }
}
