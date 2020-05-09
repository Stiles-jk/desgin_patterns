package com.zstu.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-16:40
 */
public class ObjectStructure {

    //维护了一个Person集合
    List<Person> people = new LinkedList<>();
    //增加到list
    public void attach(Person p) {
        people.add(p);
    }
    //移除
    public void detach(Person p) {
        people.remove(p);
    }

    //显示测评情况
    public void display(Action action) {
        for(Person p: people) {
            p.accept(action);
        }
    }
}
