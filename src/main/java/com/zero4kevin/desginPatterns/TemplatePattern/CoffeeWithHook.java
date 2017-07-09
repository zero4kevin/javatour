package com.zero4kevin.desginPatterns.TemplatePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kevin on 7/9/17.
 */
public class CoffeeWithHook extends Coffee {
    @Override
    public boolean customerWantsCondiments() {
        String answer=getUserInput();
        if(answer.toLowerCase().equals("y")||answer.toLowerCase().equals("yes")){
            return true;
        }else{
            return false;
        }
    }

    private String getUserInput() {
        String answer=null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)?");
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        try{
            answer =in.readLine();
        }catch(IOException e){
            System.err.println("IO error trying to read your answer");
        }
        if(answer==null){
            return "no";
        }
        return answer;
    }
}
