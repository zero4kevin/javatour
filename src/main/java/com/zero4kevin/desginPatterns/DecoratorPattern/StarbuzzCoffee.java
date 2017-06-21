package com.zero4kevin.desginPatterns.DecoratorPattern;

/**
 * Created by xi1zhang on 2017/6/21.
 */
public class StarbuzzCoffee {
    public static void main(String[] args){
        Beverage beverage=new Espresso();
        System.out.println(beverage.getDescription() + " is " + beverage.cost());

        beverage=new HouseBlend();
        beverage=new Mocha(beverage);
        beverage=new Mocha(beverage);
        System.out.println(beverage.getDescription() + " is "+ beverage.cost());

    }

}
