package com.zstu.iterator;

import java.util.Iterator;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-19:00
 */
public class ComputerCollegeIterator implements Iterator {
    //这里我们需要Department 是以怎样的方式存放=>数组
    Department[] departments;
    int position = 0; //遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= this.departments.length || departments[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    @Override
    public void remove() {

    }
}
