package com.zstu.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-19:27
 */
public class OutputImpl {
    List<College> colleges;

    public OutputImpl(List<College> colleges) {
        this.colleges = colleges;
    }

    public void printCollege() {
        Iterator<College> iterator = colleges.iterator();
        while (iterator.hasNext()) {
            College next = iterator.next();
            System.out.println("===============" + next.getName() + "===============");
            printDepartment(next.createIterator());

        }
    }

    //输出 学院输出 系

    public void printDepartment(Iterator iterator) {
        while(iterator.hasNext()) {
            Department d = (Department)iterator.next();
            System.out.println(d.getName());
        }
    }
}
