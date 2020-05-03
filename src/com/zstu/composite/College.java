package com.zstu.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther Stiles-JKY
 * @date 2020/5/2-15:16
 */
public class College extends OrganizationComponent {

    List<OrganizationComponent> departments = new ArrayList<>();//用来存放学院下属的各专业

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        this.departments.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        this.departments.remove(organizationComponent);
    }

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public void setDes(String des) {
        super.setDes(des);
    }

    @Override
    protected void print() {
        System.out.println("--------------" + getName() + "--------------");
        //遍历 organizationComponents
        for (OrganizationComponent organizationComponent : departments) {
            organizationComponent.print();
        }
    }
}
