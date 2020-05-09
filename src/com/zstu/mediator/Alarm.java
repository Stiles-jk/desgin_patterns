package com.zstu.mediator;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-21:49
 */
public class Alarm extends Colleague {

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }

    public void SendAlarm(int stateChange) {
        SendMessage(stateChange);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.GetMediator().getMessage(stateChange,name);
    }
}
