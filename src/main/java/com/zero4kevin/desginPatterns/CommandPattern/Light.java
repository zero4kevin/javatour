package com.zero4kevin.desginPatterns.CommandPattern;

/**
 * Created by kevin on 7/1/17.
 */
public class Light {
    private boolean lightOn=false;

    public void lightOn(){
        System.out.println("Light is on");
        lightOn=true;
    }

    public void lightOff(){
        System.out.println("Light is off");
        lightOn=false;
    }

    public boolean isLightOn(){
        return lightOn;
    }
}
