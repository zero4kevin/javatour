package com.zero4kevin.desginPatterns.AdapterPattern;

/**
 * Created by xi1zhang on 2017/7/4.
 */
public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
