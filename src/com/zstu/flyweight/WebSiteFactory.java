package com.zstu.flyweight;

import java.util.HashMap;

/**
 * @auther Stiles-JKY
 * @date 2020/5/2-17:22
 */
public class WebSiteFactory {

    private HashMap<String,ConcreteWebSite> webPool = new HashMap<>();

    public WebSite getWebSiteCategory(String type) {
        if (!webPool.containsKey(type)) {
            webPool.put(type,new ConcreteWebSite(type));
        }

        return webPool.get(type);
    }

    //获取网站分类的总数 (池中有多少个网站类型)
    public int getWebSiteCount() {
        return webPool.size();
    }
}
