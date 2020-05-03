package com.zstu.adapter.class_adapter;

/**
 * @auther Stiles-JKY
 * @date 2020/5/1-17:33
 */
public class Phone {

    public void charging(IVoltage5V iVoltage5V) {

        if(iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V, 可以充电~~");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压大于5V, 不能充电~~");
        }
    }
}
