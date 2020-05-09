package com.zstu.template;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-14:04
 */
public class Client {

    public static void main(String[] args) {
        SoyMilk blackBeanSoyMilk = new BlackBeanSoyMilk();
        blackBeanSoyMilk.make();

        SoyMilk soy = new Soy();
        soy.make();
    }
}
