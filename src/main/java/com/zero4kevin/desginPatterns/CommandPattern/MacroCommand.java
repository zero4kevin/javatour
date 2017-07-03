package com.zero4kevin.desginPatterns.CommandPattern;

/**
 * Created by xi1zhang on 2017/7/3.
 */
public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    public void execute() {
        for (int i=0; i< commands.length; i++){
            commands[i].execute();
        }
    }

    public void undo() {
        for (int i=0; i< commands.length; i++){
            commands[i].undo();
        }
    }
}
