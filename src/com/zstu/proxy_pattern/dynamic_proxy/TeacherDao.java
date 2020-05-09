package com.zstu.proxy_pattern.dynamic_proxy;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-9:32
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("teaching....");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}
