package com.zstu.mediator;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-21:43
 */
public abstract class Colleague {

    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {

        this.mediator = mediator;
        this.name = name;

    }

    public Mediator GetMediator() {
        return this.mediator;
    }

    public abstract void SendMessage(int stateChange);
}
