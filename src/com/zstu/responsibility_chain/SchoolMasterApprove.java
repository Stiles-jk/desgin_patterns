package com.zstu.responsibility_chain;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-16:43
 */
public class SchoolMasterApprove extends Approve {
    public SchoolMasterApprove(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getPrice() > 30000) {
            System.out.println(" 请求编号 id= " + request.getId() + " 被 " + this.name + " 处理");
        }else {
            super.nextApprove.processRequest(request);
        }
    }
}
