package com.zstu.decorator;

/**
 * @auther Stiles-JKY
 * @date 2020/5/2-14:19
 */
public class Soy extends Decorator {

    public Soy(Drink obj) {
        super(obj);
        setDes(" 豆浆  ");
        setPrice(1.5f);
    }
}
