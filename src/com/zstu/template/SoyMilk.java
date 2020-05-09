package com.zstu.template;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-13:55
 */
public abstract class SoyMilk {

    final void make() {
        select();
        if (customerWantCondiment()) {
            addBurdening();
        }
        soak();
        beat();
    }

    void select() {
        System.out.println("choose SoyBean");
    }

    abstract void addBurdening();

    void soak() {
        System.out.println("soak bean");
    }

    void beat() {
        System.out.println("beat bean");
    }

    //hook
    boolean customerWantCondiment() {
        return true;
    }
}
