package com.zstu.adapter.object_adapter;

import com.zstu.adapter.class_adapter.IVoltage5V;

/**
 * @auther Stiles-JKY
 * @date 2020/5/1-17:33
 */
public class Phone {

    public void charging(VoltageAdapter iVoltage5V) {

        if(iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V, 可以充电~~");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压大于5V, 不能充电~~");
        }
    }
}
