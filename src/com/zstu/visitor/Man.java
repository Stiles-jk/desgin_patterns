package com.zstu.visitor;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-16:28
 */
public class Man extends Person{
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
