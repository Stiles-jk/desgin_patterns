package com.zstu.proxy_pattern.static_proxy;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-9:18
 */
public class TeacherDaoProxy implements ITeacherDao {
    private ITeacherDao target; // 目标对象，通过接口来聚合

    //构造器
    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("proxy TeacherDao");
        target.teach();
        System.out.println("proxy complete");
    }
}
