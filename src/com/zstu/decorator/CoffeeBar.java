package com.zstu.decorator;

/**
 * @auther Stiles-JKY
 * @date 2020/5/2-14:20
 */
public class CoffeeBar {

    public static void main(String[] args) {
        //下单
        Drink order = new LongBlack();
        System.out.println("费用1=" + order.cost());
        System.out.println("描述=" + order.getDes());
        //添加decorator
        order = new Milk(order);
        System.out.println("order 加入一份牛奶 费用 =" + order.cost());
        System.out.println("order 加入一份牛奶 描述 = " + order.getDes());
    }
}
