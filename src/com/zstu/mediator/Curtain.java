package com.zstu.mediator;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-21:54
 */
public class Curtain extends Colleague {

    public Curtain(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.GetMediator().getMessage(stateChange,name);
    }

    public void UpCurtains() {
        System.out.println("I am holding Up Curtains!");
    }
}
