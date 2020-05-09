package com.zstu.mediator;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-21:42
 */
public class Client {

    public static void main(String[] args) {

        //创建一个中介者对象
        Mediator mediator = new concreteMediator();

        //创建Alarm 并且加入到  ConcreteMediator 对象的HashMap
        Alarm alarm = new Alarm(mediator, "alarm");

        //创建了CoffeeMachine 对象，并  且加入到  ConcreteMediator 对象的HashMap
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator,
                "coffeeMachine");

        //创建 Curtains , 并  且加入到  ConcreteMediator 对象的HashMap
        Curtain curtains = new Curtain(mediator, "curtains");
        TV tV = new TV(mediator, "TV");

        alarm.SendAlarm(0);
        coffeeMachine.FinishCoffee();
        alarm.SendAlarm(1);
    }



}
