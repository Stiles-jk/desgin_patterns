package com.zstu.command;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-14:40
 */
public class LightOffCommand implements Command {

    //聚合LightReceiver
    LightReceiver light;

    //construct
    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }

}
