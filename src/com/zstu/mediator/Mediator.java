package com.zstu.mediator;

/**
 * 抽象的中介者
 *
 * @auther Stiles-JKY
 * @date 2020/5/8-21:42
 */
public abstract class Mediator {
    //colleague register
    public abstract void Register(String colleagueName,Colleague colleague);

    //get message from colleague
    public abstract void getMessage(int stateChange,String colleagueName);

    public abstract void SendMessage();

}
