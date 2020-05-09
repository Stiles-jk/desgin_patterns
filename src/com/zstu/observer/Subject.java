package com.zstu.observer;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-21:08
 */
public interface Subject {
    void registerObserver(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
}
