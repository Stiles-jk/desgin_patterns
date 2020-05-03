package com.zstu.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther Stiles-JKY
 * @date 2020/5/2-15:13
 */
public class University extends OrganizationComponent {

    List<OrganizationComponent> universities = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        this.universities.add(organizationComponent);//将学院添加到学校中
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
       this.universities.remove(organizationComponent);
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
        //遍历 organizationComponents 这里是学校下属的学院
        for (OrganizationComponent organizationComponent : universities) {
            organizationComponent.print();
        }
    }
}
