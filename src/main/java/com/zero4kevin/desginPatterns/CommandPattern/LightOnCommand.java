package com.zero4kevin.desginPatterns.CommandPattern;

/**
 * Created by kevin on 7/2/17.
 */
public class LightOnCommand implements Command{
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.lightOn();
    }
}
