package com.zero4kevin.desginPatterns.CommandPattern;

/**
 * Created by xi1zhang on 2017/7/3.
 */
public class CeilingFanHighCommand implements Command {
    private CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        prevSpeed=ceilingFan.getSpeed();
        ceilingFan.high();
    }

    public void undo() {
        ceilingFan.setSpeed(prevSpeed);
    }
}
