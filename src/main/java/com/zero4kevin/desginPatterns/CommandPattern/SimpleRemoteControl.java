package com.zero4kevin.desginPatterns.CommandPattern;

/**
 * Created by kevin on 7/1/17.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){}

    public void setCommand(Command command){
        slot=command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
