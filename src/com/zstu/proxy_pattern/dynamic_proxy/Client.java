package com.zstu.proxy_pattern.dynamic_proxy;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-9:44
 */
public class Client {

    public static void main(String[] args) {
        ITeacherDao target = new TeacherDao();

        ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();

        System.out.println("proxyInstance= " + proxyInstance.getClass());

//        proxyInstance.teach();//通过代理对象调用目标对象的方法
        proxyInstance.sayHello("jack");
    }
}
