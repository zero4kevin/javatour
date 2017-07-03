package com.zero4kevin.desginPatterns.CommandPattern;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by kevin on 7/2/17.
 */
public class CeilingFan {
    private String room;
    public static final int HIGH=3;
    public static final int MEDIAUM=2;
    public static final int LOW=1;
    public static final int OFF=0;
    int speed;

    public CeilingFan(){
        speed=OFF;
    }

    public CeilingFan(String string){
        speed=OFF;
        room = string;
    }

    public void high(){
        speed=HIGH;
        System.out.println("The speed of the fan is high");
    }

    public void medium(){
        speed=MEDIAUM;
        System.out.println("The speed of the fan is medium");
    }

    public void low(){
        speed=LOW;
        System.out.println("The speed of the fan is low");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void on(){
        printStatus("on");
    }

    public void off(){
        printStatus("off");
    }

    private void printStatus(String status) {
        if(StringUtils.isEmpty(room)){
            System.out.println("The fan is "+ status);
        }else{
            System.out.println("The "+ room + " is "+ status);
        }
    }
}
