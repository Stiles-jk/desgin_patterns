package com.zstu.command;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-14:42
 */
public class LightOnCommand implements Command {
    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
