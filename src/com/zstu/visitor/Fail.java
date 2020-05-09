package com.zstu.visitor;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-16:38
 */
public class Fail extends Action {
    @Override
    public void getManResult(Person person) {
        System.out.println("man said fail");
    }

    @Override
    public void getWomenResult(Person person) {
        System.out.println("woman said fail");
    }
}
