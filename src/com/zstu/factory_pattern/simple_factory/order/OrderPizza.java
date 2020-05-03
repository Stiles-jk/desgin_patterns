package com.zstu.factory_pattern.simple_factory.order;

import com.zstu.factory_pattern.simple_factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @auther Stiles-JKY
 * @date 2020/4/30-0:06
 */
public class OrderPizza {

    //获得工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String orderType = "";//用户输入
        this.simpleFactory = simpleFactory;

        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

            //输出pizza
            if(pizza != null) { //订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" 订购披萨失败 ");
                break;
            }

        } while (true);
    }

    private String getType() {

        try {
            BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));//获取输入
            System.out.println("input pizza type");
            String str = strIn.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

    }
}
