package com.zstu.adapter.object_adapter;

/**
 * @auther Stiles-JKY
 * @date 2020/5/1-21:47
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
