package com.zero4kevin.desginPatterns.DecoratorPattern;

/**
 * Created by xi1zhang on 2017/6/21.
 */
public abstract class Beverage {
    String description="Default description";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
