package com.zstu.prototype.deepclone;

import java.io.*;

/**
 * @auther Stiles-JKY
 * @date 2020/4/30-22:55
 */
public class DeepProtoType implements Serializable, Cloneable {

    public String name;
    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
        super();
    }

    //使用clone的方式进行深拷贝

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;

        deep = super.clone();//对基本类型进行克隆
        //对引用类型进行克隆
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }

    //使用对象序列化实现克隆
    public Object deepClone() {

        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);//将当前对象以对象流的方式输出

            //返序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();
            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
