package com.zstu.visitor;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-16:39
 */
public class Success extends Action {
    @Override
    public void getManResult(Person person) {
        System.out.println("man says success");
    }

    @Override
    public void getWomenResult(Person person) {
        System.out.println("woman says success");
    }
}
