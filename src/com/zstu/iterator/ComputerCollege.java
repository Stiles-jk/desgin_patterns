package com.zstu.iterator;

import java.util.Iterator;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-19:05
 */
public class ComputerCollege implements College {

    Department[] departments;
    int position = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java专业", " Java专业 ");
        addDepartment("PHP专业", " PHP专业 ");
        addDepartment("大数据专业", " 大数据专业 ");

    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        departments[position] = new Department(name,desc);
        position++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
