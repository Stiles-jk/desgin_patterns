package com.zstu.composite;

/**
 * @auther Stiles-JKY
 * @date 2020/5/2-15:10
 */
public abstract class OrganizationComponent {

    private String name;
    private String des;

    protected void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    protected  void remove(OrganizationComponent organizationComponent) {
        //默认实现
        throw new UnsupportedOperationException();
    }

    public OrganizationComponent(String name,String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    protected abstract void print();
}
