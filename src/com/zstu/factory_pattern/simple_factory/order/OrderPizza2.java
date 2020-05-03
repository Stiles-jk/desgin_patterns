package com.zstu.factory_pattern.simple_factory.order;

import com.zstu.factory_pattern.simple_factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @auther Stiles-JKY
 * @date 2020/4/30-0:20
 */
public class OrderPizza2 {

    Pizza pizza = null;
    String orderType = "";

    public OrderPizza2() {
        do {

            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);

            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.bake();
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
