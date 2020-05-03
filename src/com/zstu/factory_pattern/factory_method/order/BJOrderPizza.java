package com.zstu.factory_pattern.factory_method.order;

import com.zstu.factory_pattern.factory_method.pizza.BJCheesePizza;
import com.zstu.factory_pattern.factory_method.pizza.BJPepperPizza;
import com.zstu.factory_pattern.factory_method.pizza.Pizza;

/**
 * @auther Stiles-JKY
 * @date 2020/4/30-6:15
 */
public class BJOrderPizza extends OrderPizza {
    Pizza pizza;
    @Override
    Pizza createPizza(String orderType) {
       if (orderType.equals("cheese")) {
           pizza = new BJCheesePizza();
       } else {
           pizza = new BJPepperPizza();
       }
       return pizza;
    }
}
