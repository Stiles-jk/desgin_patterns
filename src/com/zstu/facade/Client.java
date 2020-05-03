package com.zstu.facade;

/**
 * @auther Stiles-JKY
 * @date 2020/5/2-16:47
 */
public class Client {
    public static void main(String[] args) {
        //使用facade提供的接口进行调用
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();


        homeTheaterFacade.end();
    }
}
