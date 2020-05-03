package com.zstu.adapter.interface_adpater;

/**
 * @auther Stiles-JKY
 * @date 2020/5/1-21:56
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void m1() {
                super.m1();
                System.out.println("使用了m1方法");
            }

            @Override
            public void m2() {
            }

            @Override
            public void m3() {
            }

            @Override
            public void m4() {
            }
        };

        absAdapter.m1();
    }
}
