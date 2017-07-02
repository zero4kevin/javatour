package com.zero4kevin.desginPatterns.CommandPattern;

/**
 * Created by kevin on 7/2/17.
 */
public class GarageDoorUpCommand implements Command {
    GarageDoor door;

    public GarageDoorUpCommand(GarageDoor door) {
        this.door = door;
    }

    public void execute() {
        door.up();
    }
}
