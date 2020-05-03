package com.zstu.prototype;

/**
 * @auther Stiles-JKY
 * @date 2020/4/30-20:12
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("prototype : get clone object");

        Sheep sheep = new Sheep("tom",1,"write");
        sheep.friend = new Sheep("jack",2,"black");

        Sheep sheep2 = (Sheep)sheep.clone(); //克隆
        Sheep sheep3 = (Sheep)sheep.clone(); //克隆
        Sheep sheep4 = (Sheep)sheep.clone(); //克隆
        Sheep sheep5 = (Sheep)sheep.clone(); //克隆
        System.out.println(sheep.hashCode());
        System.out.println("sheep2 =" + sheep2 + "sheep2.friend=" + sheep2.hashCode());
        System.out.println("sheep3 =" + sheep3 + "sheep3.friend=" + sheep3.friend.hashCode());
        System.out.println("sheep4 =" + sheep4 + "sheep4.friend=" + sheep4.friend.hashCode());
        System.out.println("sheep5 =" + sheep5 + "sheep5.friend=" + sheep5.friend.hashCode());
    }
}
