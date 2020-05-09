package com.zstu.interpreter;

import java.util.HashMap;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-12:34
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    // var 就是{a=10, b=20}
    // interpreter 根据 变量名称，返回对应值
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
