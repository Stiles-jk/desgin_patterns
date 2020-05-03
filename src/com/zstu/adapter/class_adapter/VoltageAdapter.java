package com.zstu.adapter.class_adapter;

/**
 * 适配器类
 *
 * @auther Stiles-JKY
 * @date 2020/5/1-17:37
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        int src = super.output220V();
        int dstV = src / 44;//转为5v
        System.out.println(dstV);
        return dstV;
    }
}
