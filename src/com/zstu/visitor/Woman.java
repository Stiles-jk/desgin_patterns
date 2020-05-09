package com.zstu.visitor;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-16:35
 */
public class Woman extends Person {

    @Override
    public void accept(Action action) {
            action.getWomenResult(this);
    }
}
