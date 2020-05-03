package com.zstu.composite;

/**
 * @auther Stiles-JKY
 * @date 2020/5/2-15:20
 */
public class Client {

    public static void main(String[] args) {
        OrganizationComponent university = new University("浙江理工大学","zstu");

        OrganizationComponent college = new College("机械与自动控制学院","mechine");
        OrganizationComponent college2 = new College("信息工程学院", " 信息工程学院 ");

        OrganizationComponent department = new Department("机械电子","lxm");
        OrganizationComponent department2 = new Department("农机","jky");

        college.add(department);
        college.add(department2);

        university.add(college);
        university.add(college2);

        university.print();
    }
}
