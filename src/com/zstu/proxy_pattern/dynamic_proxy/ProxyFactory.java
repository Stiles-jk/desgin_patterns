package com.zstu.proxy_pattern.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-9:30
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象生成一个代理对象
    public Object getProxyInstance() {
        /*
            public static Object newProxyInstance(ClassLoader loader,
                                                  Class<?>[] interfaces,
                                                  InvocationHandler h)
            1. ClassLoader loader：指定挡墙目标对象使用的类加载器，获取加载器的方法固定
            2. Class<?> interfaces：目标对象事项的接口类型，使用泛型方法确定类型
            3. InvocationHandler h ：执行目标对象的方法时，会触发事情处理器方法，会把当前执行的目标对象方法作为参数传入

         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK Proxy");
                        //使用反射机制调用目标对象的方法
                        Object returnVar = method.invoke(target,args);//使用method进入target中的方法内
                        System.out.println("JDK Proxy complete");
                        return returnVar;
                    }
                });
    }
}
