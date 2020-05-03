package com.zstu.factory_pattern.factory_method.order;

import com.zstu.factory_pattern.factory_method.pizza.LDCheesePizza;
import com.zstu.factory_pattern.factory_method.pizza.LDPepperPizza;
import com.zstu.factory_pattern.factory_method.pizza.Pizza;

/**
 * @auther Stiles-JKY
 * @date 2020/4/30-6:17
 */
public class LDOrderPizza extends OrderPizza {
    Pizza pizza;
    @Override
    Pizza createPizza(String orderType) {
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else {
            pizza = new LDPepperPizza();
        }

        return pizza;
    }
}
