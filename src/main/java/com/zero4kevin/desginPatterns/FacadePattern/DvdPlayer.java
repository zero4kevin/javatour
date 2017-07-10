package com.zero4kevin.desginPatterns.FacadePattern;

/**
 * Created by xi1zhang on 2017/7/5.
 */
public class DvdPlayer {
    public void on(){

    }

    public void off(){

    }

    public void play(String string){
        System.out.println("The dvd player starts to play "+ string);
    }

    public void stop(){
        System.out.println("The dvd player is stopped");
    }

    public void eject(){
        System.out.println("The dvd is ejected");
    }
}
