package com.zstu.visitor;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-16:26
 */
public abstract class Action {

    //得到男性的测评结果
    public abstract void getManResult(Person person);

    //得到女性的评测结果
    public abstract void getWomenResult(Person person);
}
