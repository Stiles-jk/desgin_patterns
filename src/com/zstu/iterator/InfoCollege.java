package com.zstu.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-19:17
 */
public class InfoCollege implements College {

    List<Department> infoDepartments;

    public InfoCollege() {
        infoDepartments = new ArrayList<>();
        addDepartment("信息安全专业", " 信息安全专业 ");
        addDepartment("网络安全专业", " 网络安全专业 ");
        addDepartment("服务器安全专业", " 服务器安全专业 ");
    }
    @Override
    public String getName() {
        return "信息学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        infoDepartments.add(new Department(name,desc));
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(this.infoDepartments);
    }
}
