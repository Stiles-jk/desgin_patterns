package com.zstu.responsibility_chain;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-16:34
 */
public class DepartmentApprove extends Approve {

    public DepartmentApprove(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        //可以处理就处理请求，否则转发
        if (request.getPrice() <= 5000f) {
            System.out.println(" 请求编号 id= " + request.getId() + " 被 " + this.name + " 处理");

        } else {
            nextApprove.processRequest(request);
        }
    }
}
