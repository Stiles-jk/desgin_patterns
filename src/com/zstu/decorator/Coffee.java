package com.zstu.decorator;

/**
 * @auther Stiles-JKY
 * @date 2020/5/2-14:09
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
