package com.zero4kevin.desginPatterns.CommandPattern;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by kevin on 7/2/17.
 */
public class CeilingFan {
    private String room;


    public CeilingFan(){
    }

    public CeilingFan(String string){
        room = string;
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
