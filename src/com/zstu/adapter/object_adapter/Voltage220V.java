package com.zstu.adapter.object_adapter;

/**
 * @auther Stiles-JKY
 * @date 2020/5/1-21:41
 */
public class Voltage220V {
    //输出220V的电压，不变
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
