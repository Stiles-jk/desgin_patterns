package com.zstu.interpreter;

import java.util.HashMap;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-12:20
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {

        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
