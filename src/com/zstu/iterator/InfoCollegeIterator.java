package com.zstu.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-19:16
 */
public class InfoCollegeIterator implements Iterator {

    List<Department> departments;
    int index = -1;
    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.size() - 1) {
            return false;
        } else {
            index++;//后移一位
            return true;
        }
    }

    @Override
    public Object next() {
        return departments.get(index);
    }

    @Override
    public void remove() {

    }
}
