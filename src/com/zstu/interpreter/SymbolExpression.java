package com.zstu.interpreter;

import java.util.HashMap;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-12:25
 */
public class SymbolExpression extends Expression {

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
