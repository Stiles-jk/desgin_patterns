package com.zstu.prototype;

/**
 * @auther Stiles-JKY
 * @date 2020/4/30-20:12
 */
public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;
    private String address = "Chinese";
    public Sheep friend;

    //constructor
    public Sheep(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;

    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                ", friend=" + friend +
                '}';
    }

    //重写克隆方法
    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return sheep;
    }

    //getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
