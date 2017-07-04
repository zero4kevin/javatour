package com.zero4kevin.desginPatterns.CommandPattern;

//import org.apache.commons.lang3.StringUtils;

/**
 * Created by kevin on 7/2/17.
 */
public class Stereo {
    private int volume=5;
    private String room;

    public Stereo() {
    }

    public Stereo(String room) {
        this.room = room;
    }

    public void on(){
//        if(StringUtils.isEmpty(room)){
//            System.out.println("The stereo is playing");
//        }else{
            System.out.println("The "+ room +" stereo is playing");
//        }
    }

    public void off(){
//        if(StringUtils.isEmpty(room)){
//            System.out.println("The stereo is stop");
//        }else{
            System.out.println("The "+ room +" stereo is stop");
//        }
    }

    public void setCd() {System.out.println("The play mode is CD");}

    public void setDvd(){
        System.out.println("The play mode is radio");
    }

    public void setVolume(int volume){
        if(volume<=0){
            this.volume=0;
            System.out.println("The stereo is muted");
        }else if (volume >= 12){
            this.volume=12;
            System.out.println("The play volume is set max");
        }else{
            this.volume=volume;
            System.out.println("The play volume is set as" + volume);
        }
    }

    public int getVolume(){
        return volume;
    }
}
