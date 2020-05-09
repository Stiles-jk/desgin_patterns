package com.zstu.command;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-14:32
 */
public class Client {

    public static void main(String[] args) {

        LightReceiver light = new LightReceiver();
        RemoteController controller = new RemoteController();

        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        controller.addCommand(0,lightOnCommand,lightOffCommand);
        controller.putOnCommand(0);

        TVReceiver TV = new TVReceiver();
        TVOnCommand tvOnCommand = new TVOnCommand(TV);
        TVOffCommand tvOffCommand = new TVOffCommand(TV);

        controller.addCommand(1,tvOnCommand,tvOffCommand);
        controller.putOnCommand(1);
    }
}
