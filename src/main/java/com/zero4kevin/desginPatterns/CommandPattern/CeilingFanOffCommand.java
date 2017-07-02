package com.zero4kevin.desginPatterns.CommandPattern;

/**
 * Created by kevin on 7/2/17.
 */
public class CeilingFanOffCommand implements Command {
    CeilingFan fan;

    public CeilingFanOffCommand(CeilingFan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.off();
    }
}
