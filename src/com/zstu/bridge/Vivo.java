package com.zstu.bridge;

/**
 * @auther Stiles-JKY
 * @date 2020/5/1-23:56
 */
public class Vivo implements Brand {

    @Override
    public void open() {
        System.out.println(" Vivo手机开机 ");
    }

    @Override
    public void close() {
        System.out.println(" Vivo手机关机 ");
    }

    @Override
    public void call() {
        System.out.println(" Vivo手机关机 ");
    }
}
