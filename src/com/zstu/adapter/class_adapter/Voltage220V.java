package com.zstu.adapter.class_adapter;

/**
 * 被适配的类
 * @auther Stiles-JKY
 * @date 2020/5/1-17:36
 */
public class Voltage220V {

    //输出220V的电压
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
