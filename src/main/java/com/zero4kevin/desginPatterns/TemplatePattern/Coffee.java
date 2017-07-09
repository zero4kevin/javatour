package com.zero4kevin.desginPatterns.TemplatePattern;

/**
 * Created by kevin on 7/9/17.
 */
public class Coffee extends CaffeineBeverage {
    void addCondiments() {
        System.out.println("Adding Suga and Milk");
    }

    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

}
