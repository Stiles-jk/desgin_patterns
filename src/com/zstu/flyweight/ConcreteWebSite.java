package com.zstu.flyweight;

/**
 * @auther Stiles-JKY
 * @date 2020/5/2-17:20
 */
public class ConcreteWebSite extends WebSite {
    private String type = "";//网站的发布形式

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为:" + type + " 在使用中 .. 使用者是" + user.getName());
    }
}
