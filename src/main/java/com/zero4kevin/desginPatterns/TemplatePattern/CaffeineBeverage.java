package com.zero4kevin.desginPatterns.TemplatePattern;

/**
 * Created by kevin on 7/9/17.
 */
public abstract class CaffeineBeverage {
    final void prepare(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments())
            addCondiments();
    }

    abstract void addCondiments();
    abstract void brew();

    boolean customerWantsCondiments() {
        return true;
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }

}
