package com.zstu.decorator;

/**
 * @auther Stiles-JKY
 * @date 2020/5/2-14:19
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDes(" 巧克力 ");
        setPrice(3.0f); // 调味品 的价格
    }
}
