package com.zstu.responsibility_chain;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-16:32
 */
public class PurchaseRequest {

    private int type = 0;//请求类型
    private float price = 0.0f;
    private int id = 0;

    //构造器
    public PurchaseRequest(int type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }
    public int getType() {
        return type;
    }
    public float getPrice() {
        return price;
    }
    public int getId() {
        return id;
    }
}
