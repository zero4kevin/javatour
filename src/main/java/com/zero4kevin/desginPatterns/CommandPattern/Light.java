package com.zero4kevin.desginPatterns.CommandPattern;

//import org.apache.commons.lang3.StringUtils;

import com.zero4kevin.Utils.Strings;

/**
 * Created by kevin on 7/1/17.
 */
public class Light {
    private boolean lightOn=false;
    private String string;

    private String lightIsOn="light is on";
    private String lightIsOff="light is off";

    public Light(){}

    public Light(String string){
        this.string=string;

    }

    public void lightOn(){
//        if(StringUtils.isEmpty(string)) {
//            System.out.println(Strings.captilizeFirstLetter(lightIsOn));
//        }else {
//            System.out.println(string + " " +lightIsOn);
//        }
//        lightOn = true;
    }

    public void lightOff(){
//        if(StringUtils.isEmpty(string)){
        if(true){
            System.out.println(Strings.captilizeFirstLetter(lightIsOff));
        }else{
            System.out.println(string + " " + lightIsOff);

        }
        lightOn=false;
    }

    public boolean isLightOn(){
        return lightOn;
    }
}
