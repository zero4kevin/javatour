package com.zero4kevin.desginPatterns.DecoratorPattern;

/**
 * Created by xi1zhang on 2017/6/21.
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description="House Blend Coffee";
    }

    public double cost(){
        return .89;
    }
}
