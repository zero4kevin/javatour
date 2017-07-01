package com.zero4kevin.desginPatterns.CommandPattern;

/**
 * Created by kevin on 7/1/17.
 */
public class RemoteControlClient {
    public static void main(String[] args){
        SimpleRemoteControl remoteControl= new SimpleRemoteControl();
        Light light=new Light();
        LightCommand lightCommand=new LightCommand(light);

        Door garageDoor=new Door();
        GarageDoorCommand garageDoorCommand=new GarageDoorCommand(garageDoor);

        remoteControl.setCommand(garageDoorCommand);
        remoteControl.buttonWasPressed();
        remoteControl.setCommand(lightCommand);
        remoteControl.buttonWasPressed();
        remoteControl.buttonWasPressed();
        remoteControl.setCommand(garageDoorCommand);
        remoteControl.buttonWasPressed();


    }
}
