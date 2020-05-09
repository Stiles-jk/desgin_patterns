package com.zstu.responsibility_chain;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-15:54
 */
public class Client {

    public static void main(String[] args) {
        //创建请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 6000, 3);
        PurchaseRequest purchaseRequest2 = new PurchaseRequest(2, 99000, 1);
        //创建接收对象并形成环状
        DepartmentApprove departmentApprove = new DepartmentApprove("张主任");
        CollegeApprove collegeApprove = new CollegeApprove("李院长");
        ViceSchoolMaster viceSchoolMasterApprove = new ViceSchoolMaster("王副校");
        SchoolMasterApprove schoolMasterApprove = new SchoolMasterApprove("佟校长");

        departmentApprove.setApprove(collegeApprove);
        collegeApprove.setApprove(viceSchoolMasterApprove);
        viceSchoolMasterApprove.setApprove(schoolMasterApprove);
        schoolMasterApprove.setApprove(departmentApprove);

        departmentApprove.processRequest(purchaseRequest);
        departmentApprove.processRequest(purchaseRequest2);

    }
}
