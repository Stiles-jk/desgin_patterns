package com.zstu.bridge;

/**
 * @auther Stiles-JKY
 * @date 2020/5/1-22:43
 */
public abstract class Phone {

    //品牌
    Brand brand;

    //构造器
    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }
    protected void close() {
        brand.close();
    }
    protected void call() {
        brand.call();
    }
}
