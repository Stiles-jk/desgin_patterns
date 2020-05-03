package com.zstu.decorator;

/**
 * Component
 *
 * @auther Stiles-JKY
 * @date 2020/5/2-14:03
 */
public abstract class Drink {
    public String des;//description

    private float price = 0.0f;

    public String getDes() {
        return this.des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * 费用计算方法
     *
     * @return
     */
    public abstract float cost();
}
