package com.zstu.mediator;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-21:53
 */
public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.GetMediator().getMessage(stateChange,name);
    }

    public void StartTv() {
        System.out.println("It's time to StartTv!");
    }

    public void StopTv() {
        System.out.println("StopTv!");
    }
}
