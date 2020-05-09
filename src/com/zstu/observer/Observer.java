package com.zstu.observer;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-21:08
 */
public interface Observer {
    void update(float temperature, float pressure, float humidity);
}
