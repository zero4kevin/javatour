package com.zero4kevin.desginPatterns.CommandPattern;

/**
 * Created by kevin on 7/1/17.
 */
public class Door {
    private boolean doorOpen=false;

    public void up(){
        System.out.println("Garage door is opening.");
        doorOpen=true;
    }

    public void down(){
        System.out.println("Garage door is closing.");
        doorOpen=false;
    }

    public void stop(){
        System.out.println("Garage door is stop");
    }

    public boolean isDoorOpen(){
        return doorOpen;
    }
}

