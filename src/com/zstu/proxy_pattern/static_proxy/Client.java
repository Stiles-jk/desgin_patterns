package com.zstu.proxy_pattern.static_proxy;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-9:22
 */
public class Client {
    public static void main(String[] args) {
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(new TeacherDao());
        teacherDaoProxy.teach();
    }
}
