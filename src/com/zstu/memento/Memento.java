package com.zstu.memento;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-9:21
 */
public class Memento {
    private int vit;
    private int def;

    public Memento(int vit, int def) {
        this.vit = vit;
        this.def = def;
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
