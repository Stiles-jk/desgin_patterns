package com.zstu.visitor;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-16:52
 */
public class Wait extends Action {
    @Override
    public void getManResult(Person person) {
        System.out.println("man wait");
    }

    @Override
    public void getWomenResult(Person person) {
        System.out.println("woman wait");
    }
}
