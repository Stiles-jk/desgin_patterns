package com.zstu.factory_pattern.factory_method.pizza;

/**
 * @auther Stiles-JKY
 * @date 2020/4/30-6:09
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的胡椒pizza");
        System.out.println(" 北京的胡椒pizza 准备原材料");
    }
}
