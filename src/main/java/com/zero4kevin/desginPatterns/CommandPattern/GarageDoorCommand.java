package com.zero4kevin.desginPatterns.CommandPattern;

/**
 * Created by kevin on 7/1/17.
 */
public class GarageDoorCommand implements Command {
    private GarageDoor door;

    public GarageDoorCommand(GarageDoor door) {
        this.door = door;
    }

    public void execute() {
        if(door.isDoorOpen()){
            door.down();
        }else{
            door.up();
        }
    }

    public void undo() {
        this.execute();
    }
}
