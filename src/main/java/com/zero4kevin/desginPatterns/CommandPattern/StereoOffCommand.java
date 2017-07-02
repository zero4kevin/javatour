package com.zero4kevin.desginPatterns.CommandPattern;

/**
 * Created by kevin on 7/2/17.
 */
public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }
}
