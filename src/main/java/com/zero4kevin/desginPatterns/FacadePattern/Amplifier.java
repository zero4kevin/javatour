package com.zero4kevin.desginPatterns.FacadePattern;

import com.zero4kevin.desginPatterns.AdapterPattern.Turkey;

/**
 * Created by xi1zhang on 2017/7/5.
 */
public class Amplifier {
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;

    private int volume=5;

    public void on(){
        System.out.println("The amplifier is on");
    }

    public void off(){
        System.out.println("The amplifier is on");
    }

    public void setCd(CdPlayer cdPlayer){
        this.cdPlayer=cdPlayer;
    }

    public void setDvd(DvdPlayer dvdPlayer){
        this.dvdPlayer=dvdPlayer;
    }

    public void setStereoSound(){

    }

    public void setSurroundSound(){

    }

    public void setTuner(Tuner tuner){
        this.tuner=tuner;
    }

    public void setVolume(int volume){
        this.volume=volume;
    }
}

