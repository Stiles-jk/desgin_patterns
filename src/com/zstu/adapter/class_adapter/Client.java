package com.zstu.adapter.class_adapter;

/**
 * @auther Stiles-JKY
 * @date 2020/5/1-17:39
 */
public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(" === 类适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
