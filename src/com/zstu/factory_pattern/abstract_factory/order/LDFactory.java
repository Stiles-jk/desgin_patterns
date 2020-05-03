package com.zstu.factory_pattern.abstract_factory.order;

import com.zstu.factory_pattern.abstract_factory.pizza.LDCheesePizza;
import com.zstu.factory_pattern.abstract_factory.pizza.LDPepperPizza;
import com.zstu.factory_pattern.abstract_factory.pizza.Pizza;

/**
 * @auther Stiles-JKY
 * @date 2020/4/30-6:39
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用抽象工厂模式");
        Pizza pizza;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else {
            pizza = new LDPepperPizza();
        }

        return pizza;
    }
}
