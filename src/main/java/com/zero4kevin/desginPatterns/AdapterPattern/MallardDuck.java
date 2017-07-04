package com.zero4kevin.desginPatterns.AdapterPattern;

/**
 * Created by xi1zhang on 2017/7/4.
 */
public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I'm flying");
    }
}

