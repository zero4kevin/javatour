package com.zero4kevin.desginPatterns.DecoratorPattern;

/**
 * Created by xi1zhang on 2017/6/21.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }

    public String getDescription(){
        return beverage.getDescription()+", Mocha";
    }

    public double cost(){
        return .29 + beverage.cost();
    }
}
