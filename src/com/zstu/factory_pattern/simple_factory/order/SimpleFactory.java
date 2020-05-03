package com.zstu.factory_pattern.simple_factory.order;

import com.zstu.factory_pattern.simple_factory.pizza.CheesePizza;
import com.zstu.factory_pattern.simple_factory.pizza.GreekPizza;
import com.zstu.factory_pattern.simple_factory.pizza.PepperPizza;
import com.zstu.factory_pattern.simple_factory.pizza.Pizza;

/**
 * 简单工厂类
 *
 * @auther Stiles-JKY
 * @date 2020/4/30-0:07
 */
public class SimpleFactory {

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");

        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("greekPizza");
        }   else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }

    //简单工厂模式 也叫 静态工厂模式

    public static Pizza createPizza2(String orderType) {

        Pizza pizza = null;

        System.out.println("使用简单工厂模式2");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }
}
