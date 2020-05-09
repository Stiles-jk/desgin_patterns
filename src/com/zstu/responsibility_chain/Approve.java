package com.zstu.responsibility_chain;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-16:26
 */
public abstract class Approve {

    protected Approve nextApprove;//下一个处理者
    protected String name;//当前处理者名字

    public Approve(String name) {
        this.name = name;
    }

    //设置下一个处理者
    public void setApprove(Approve nextApprove) {
        this.nextApprove = nextApprove;
    }

    //处理请求
    public abstract void processRequest(PurchaseRequest request);
}
