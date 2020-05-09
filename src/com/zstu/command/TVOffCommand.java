package com.zstu.command;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-14:44
 */
public class TVOffCommand implements Command {
    TVReceiver TV;

    public TVOffCommand(TVReceiver TV) {
        this.TV = TV;
    }

    @Override
    public void execute() {
        TV.off();
    }

    @Override
    public void undo() {
        TV.on();
    }
}
