package com.zstu.factory_pattern.abstract_factory.order;

import com.zstu.factory_pattern.abstract_factory.pizza.BJCheesePizza;
import com.zstu.factory_pattern.abstract_factory.pizza.BJPepperPizza;
import com.zstu.factory_pattern.abstract_factory.pizza.Pizza;

/**
 * @auther Stiles-JKY
 * @date 2020/4/30-6:37
 */
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用抽象工厂模式");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else {
            pizza = new BJPepperPizza();
        }


        return pizza;
    }
}
