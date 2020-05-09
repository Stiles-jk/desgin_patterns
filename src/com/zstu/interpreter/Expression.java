package com.zstu.interpreter;

import java.util.HashMap;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-11:33
 */
public abstract class Expression {

    // a + b - c
    // 解释公式和数值, key 就是公式(表达式) 参数[a,b,c], value就是就是具体值
    // HashMap {a=10, b=20}
    public abstract int interpreter(HashMap<String,Integer> var);

}
