package com.zstu.bridge;

/**
 * @auther Stiles-JKY
 * @date 2020/5/1-23:58
 */
public class FoldedPhone extends Phone {

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println(" 折叠样式手机 ");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println(" 折叠样式手机 ");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println(" 折叠样式手机 ");
    }
}
