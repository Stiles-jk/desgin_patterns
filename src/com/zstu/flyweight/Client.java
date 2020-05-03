package com.zstu.flyweight;

/**
 * @auther Stiles-JKY
 * @date 2020/5/2-17:24
 */
public class Client {
    public static void main(String[] args) {
        //创建web工厂
        WebSiteFactory factory = new WebSiteFactory();
        WebSite webSite = factory.getWebSiteCategory("新闻");

        webSite.use(new User("tom"));

        // 客户要一个以博客形式发布的网站
        WebSite webSite2 = factory.getWebSiteCategory("博客");

        webSite2.use(new User("jack"));

        // 客户要一个以博客形式发布的网站
        WebSite webSite3 = factory.getWebSiteCategory("博客");

        webSite3.use(new User("smith"));

        // 客户要一个以博客形式发布的网站
        WebSite webSite4 = factory.getWebSiteCategory("博客");

        webSite4.use(new User("king"));

        System.out.println("网站的分类共=" + factory.getWebSiteCount());
    }
}
