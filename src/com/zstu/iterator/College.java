package com.zstu.iterator;

import java.util.Iterator;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-19:02
 */
public interface College {

    public String getName();

    //添加一个系
    void addDepartment(String name,String desc);

    //返回一个迭代器，遍历
    Iterator createIterator();
}
