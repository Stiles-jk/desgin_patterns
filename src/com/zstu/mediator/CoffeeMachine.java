package com.zstu.mediator;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-21:56
 */
public class CoffeeMachine extends Colleague {
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
       this.GetMediator().getMessage(stateChange,name);
    }

    public void StartCoffee() {
        System.out.println("It's time to start coffee!");
    }

    public void FinishCoffee() {

        System.out.println("After 5 minutes!");
        System.out.println("Coffee is ok!");
        SendMessage(0);
    }
}
