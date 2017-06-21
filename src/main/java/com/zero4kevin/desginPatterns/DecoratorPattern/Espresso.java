package com.zero4kevin.desginPatterns.DecoratorPattern;

/**
 * Created by xi1zhang on 2017/6/21.
 */
public class Espresso extends Beverage {
    public Espresso(){
        description="Espresso";
    }

    public double cost(){
        return 1.99;
    }
}
