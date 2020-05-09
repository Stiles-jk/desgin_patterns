package com.zstu.proxy_pattern.static_proxy;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-9:12
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("proxied teach instance");
    }
}
