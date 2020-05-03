package com.zstu.prototype.deepclone;

import java.io.Serializable;

/**
 * @auther Stiles-JKY
 * @date 2020/4/30-22:51
 */
public class DeepCloneableTarget implements Cloneable , Serializable {
    private static final long serialVersionUID = 1L;
    private String cloneName;
    private String cloneClass;

    //constructor
    public DeepCloneableTarget(String cloneName,String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneName;
    }

    //由于都是基本数据类型，则使用默认的clone方法就可以了
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
