package com.zero4kevin.desginPatterns.CommandPattern;

import java.util.Random;

/**
 * Created by kevin on 7/2/17.
 */
public class StereoOnWithCDCommand implements Command{
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(new Random().nextInt(13));
    }

    public void undo() {
        stereo.off();
    }
}
