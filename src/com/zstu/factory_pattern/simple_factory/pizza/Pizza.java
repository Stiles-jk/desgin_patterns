package com.zstu.factory_pattern.simple_factory.pizza;

/**
 * @auther Stiles-JKY
 * @date 2020/4/23-0:07
 */
public abstract class Pizza {
    protected String name;



    //准备原材料, 不同的披萨不一样，因此，我们做成抽象方法
    public abstract void prepare();

    //烘烤
    public void bake() {
        System.out.println(name + " baking;");
    }

    //切
    public void cut() {
        System.out.println(name + " cutting;");
    }

    //打包
    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}



