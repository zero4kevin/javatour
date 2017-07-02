package com.zero4kevin.desginPatterns.CommandPattern;

/**
 * Created by kevin on 7/2/17.
 */
public class CeilingFanOnCommand implements Command {
    CeilingFan fan;

    public CeilingFanOnCommand(CeilingFan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.on();
    }
}
