package com.zstu.command;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-14:47
 */
public class TVOnCommand implements Command {

    TVReceiver TV;

    public TVOnCommand(TVReceiver TV) {
        this.TV = TV;
    }

    @Override
    public void execute() {
        TV.on();
    }

    @Override
    public void undo() {
        TV.off();
    }
}
