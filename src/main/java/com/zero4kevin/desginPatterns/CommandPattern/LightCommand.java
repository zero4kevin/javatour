package com.zero4kevin.desginPatterns.CommandPattern;

/**
 * Created by kevin on 7/1/17.
 */
public class LightCommand implements Command {
    Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        if(light.isLightOn()){
            light.lightOff();
        }else{
            light.lightOn();
        }
    }
}
