package com.zstu.memento;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-9:21
 */
public class GameRole {
    private int vit;
    private int def;

    //显示当前游戏状态
    public void show() {
        System.out.println("vit :" + vit + "def :" + def);
    }

    //创建备忘录对象
    public Memento createMemento() {
        return new Memento(this.vit, this.def);
    }

    public void getMemento(Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
