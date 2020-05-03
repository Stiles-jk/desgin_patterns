package com.zstu.decorator;

/**
 * Decorator
 *
 * @auther Stiles-JKY
 * @date 2020/5/2-14:13
 */
public class Decorator extends Drink {
    Drink obj;

    //构造器中获取component对象
    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public float cost() {
        //返回当前装饰者的价格 + component的价格
        return super.getPrice() + obj.cost();
    }
}
