package com.zstu.mediator;

import java.util.HashMap;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-21:57
 */
public class concreteMediator extends Mediator {

    //集合，放入所有的同事对象
    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;

    public concreteMediator() {
        colleagueMap = new HashMap<String, Colleague>();
        interMap = new HashMap<String, String>();
    }

    @Override
    public void Register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);

        // TODO Auto-generated method stub

        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagueName);
        } else if (colleague instanceof Curtain) {
            interMap.put("Curtains", colleagueName);
        }
    }


    @Override
    public void getMessage(int stateChange, String colleagueName) {
        //处理闹钟发出的消息
        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine) (colleagueMap.get(interMap
                        .get("CoffeeMachine")))).StartCoffee();
                ((TV) (colleagueMap.get(interMap.get("TV")))).StartTv();
            } else if (stateChange == 1) {
                ((TV) (colleagueMap.get(interMap.get("TV")))).StopTv();
            }

        } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            ((Curtain) (colleagueMap.get(interMap.get("Curtains"))))
                    .UpCurtains();

        } else if (colleagueMap.get(colleagueName) instanceof TV) {//如果TV发现消息

        } else if (colleagueMap.get(colleagueName) instanceof Curtain) {
            //如果是以窗帘发出的消息，这里处理...
        }

    }

    @Override
    public void SendMessage() {

    }
}
