package com.zstu.memento;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-9:21
 */
public class Client {

    public static void main(String[] args) {
        GameRole p1 = new GameRole();
        p1.setVit(10);
        p1.setDef(20);
        p1.show();

        Memento p1Memento = p1.createMemento();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(p1Memento);

        p1.setVit(5);
        p1.setDef(10);
        p1.show();

        p1.getMemento(p1Memento);
        p1.show();


    }
}
