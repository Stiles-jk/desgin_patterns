package com.zstu.decorator;

/**
 * @auther Stiles-JKY
 * @date 2020/5/2-14:17
 */
public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2.0f);//设置牛奶价格为2.0
    }

}
