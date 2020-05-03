package com.zstu.composite;

/**
 * @auther Stiles-JKY
 * @date 2020/5/2-15:18
 */
public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }


    @Override
    protected void print() {
        System.out.println(getName());
    }
}
