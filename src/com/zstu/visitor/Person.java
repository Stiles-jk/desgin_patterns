package com.zstu.visitor;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-16:28
 */
public abstract class Person {

    //提供一个方法，让访问者可以访问
    public abstract void accept(Action action);
}
