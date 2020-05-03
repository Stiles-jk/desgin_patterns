package com.zstu.facade;

/**
 * @auther Stiles-JKY
 * @date 2020/5/2-16:39
 */
public class Screen {
    private static Screen instance = new Screen();
    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println(" Screen up ");
    }

    public void down() {
        System.out.println(" Screen down ");
    }
}
