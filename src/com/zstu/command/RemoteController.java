package com.zstu.command;

/**
 * 用来承装命令对象
 *
 * @auther Stiles-JKY
 * @date 2020/5/8-14:55
 */
public class RemoteController {

    Command[] onCommands;
    Command[] offCommands;

    // 执行撤销的命令
    Command undoCommand;
    /**
     * constructor
     */
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        //提供空实现
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * add the command to this remote Controller
     * @param num
     * @param onCommand
     * @param offCommand
     */
    public void addCommand(int num,Command onCommand,Command offCommand) {
        this.offCommands[num] = offCommand;
        this.onCommands[num] = onCommand;
    }

    public void putOnCommand(int num) {
        onCommands[num].execute();
        this.undoCommand = onCommands[num];
    }

    public void putOffCommand(int num) {
        offCommands[num].execute();
        this.undoCommand = offCommands[num];
    }

    public void undoCommand() {
        this.undoCommand.undo();
    }

}
