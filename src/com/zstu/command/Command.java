package com.zstu.command;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-14:34
 */
public interface Command {
    //执行动作
    public void execute();

    //撤销动作
    public void undo();
}
