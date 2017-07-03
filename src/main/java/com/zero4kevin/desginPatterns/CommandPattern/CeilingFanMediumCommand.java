package com.zero4kevin.desginPatterns.CommandPattern;

/**
 * Created by xi1zhang on 2017/7/3.
 */
public class CeilingFanMediumCommand implements Command {
    private CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        prevSpeed=ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    public void undo() {
        ceilingFan.setSpeed(prevSpeed);
    }
}
