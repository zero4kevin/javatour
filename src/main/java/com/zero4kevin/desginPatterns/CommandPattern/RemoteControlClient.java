package com.zero4kevin.desginPatterns.CommandPattern;

/**
 * Created by kevin on 7/1/17.
 */
public class RemoteControlClient {
    public static void main(String[] args){
        SimpleRemoteControl remoteControl= new SimpleRemoteControl();
        Light light=new Light();
        LightCommand lightCommand=new LightCommand(light);

        GarageDoor garageDoor=new GarageDoor();
        GarageDoorCommand garageDoorCommand=new GarageDoorCommand(garageDoor);

        remoteControl.setCommand(garageDoorCommand);
        remoteControl.buttonWasPressed();
        remoteControl.setCommand(lightCommand);
        remoteControl.buttonWasPressed();
        remoteControl.buttonWasPressed();
        remoteControl.setCommand(garageDoorCommand);
        remoteControl.buttonWasPressed();

//        a new example starts from here.
        RemoteControl remoteController= new RemoteControl();
        Light livingRoomLight=new Light("Living room ");
        Light kitchenRoomLight=new Light("Kitchen");
        CeilingFan ceilingFan= new CeilingFan("Living room");
        garageDoor=new GarageDoor();
        Stereo stereo=new Stereo("Living room");

        LightOnCommand livingRoomLightOn= new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff= new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenRoomLightOn= new LightOnCommand(kitchenRoomLight);
        LightOffCommand kitchenRoomLightOff= new LightOffCommand(kitchenRoomLight);

        CeilingFanOnCommand ceilingFanOn= new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff= new CeilingFanOffCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh= new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium=new CeilingFanMediumCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp= new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown= new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD= new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff= new StereoOffCommand(stereo);

        remoteController.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteController.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
        remoteController.setCommand(2,ceilingFanHigh, ceilingFanOff);
        remoteController.setCommand(3,ceilingFanMedium,ceilingFanOff);
        remoteController.setCommand(4,stereoOnWithCD,stereoOff);

        System.out.println(remoteController);

        remoteController.onButtonWasPressed(0);
        remoteController.onButtonWasPressed(1);
        remoteController.offButtonWasPressed(1);
        remoteController.offButtonWasPressed(0);
        remoteController.undoButtonWasPushed();

    }
}
