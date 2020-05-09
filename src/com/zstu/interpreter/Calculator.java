package com.zstu.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-11:03
 */
public class Calculator {

    private Expression expression;

    //得到最后的表达式expression
    public Calculator(String str) {
        //安排运算先后顺序
        Stack<Expression> eStack = new Stack<>();
        //表达式拆分成字符数组
        char[] chars = str.toCharArray();

        Expression left = null;
        Expression right = null;

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+' :
                    left = eStack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    eStack.push((new AddExpression(left,right)));//将addExpression压入eStack
                    break;
                case '-':
                    left = eStack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    eStack.push(new SubExpression(left,right));
                    break;
                default:
                    //如果为字母，就将该字母创建为VarExpression
                    VarExpression varExpression = new VarExpression(String.valueOf(chars[i]));
                    eStack.push(varExpression);
                    break;
            }
        }

        //得到最后的Expression
        this.expression = eStack.pop();

    }

    public int run(HashMap<String,Integer> var) {
        //传递给expression的interpreter进行解释执行
        return this.expression.interpreter(var);
    }

}
