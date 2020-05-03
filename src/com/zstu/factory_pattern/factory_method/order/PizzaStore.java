package com.zstu.factory_pattern.factory_method.order;

/**
 * @auther Stiles-JKY
 * @date 2020/4/30-6:10
 */
public class PizzaStore {

    public static void main(String[] args) {
        String loc = "bj";
        if (loc.equals("bj")) {
            //创建北京口味的各种Pizza
            new BJOrderPizza();
        } else {
            //创建伦敦口味的各种Pizza
            new LDOrderPizza();
        }
        // TODO Auto-generated method stub
    }
}
