package com.zstu.facade;

/**
 * @auther Stiles-JKY
 * @date 2020/5/2-16:42
 */
public class Popcorn {

    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" popcorn on ");
    }

    public void off() {
        System.out.println(" popcorn ff ");
    }

    public void pop() {
        System.out.println(" popcorn is poping  ");
    }
}
