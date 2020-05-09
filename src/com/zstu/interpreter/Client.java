package com.zstu.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-11:03
 */
public class Client {

    public static void main(String[] args) throws IOException {
        String expStr = getStr();
        HashMap<String,Integer> var = getValue(expStr);//通过用户输入得到字母对应的值
        Calculator calculator = new Calculator(expStr);//得到解释器模型
        System.out.println("this expression's result = " + calculator.run(var));
    }

    public static String getStr() throws IOException {
        System.out.println("enter your expression");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    public static HashMap<String,Integer> getValue(String expStr) throws IOException {

        HashMap<String,Integer> map = new HashMap<>();

        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                if (!map.containsKey(String.valueOf(ch))) {
                    System.out.print("请输入" + String.valueOf(ch) + "的值：");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }

        return map;
    }
}
