package com.zero4kevin.desginPatterns.CommandPattern;

/**
 * Created by kevin on 7/1/17.
 */
public class GarageDoorCommand implements Command {
    private Door door;

    public GarageDoorCommand(Door door) {
        this.door = door;
    }

    public void execute() {
        if(door.isDoorOpen()){
            door.down();
        }else{
            door.up();
        }
    }
}
