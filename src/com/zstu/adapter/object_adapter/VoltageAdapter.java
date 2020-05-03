package com.zstu.adapter.object_adapter;

/**
 * @auther Stiles-JKY
 * @date 2020/5/1-21:40
 */
public class VoltageAdapter implements IVoltage5V {

    Voltage220V v = null;

    public VoltageAdapter(Voltage220V v) {
        this.v = v;
    }

    @Override
    public int output5V() {
        int dst = 0;

        if (null != v) {
            int src = v.output220V();
            System.out.println("使用对象适配器，进行适配~~");
            dst = src / 44;
            System.out.println("适配完成，输出的电压为=" + dst);
        }

        return dst;
    }
}
