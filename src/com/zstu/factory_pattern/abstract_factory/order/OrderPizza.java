package com.zstu.factory_pattern.abstract_factory.order;

import com.zstu.factory_pattern.abstract_factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @auther Stiles-JKY
 * @date 2020/4/30-6:41
 */
public class OrderPizza {

    AbsFactory factory;

    //constructor
    public OrderPizza(AbsFactory factory) {
        setFactory(factory);
    }

    //设置工厂类型并按要求生产
    private void setFactory(AbsFactory factory) {
        Pizza pizza;
        String orderType = "";
        this.factory = factory;
        do {
            orderType = getType();
            // factory 可能是北京的工厂子类，也可能是伦敦的工厂子类
            pizza = factory.createPizza(orderType);
            if (pizza != null) { // 订购ok
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        } while (true);

    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
