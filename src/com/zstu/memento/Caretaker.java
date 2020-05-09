package com.zstu.memento;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-9:22
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
