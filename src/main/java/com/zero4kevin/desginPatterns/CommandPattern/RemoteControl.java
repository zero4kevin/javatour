package com.zero4kevin.desginPatterns.CommandPattern;

/**
 * Created by kevin on 7/1/17.
 */
public class RemoteControl {
    Command[] onCommands, offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands=new Command[7];
        offCommands =new Command[7];
        Command noCommand=new NoCommand();
        for (int i=0;i<7;i++){
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
        undoCommand=noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }

    public void onButtonWasPressed(int slot){
        onCommands[slot].execute();
        undoCommand=onCommands[slot];
    }

    public void offButtonWasPressed(int slot){
        offCommands[slot].execute();
        undoCommand=offCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.execute();
    }

    public String toString() {
        StringBuffer buffer=new StringBuffer();
        buffer.append("\n------ Remote Control ------\n");
        for (int i=0; i< onCommands.length;i++){
            buffer.append("[slot "+ i +"]" + onCommands[i].getClass().getName() +"   "+ offCommands[i].getClass().getName()+"\n");
        }
        return buffer.toString();
    }
}
